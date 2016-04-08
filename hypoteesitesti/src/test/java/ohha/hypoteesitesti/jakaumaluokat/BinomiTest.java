package ohha.hypoteesitesti.jakaumaluokat;

import java.text.DecimalFormat;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class BinomiTest {

    public BinomiTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void testBinominPtnfTuottaaOikeitaArvoja() {
        Binomi binomi = new Binomi();

        DecimalFormat df = new DecimalFormat("#.###");

        assertEquals("0.049", df.format(binomi.ptnf(150, 40, 0.3)));
        
        assertTrue(0 == (int) binomi.ptnf(985, 984, 0.1));
        assertTrue(0 == (int) binomi.ptnf(1000, 990, 0.99));

    }

    @Test
    public void testBinominPtnfHuomaaVaaratSyotot() {
        Binomi binomi = new Binomi();
        
        assertTrue(binomi.ptnf(0, 0, 0.5) == -1);
        assertTrue(binomi.ptnf(100, 101, 0.5) == -1);
        assertTrue(binomi.ptnf(10, -10, 0.5) == -1);
        assertTrue(binomi.ptnf(-10, 10, 0.5) == -1);
        assertTrue(binomi.ptnf(10, 2, 2) == -1);
        
    }

    @Test
    public void testBinomingetJakaumaPalauttaaOikeanArvon() {
        Binomi binomi = new Binomi();
        assertTrue(binomi.getjakaumaNumero() == 1);

    }

}

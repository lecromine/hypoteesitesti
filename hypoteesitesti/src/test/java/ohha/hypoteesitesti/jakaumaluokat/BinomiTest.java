package ohha.hypoteesitesti.jakaumaluokat;

import ohha.hypoteesitesti.AineistonSyottoLuokka;
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
    public void testBinomiTestiTuottaaOikeitaArvoja() {
        Binomi binomi = new Binomi();

        if (binomi.binomiTesti(100, 70, 0.5, 3) > 0.0001) {
            fail(binomi.binomiTesti(100, 70, 0.5, 3) + " >= " + 0.0001);
        }

        assertTrue(binomi.binomiTesti(985, 984, 0.1, 2) == 7.850139645593683E-5);
        assertTrue(binomi.binomiTesti(1000, 990, 0.99, 1) == 0.5427779092215662);

    }

    @Test
    public void testBinomiTestiHuomaaVaaratSyotot() {
        Binomi binomi = new Binomi();

        assertTrue(binomi.binomiTesti(0, 0, 0.5, 1) == -1);
        assertTrue(binomi.binomiTesti(100, 101, 0.5, 2) == -1);
        assertTrue(binomi.binomiTesti(10, -10, 0.5, 3) == -1);
        assertTrue(binomi.binomiTesti(-10, 10, 0.5, 1) == -1);
        assertTrue(binomi.binomiTesti(10, 2, 2, 2) == -1);
        assertTrue(binomi.binomiTesti(10, 1, 0.2, 5) == -1);
        assertTrue(binomi.binomiTesti(10, 1, 0.2, -200) == -1);
        assertTrue(binomi.binomiTesti(10, 1, 0.2, 0) == -1);
        
    }

    @Test
    public void testBinomingetJakaumaPalauttaaOikeanArvon() {
        Binomi binomi = new Binomi();
        assertTrue(binomi.getjakaumaNumero() == 1);

    }

}

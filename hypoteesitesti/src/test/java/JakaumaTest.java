/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.text.DecimalFormat;
import ohha.hypoteesitesti.jakaumaluokat.Binomi;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Lecromine
 */
public class JakaumaTest {

    public JakaumaTest() {
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

    @Test

    public void testBinomiJakaumanArvotYksi() {

        Binomi binomi = new Binomi(100, 50, 0.5);

        assertTrue(100 == binomi.getn());
        assertTrue(50 == binomi.getk());
        assertTrue(0.5 == binomi.getp());
    }

    @Test
    public void testBinomiJakaumanPtnfYksi() {

        Binomi binomi = new Binomi(100, 50, 0.5);

        DecimalFormat df = new DecimalFormat("#.##");

        assertEquals("0.08", df.format(binomi.ptnf()));
    }

    @Test
    public void testBinomiJakaumanArvotKaksi() {
        Binomi binomi = new Binomi(1000, 990, 0.99);

        assertTrue(1000 == binomi.getn());
        assertTrue(990 == binomi.getk());
        assertTrue(0.99 == binomi.getp());

    }

    @Test
    public void testBinomiJakaumanPtnfKaksi() {
        Binomi binomi = new Binomi(1000, 990, 0.99);
        DecimalFormat df = new DecimalFormat("#.##");
        assertEquals("0.12", df.format(binomi.ptnf()));
    }
}

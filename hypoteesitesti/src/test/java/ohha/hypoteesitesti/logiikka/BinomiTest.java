/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ohha.hypoteesitesti.logiikka;

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

    @Test
    public void teeBinomiTestiTest1() {

        Binomi binomi = new Binomi();

        binomi.teeBinomiTesti(100, 64, 0.5, 3);

        double p = Math.round(binomi.parvo * 1000.0) / 1000.0;

        if (p != 0.007) {
            fail("p-arvo ei täsmää" + binomi.parvo);
        }

    }

    @Test
    public void teeBinomiTestiTest2() {

        Binomi binomi = new Binomi();

        if (binomi.teeBinomiTesti(100, 70, 0.5, 3) > 0.0001) {
            fail(binomi.teeBinomiTesti(100, 70, 0.5, 3) + " >= " + 0.0001);
        }
        
        if (binomi.teeBinomiTesti(100, 100, 0.5, 3) > 0.0001) {
            fail(binomi.teeBinomiTesti(100, 70, 0.5, 3) + " >= " + 0.0001);
        }
        
        if (binomi.teeBinomiTesti(100, 70, 1, 3) > 0.0001) {
            fail(binomi.teeBinomiTesti(100, 70, 0.5, 3) + " >= " + 0.0001);
        }        
        
    }
    
    @Test
    public void teeBinomiTestiTest3() {

        Binomi binomi = new Binomi();
                
        if (binomi.teeBinomiTesti(100, 70, 0, 3) > 0.0001) {
            fail(binomi.teeBinomiTesti(100, 70, 0.5, 3) + " >= " + 0.0001);
        }

        if (binomi.teeBinomiTesti(985, 984, 0.1, 1) != 0) {
            fail("luvut eivät täsmää " + binomi.teeBinomiTesti(985, 984, 0.1, 1));
        }

        if (binomi.teeBinomiTesti(1000, 990, 0.99, 1) != 0.5830408033011036) {
            fail("luvut eivät täsmää. parvo " + binomi.teeBinomiTesti(1000, 990, 0.99, 1));
        }

    }

    @Test
    public void BinomiTestiHuomaaVaaratSyotot() {

        Binomi binomi = new Binomi();

        assertTrue(binomi.teeBinomiTesti(0, 0, 0.5, 1) == -1);
        assertTrue(binomi.teeBinomiTesti(100, 101, 0.5, 2) == -1);
        assertTrue(binomi.teeBinomiTesti(10, -10, 0.5, 3) == -1);
        assertTrue(binomi.teeBinomiTesti(-10, 10, 0.5, 1) == -1);
        assertTrue(binomi.teeBinomiTesti(10, 2, 2, 2) == -1);
        assertTrue(binomi.teeBinomiTesti(10, 1, 0.2, 5) == -1);
        assertTrue(binomi.teeBinomiTesti(10, 1, 0.2, -200) == -1);
        assertTrue(binomi.teeBinomiTesti(10, 1, 0.2, 0) == -1);
        assertTrue(binomi.teeBinomiTesti(-10, -1, -0.2, -1) == -1);
        assertTrue(binomi.teeBinomiTesti(1, 0, 0.5, 1) != -1);
//        assertTrue(testaaja.teeDiskreettiTesti(1, 1, 0, 1) != -1);

    }
}

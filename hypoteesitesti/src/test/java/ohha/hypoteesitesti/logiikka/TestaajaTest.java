/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ohha.hypoteesitesti.logiikka;

import ohha.hypoteesitesti.logiikka.Testaaja;
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
public class TestaajaTest {

    public TestaajaTest() {
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
    public void testaajaTuottaaOikeitaArvojaBinomitestissa() {

        Testaaja testaaja = new Testaaja();

        testaaja.teeBinomiTesti(100, 64, 0.5, 3);

        double p = Math.round(testaaja.parvo * 1000.0) / 1000.0;

        if (p != 0.007) {
            fail("p-arvo ei täsmää");
        }

    }

    @Test
    public void BinomiTestiTuottaaOikeitaArvoja() {

        Testaaja testaaja = new Testaaja();

        if (testaaja.teeBinomiTesti(100, 70, 0.5, 3) > 0.0001) {
            fail(testaaja.teeBinomiTesti(100, 70, 0.5, 3) + " >= " + 0.0001);
        }
        
        if (testaaja.teeBinomiTesti(100, 100, 0.5, 3) > 0.0001) {
            fail(testaaja.teeBinomiTesti(100, 70, 0.5, 3) + " >= " + 0.0001);
        }
        
        if (testaaja.teeBinomiTesti(100, 70, 1, 3) > 0.0001) {
            fail(testaaja.teeBinomiTesti(100, 70, 0.5, 3) + " >= " + 0.0001);
        }
        
        if (testaaja.teeBinomiTesti(100, 70, 0, 3) > 0.0001) {
            fail(testaaja.teeBinomiTesti(100, 70, 0.5, 3) + " >= " + 0.0001);
        }

        double parvo = testaaja.teeBinomiTesti(985, 984, 0.1, 1);
        if (testaaja.teeBinomiTesti(985, 984, 0.1, 1) != 0) {
            fail("luvut eivät täsmää " + parvo);
        }

        parvo = testaaja.teeBinomiTesti(1000, 990, 0.99, 1);

        if (parvo != 0.5830408033011036) {
            fail("luvut eivät täsmää. parvo " + parvo);
        }

    }

    @Test
    public void BinomiTestiHuomaaVaaratSyotot() {

        Testaaja testaaja = new Testaaja();

        assertTrue(testaaja.teeBinomiTesti(0, 0, 0.5, 1) == -1);
        assertTrue(testaaja.teeBinomiTesti(100, 101, 0.5, 2) == -1);
        assertTrue(testaaja.teeBinomiTesti(10, -10, 0.5, 3) == -1);
        assertTrue(testaaja.teeBinomiTesti(-10, 10, 0.5, 1) == -1);
        assertTrue(testaaja.teeBinomiTesti(10, 2, 2, 2) == -1);
        assertTrue(testaaja.teeBinomiTesti(10, 1, 0.2, 5) == -1);
        assertTrue(testaaja.teeBinomiTesti(10, 1, 0.2, -200) == -1);
        assertTrue(testaaja.teeBinomiTesti(10, 1, 0.2, 0) == -1);
        assertTrue(testaaja.teeBinomiTesti(-10, -1, -0.2, -1) == -1);
        assertTrue(testaaja.teeBinomiTesti(1, 0, 0.5, 1) != -1);
//        assertTrue(testaaja.teeDiskreettiTesti(1, 1, 0, 1) != -1);

    }

    @Test
    public void teeDiskreettiTestiLukeeArvotOikeinJaHuomaaVirheet() {

        Testaaja testaaja = new Testaaja();

    }

    @Test
    public void testaateeNormaaliTesti() {

        Testaaja testaaja = new Testaaja();

        if ((testaaja.teeNormaaliTesti(19, 65, 13, 68, 10) != -1)) {
            fail(testaaja.teeNormaaliTesti(19, 65, 13, 68, 1) + "");
        }
    }

    @Test
    public void testaateeNormaaliTestiHuomaaVirhesyotot() {
        Testaaja testaaja = new Testaaja();
        
        assertTrue(testaaja.teeNormaaliTesti(10, 2, -0.25, 5, -1) == -1);
        assertTrue(testaaja.teeNormaaliTesti(-10, 2, 0.25, 5, 2) == -1);
        assertTrue(testaaja.teeNormaaliTesti(10, 0, 0.25, 5, 1) == -1);
        assertTrue(testaaja.teeNormaaliTesti(10, 2, 0.25, -5, 3) == -1);
        assertTrue(testaaja.teeNormaaliTesti(0, 2, 0.0, 5, 2) == -1);
        assertTrue(testaaja.teeNormaaliTesti(10, 2, 0.25, -5, 3) == -1);
        assertTrue(testaaja.teeNormaaliTesti(0, 0, 0.25, 0, 3) == -1);
//        assertTrue(testaaja.teeNormaaliTesti(100, 100, 0.25, -5, 3) == -1);

    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ohha.hypoteesitesti;

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
        Jakaumantyyppi jakaumantyyppi = new Jakaumantyyppi(1);
        Testaaja testaaja = new Testaaja(jakaumantyyppi);

        testaaja.teeDiskreettiTesti(100, 64, 0.5, 3);

        double p = Math.round(testaaja.parvo * 1000.0) / 1000.0;

        if (p != 0.007) {
            fail("p-arvo ei täsmää");
        }

    }

    @Test
    public void BinomiTestiTuottaaOikeitaArvoja() {
        Jakaumantyyppi jakaumantyyppi = new Jakaumantyyppi(1);
        Testaaja testaaja = new Testaaja(jakaumantyyppi);

        if (testaaja.teeDiskreettiTesti(100, 70, 0.5, 3) > 0.0001) {
            fail(testaaja.teeDiskreettiTesti(100, 70, 0.5, 3) + " >= " + 0.0001);
        }

        double parvo = testaaja.teeDiskreettiTesti(985, 984, 0.1, 1);
        if (testaaja.teeDiskreettiTesti(985, 984, 0.1, 1) != 0) {
            fail("luvut eivät täsmää " + parvo);
        }

        parvo = testaaja.teeDiskreettiTesti(1000, 990, 0.99, 1);

        if (parvo != 0.5830408033011036) {
            fail("luvut eivät täsmää. parvo " + parvo);
        }

    }

    @Test
    public void BinomiTestiHuomaaVaaratSyotot() {

        Jakaumantyyppi jakaumantyyppi = new Jakaumantyyppi(1);
        Testaaja testaaja = new Testaaja(jakaumantyyppi);

        assertTrue(testaaja.teeDiskreettiTesti(0, 0, 0.5, 1) == -1);
        assertTrue(testaaja.teeDiskreettiTesti(100, 101, 0.5, 2) == -1);
        assertTrue(testaaja.teeDiskreettiTesti(10, -10, 0.5, 3) == -1);
        assertTrue(testaaja.teeDiskreettiTesti(-10, 10, 0.5, 1) == -1);
        assertTrue(testaaja.teeDiskreettiTesti(10, 2, 2, 2) == -1);
        assertTrue(testaaja.teeDiskreettiTesti(10, 1, 0.2, 5) == -1);
        assertTrue(testaaja.teeDiskreettiTesti(10, 1, 0.2, -200) == -1);
        assertTrue(testaaja.teeDiskreettiTesti(10, 1, 0.2, 0) == -1);
        assertTrue(testaaja.teeDiskreettiTesti(-10, -1, -0.2, -1) == -1);
        assertTrue(testaaja.teeDiskreettiTesti(1, 0, 0.5, 1) != -1);
//        assertTrue(testaaja.teeDiskreettiTesti(1, 1, 0, 1) != -1);

    }
    
    @Test
    public void teeDiskreettiTestiLukeeArvotOikeinJaHuomaaVirheet() {
        Jakaumantyyppi jakaumantyyppi = new Jakaumantyyppi(1);
        Testaaja testaaja = new Testaaja(jakaumantyyppi);
        
        
    }
    
    public void testaateeJatkuvaTesti() {
        Jakaumantyyppi jakaumantyyppi = new Jakaumantyyppi(2);
        Jakaumantyyppi j = new Jakaumantyyppi(-2);
        
        Testaaja testaaja = new Testaaja(jakaumantyyppi);
        Testaaja testaajaj = new Testaaja(j);
        
        assertTrue(testaaja.teeJatkuvaTesti(10, 2, 0.25, 5, -1) == -1);
        assertTrue(testaaja.teeJatkuvaTesti(10, 2, 0.25, 5, 2) == -1);
        assertTrue(testaajaj.teeJatkuvaTesti(10, 2, 0.25, 5, 1) == -1);
        assertTrue(testaajaj.teeJatkuvaTesti(10, 2, 0.25, 5, -1) == -1);
    }

}

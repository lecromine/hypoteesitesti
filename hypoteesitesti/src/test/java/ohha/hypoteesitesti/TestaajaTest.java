/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ohha.hypoteesitesti;

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
        JakaumanTyyppi jakaumantyyppi = new JakaumanTyyppi(1);
        Testaaja testaaja = new Testaaja(jakaumantyyppi);

        testaaja.teeTesti(100, 64, 0.5, 3);

        double p = Math.round(testaaja.parvo * 1000.0) / 1000.0;

        if (p != 0.007) {
            fail("p-arvo ei täsmää");
        }

    }

    @Test
    public void BinomiTestiTuottaaOikeitaArvoja() {
        JakaumanTyyppi jakaumantyyppi = new JakaumanTyyppi(1);
        Testaaja testaaja = new Testaaja(jakaumantyyppi);

        if (testaaja.teeTesti(100, 70, 0.5, 3) > 0.0001) {
            fail(testaaja.teeTesti(100, 70, 0.5, 3) + " >= " + 0.0001);
        }

        double parvo = testaaja.teeTesti(985, 984, 0.1, 1);
        if (testaaja.teeTesti(985, 984, 0.1, 1) != 0) {
            fail("luvut eivät täsmää " + parvo);
        }

        parvo = testaaja.teeTesti(1000, 990, 0.99, 1);

        if (parvo != 0.5830408033011036) {
            fail("luvut eivät täsmää. parvo " + parvo);
        }

    }

    @Test
    public void BinomiTestiHuomaaVaaratSyotot() {

        JakaumanTyyppi jakaumantyyppi = new JakaumanTyyppi(1);
        Testaaja testaaja = new Testaaja(jakaumantyyppi);

        assertTrue(testaaja.teeTesti(0, 0, 0.5, 1) == -1);
        assertTrue(testaaja.teeTesti(100, 101, 0.5, 2) == -1);
        assertTrue(testaaja.teeTesti(10, -10, 0.5, 3) == -1);
        assertTrue(testaaja.teeTesti(-10, 10, 0.5, 1) == -1);
        assertTrue(testaaja.teeTesti(10, 2, 2, 2) == -1);
        assertTrue(testaaja.teeTesti(10, 1, 0.2, 5) == -1);
        assertTrue(testaaja.teeTesti(10, 1, 0.2, -200) == -1);
        assertTrue(testaaja.teeTesti(10, 1, 0.2, 0) == -1);

    }

}

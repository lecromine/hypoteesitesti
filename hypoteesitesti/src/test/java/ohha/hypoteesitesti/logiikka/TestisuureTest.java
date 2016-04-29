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
public class TestisuureTest {

    public TestisuureTest() {
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
    public void zTestiTest1() {
        Testisuure testisuure = new Testisuure();

        if ((testisuure.zTesti(10, 3, 1, 0, 3) > 0.00001)) {
            fail("parvo " + testisuure.zTesti(10, 3, 1, 0, 3));
        }

        testisuure.zTesti(10, 3, 1, 1, 3);
        
        if (testisuure.z != 6.324555320336758) {
            fail("z = " + testisuure.z);
        }

    }

    @Test
    public void zTestiTest2() {
        Testisuure testisuure = new Testisuure();

        if (testisuure.parvo != 0) {
            fail("1) p arvo = " + testisuure.parvo);
        }
        
        if (testisuure.zTesti(10, 1, 0.5, 0, 3) != -1) {
            fail("2) parvo " + testisuure.parvo + " z " + testisuure.z);
        }

        if (testisuure.zTesti(0, 1, 1, 1, 3) != -1) {
            fail("3) parvo " + testisuure.parvo);
        }
    }

    @Test
    public void testiToimiiTest() {
        Testisuure testisuure = new Testisuure();

        if (testisuure.tTesti(100, 6, 0.2, 7, 3) > 0.0001) {
            fail("p arvo " + testisuure.tTesti(100, 6, 0.2, 7, 3));
        }

        if (Math.round(testisuure.tTesti(10, 4, 0.5, 3.5, 3) * 1000.0) / 1000.0 != 0.012) {
            fail("p arvo " + testisuure.tTesti(100, 6, 0.2, 7, 3));
        }

    }

}

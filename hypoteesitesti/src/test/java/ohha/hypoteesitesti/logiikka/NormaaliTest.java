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
public class NormaaliTest {

    public NormaaliTest() {
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
    public void testiToimiiTest() {
        Normaali normaali = new Normaali();

        if (normaali.Odotusarvo(100, 6, 0.2, 3, 7) > 0.0001) {
            fail("p arvo " + normaali.Odotusarvo(100, 6, 0.2, 3, 7));
        }

        if (Math.round(normaali.Odotusarvo(10, 4, 0.5, 3.5, 3) * 1000.0) / 1000.0 != 0.012) {
            fail("p arvo " + normaali.Odotusarvo(10, 4, 0.5, 3.5, 3));
        }

    }

}

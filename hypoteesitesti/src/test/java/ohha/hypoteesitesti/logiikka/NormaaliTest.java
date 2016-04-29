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
    public void teeNormaaliTestiTest1() {
        Normaali normaali = new Normaali();
        
        
        if (normaali.teeNormaaliTesti(100, 55, 33, 66, 3, 2) !=  0.0012080041760123006) {
            fail("parvo " + normaali.teeNormaaliTesti(100, 55, 33, 66, 3, 2));            
        }
        
        if (normaali.teeNormaaliTesti(50, 520.3, 90, 523, 2, 1) !=  0.022085672454219534) {
            fail("parvo " + normaali.teeNormaaliTesti(50, 520.3, 90, 523, 1, 1));            
        }
        
        if (normaali.teeNormaaliTesti(50, 1, 9, 8, 1, 3) !=  0.10033249342764172) {
            fail("parvo " + normaali.teeNormaaliTesti(50, 1, 90, 80, 1, 3));            
        }        
        
    }
    
    @Test
    public void teeNormaaliTestiTest2() {
        Normaali normaali = new Normaali();
        assertTrue(normaali.teeNormaaliTesti(0, 10, 4, 5, 1, 2) == -1);
        assertTrue(normaali.teeNormaaliTesti(-1000, 10, 4, 5, 1, 2) == -1);
        assertTrue(normaali.teeNormaaliTesti(10, 0, 4, 5, 1, 2) == -1);
        assertTrue(normaali.teeNormaaliTesti(10, -10, 4, 5, 1, 2) == -1);
        assertTrue(normaali.teeNormaaliTesti(10, 10, 0, 5, 1, 2) == -1);
        assertTrue(normaali.teeNormaaliTesti(10, -10, -4, -5, 1, 2) == -1);
        assertTrue(normaali.teeNormaaliTesti(10, 10, 4, 0, 1, 2) == -1);
        assertTrue(normaali.teeNormaaliTesti(10, 10, 4, -5, 1, 2) == -1);
        assertTrue(normaali.teeNormaaliTesti(10, 10, 4, 5, 4, 2) == -1);
        assertTrue(normaali.teeNormaaliTesti(10, 10, 4, 5, -1, 2) == -1);
        assertTrue(normaali.teeNormaaliTesti(10, 10, 4, 5, 1, -2) == -1);
        assertTrue(normaali.teeNormaaliTesti(10, 10, 4, 5, 1, 0) == -1);
    }
    
    @Test
    public void OdotusarvoTest() {
        Normaali normaali = new Normaali();

        if (normaali.odotusarvo(100, 6, 0.2, 3, 7) > 0.0001) {
            fail("p arvo " + normaali.odotusarvo(100, 6, 0.2, 3, 7));
        }

        if (Math.round(normaali.odotusarvo(10, 4, 0.5, 3.5, 3) * 1000.0) / 1000.0 != 0.012) {
            fail("p arvo " + normaali.odotusarvo(10, 4, 0.5, 3.5, 3));
        }

    }

}

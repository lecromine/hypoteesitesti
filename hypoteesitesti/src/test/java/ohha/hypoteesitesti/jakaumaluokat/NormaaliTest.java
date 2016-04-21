/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ohha.hypoteesitesti.jakaumaluokat;

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
    public void testiToimii() {
        Normaali normaali = new Normaali();

        if (normaali.testaaNormaaliOdotusArvo(100, 6, 0.2, 7) > 0.0001) {
            fail("p arvo " + normaali.testaaNormaaliOdotusArvo(100, 6, 0.2, 7) + " t = " + normaali.gett());
        }

        if (Math.round(normaali.testaaNormaaliOdotusArvo(10, 4, 0.5, 3.5) * 1000.0) / 1000.0 != 0.012) {
            fail("p arvo " + normaali.testaaNormaaliOdotusArvo(100, 6, 0.2, 7) + " t = " + normaali.gett());
        }

    }
    
    @Test
    public void testaaVarianssiTestia() {
        Normaali normaali = new Normaali();
        
        if (normaali.testaaNormaaliVarianssi(10, 1, 1.5) != 0.73992) {
            fail("p arvo " + normaali.testaaNormaaliVarianssi(10, 1, 1.5) + " x = " + normaali.getx());
        }
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}

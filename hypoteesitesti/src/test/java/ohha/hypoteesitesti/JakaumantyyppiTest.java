/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ohha.hypoteesitesti;

import static java.lang.System.exit;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

/**
 *
 * @author Lecromine
 */
public class JakaumantyyppiTest {
    
    public JakaumantyyppiTest() {
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
    public void testaaJakaumanTyyppi() {
        Jakaumantyyppi j = new Jakaumantyyppi(-2);
        if (j.jakaumanValintaOikein == true) {
            fail("Negatiivinen syöte menee läpi");
        }
        
    }
    
    @Test
    public void testaaOnkoDiskreetti() {
        Jakaumantyyppi j = new Jakaumantyyppi(1);
        
        assertTrue(j.onkoDiskreetti() == true);
        
        Jakaumantyyppi j1 = new Jakaumantyyppi(2);
        
        assertTrue(j1.onkoDiskreetti() == false);
        
        Jakaumantyyppi j2 = new Jakaumantyyppi(0);
        
        assertTrue(j2.onkoDiskreetti() == false);
        
        Jakaumantyyppi j3 = new Jakaumantyyppi(-1);
        
        assertTrue(j3.onkoDiskreetti() == false);
        
    }
    

}

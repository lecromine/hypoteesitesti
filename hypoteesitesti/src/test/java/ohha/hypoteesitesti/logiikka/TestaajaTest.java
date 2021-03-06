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
    public void testaateeNormaaliTestiHuomaaVirhesyotot() {
        Testaaja testaaja = new Testaaja();
        
        assertTrue(testaaja.normaaliTesti(10, 2, -0.25, 5, 3, -1) == -1);
        assertTrue(testaaja.normaaliTesti(-10, 2, 0.25, 5, 3, 2) == -1);
        assertTrue(testaaja.normaaliTesti(10, 0, 0.25, 5, 3, 1) == -1);
        assertTrue(testaaja.normaaliTesti(10, 2, 0.25, -5, 3, 3) == -1);
        assertTrue(testaaja.normaaliTesti(0, 2, 0.0, 5, 3, 2) == -1);
        assertTrue(testaaja.normaaliTesti(10, 2, 0.25, -5, 3, 3) == -1);
        assertTrue(testaaja.normaaliTesti(0, 0, 0.25, 0, 3, 3) == -1);
//        assertTrue(testaaja.teeNormaaliTesti(100, 100, 0.25, -5, 3) == -1);

    }
    
    @Test
    public void testaaBinomiTestia() {
        Testaaja testaaja = new Testaaja();
        
        assertTrue(testaaja.binomiTesti(678, 444, 0.5, 1) < 0.00000001 );
        assertTrue(testaaja.binomiTesti(100, 33, 0.3, 3) == 0.5856476042500937);
        assertTrue(testaaja.binomiTesti(2255, 978, 0.4, 3) == 0.0011687071123500647);
        
    }
}

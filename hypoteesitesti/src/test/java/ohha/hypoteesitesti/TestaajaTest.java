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
        DiskreettiAineisto diskreettiaineisto = new DiskreettiAineisto(100, 64, 0.5, 1, 1);
        Testaaja testaaja = new Testaaja(diskreettiaineisto);
        
        testaaja.teeTesti(100, 64, 0.5, 3);
        
        double p = Math.round(testaaja.parvo * 1000.0) / 1000.0;
        
        if (p != 0.007) {
            fail("p-arvo ei täsmää");
        }
        
    }
    
}

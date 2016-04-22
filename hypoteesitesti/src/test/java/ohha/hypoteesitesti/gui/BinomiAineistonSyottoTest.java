/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ohha.hypoteesitesti.gui;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
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
public class BinomiAineistonSyottoTest {

    public BinomiAineistonSyottoTest() {
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
    public void robotti() throws AWTException {
        Robot bot = new Robot();
        bot.mouseMove(10, 10);
        bot.mousePress(InputEvent.BUTTON1_MASK);
//add time between press and release or the input event system may 
//not think it is a click
        try {
            Thread.sleep(250);
        } catch (InterruptedException e) {
        }
        bot.mouseRelease(InputEvent.BUTTON1_MASK);
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ohha.hypoteesitesti;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
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
public class AineistonSyottoLuokkaTest {

    public AineistonSyottoLuokkaTest() {
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
    public void testAineistonSyottoOikein() {
        ArrayList<Integer> aineistoLista = new ArrayList<Integer>();
        Aineisto aineisto = new Aineisto(1, 1, aineistoLista);
        assertEquals("binomi", aineisto.getJakauma());

    }

    @Test
    public void testAineistonSyottoOikeinKolme() {
        ArrayList<Integer> aineistoLista = new ArrayList<Integer>();
        Aineisto aineisto = new Aineisto(1, 1, aineistoLista);
        assertEquals("z-testi", aineisto.getTesti());

    }

    @Test
    public void testAineistonSyottoOikeinKaksi() {
        ArrayList<Integer> aineistoLista = new ArrayList<Integer>();
        Aineisto aineisto = new Aineisto(2, 4, aineistoLista);
        assertEquals("eksponentti", aineisto.getJakauma());
    }

    @Test
    public void testAineistonSyottoOikeinNeljä() {
        ArrayList<Integer> aineistoLista = new ArrayList<Integer>();
        Aineisto aineisto = new Aineisto(2, 4, aineistoLista);
        assertEquals("t-testi", aineisto.getTesti());
    }

    @Test
    public void testAineistoListanSyottoOikein() {
        ArrayList<Integer> aineistoLista = new ArrayList<Integer>();

        aineistoLista.add(1);
        aineistoLista.add(50);
        aineistoLista.add(4);
        aineistoLista.add(200);
        aineistoLista.add(39);

        Aineisto aineisto = new Aineisto(1, 1, aineistoLista);

        assertEquals("1, 50, 4, 200, 39", aineisto.getAineisto());
    }

    @Test
    public void testAineistonSyottoVirheellisesti() {
        ArrayList<Integer> aineistoLista = new ArrayList<Integer>();
        Aineisto aineisto = new Aineisto(-3, 40, aineistoLista);

        assertEquals("Jakaumaa ei ole valittu", aineisto.getJakauma());
        assertEquals("Testiä ei ole valittu", aineisto.getTesti());

    }

}

//    @Test
//    public void testSyotaAineisto() {
//        System.out.println("syotaAineisto");
//        Aineisto expResult = null;
//        Aineisto result = AineistonSyottoLuokka.syotaAineisto();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }


package ohha.hypoteesitesti;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;
import ohha.hypoteesitesti.jakaumaluokat.Binomi;

public class Main {

    public static void main(String[] args) {

        // KÃ¤yttÃ¤jÃ¤ syÃ¶ttÃ¤Ã¤ aineiston ohjelmalle. TÃ¤mÃ¤ erillisenÃ¤ luokkana selvyyden vuoksi. 
        // System.out.println(AineistonSyottoLuokka.syotaAineisto().getAineisto());
        
        DiskreettiAineisto diskreettiaineisto = new DiskreettiAineisto(100, 50, 0.5, 1, 1);
        Testaaja testaaja = new Testaaja(diskreettiaineisto);
        
        testaaja.teeTesti();

        
//        Binomi binomi = new Binomi(100, 50, 0.5);
        
//        AineistonSyottoLuokka.syotaAineisto();

//        System.out.println(binomi.getn());

        
        
//        System.out.println(binomi.ptnf());
        
        // testi(aineisto, jakauma, testi);
    }
}

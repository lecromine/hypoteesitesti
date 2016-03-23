package ohha.hypoteesitesti;

import java.util.ArrayList;
import java.util.Scanner;
import ohha.hypoteesitesti.jakaumaluokat.Binomi;

public class Main {

    public static void main(String[] args) {

        // KÃ¤yttÃ¤jÃ¤ syÃ¶ttÃ¤Ã¤ aineiston ohjelmalle. TÃ¤mÃ¤ erillisenÃ¤ luokkana selvyyden vuoksi. 
        // System.out.println(AineistonSyottoLuokka.syotaAineisto().getAineisto());
        Binomi binomi = new Binomi(10, 2, 5);

        System.out.println(binomi.getn());

        System.out.println(binomi.ptnf());

        // testi(aineisto, jakauma, testi);
    }
}

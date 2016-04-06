package ohha.hypoteesitesti;

import java.util.ArrayList;
import java.util.Scanner;
import ohha.hypoteesitesti.jakaumaluokat.JakaumanTyyppi;

public class AineistonSyottoLuokka {

    public static void syotaAineisto() {
        // Käyttäjä syöttää aineistonsa ohjelmalle.

        Scanner lukija = new Scanner(System.in);

        int jakauma = valitseJakauma();

        JakaumanTyyppi jakaumantyyppi = new JakaumanTyyppi(jakauma);

        int testi = valitseTesti();
        
        
        if (jakaumantyyppi.onkoDiskreetti() == true) {
            syotaDiskreettiAineisto(testi, jakauma);
        } else if (jakaumantyyppi.onkoJatkuva() == true) {
            syotaJatkuvaAineisto(testi, jakauma);
        } else {
            System.out.println("Jotain meni vikaan. Aineisto ei ole diskreetti eikä jatkuva.");
        }

//        for (int i = 0; i < aineistoLista.size(); i++) {
//            System.out.println(aineistoLista.get(i));
//        }
        // Ohjelma kysyy jakaumaa niin kauan, että käyttäjä syöttää hyväksyttävän arvon.
        // Sama juttu testin kysymysessä.
//        System.out.println(aineisto.getJakauma());

    }

    public static int valitseJakauma() {
        Scanner lukija = new Scanner(System.in);
        int jakauma = 0;
        while (jakauma == 0) {
            System.out.println("Valitse jakauma: ");
            System.out.println("binomi / normaali / poisson / eksponentti / tasainen / geometrinen / bernoulli");
            String jakaumanValinta = lukija.nextLine();

            if (jakaumanValinta.equals("binomi")) {
                jakauma = 1;
            } else if (jakaumanValinta.equals("normaali")) {
                jakauma = 2;
            } else if (jakaumanValinta.equals("poisson")) {
                jakauma = 3;
            } else if (jakaumanValinta.equals("eksponentti")) {
                jakauma = 4;
            } else if (jakaumanValinta.equals("tasainen")) {
                jakauma = 5;
            } else if (jakaumanValinta.equals("geometrinen")) {
                jakauma = 6;
            } else if (jakaumanValinta.equals("bernoulli")) {
                jakauma = 7;
            } else {
                System.out.println("Syote ei kelpaa. Valitse jokin annetuista jakaumista.");
            }

        }

        return jakauma;
    }

    public static void syotaDiskreettiAineisto(int testi, int jakauma) {
        Scanner lukija = new Scanner(System.in);
        
        // metodi kysyy aineiston arvot:

        System.out.println("Aineiston tiedot.");
        System.out.println("Syötä aineisto:");

        System.out.print("Aineiston koko n: ");
        int n = Integer.parseInt(lukija.nextLine());

        System.out.print("Onnistumisten lukumäärä k: ");
        int k = Integer.parseInt(lukija.nextLine());

        System.out.print("Yksittäisen onnistumisen todennäköisyys p: ");
        double p = Integer.parseInt(lukija.nextLine());
        
        DiskreettiAineisto diskreettiaineisto = new DiskreettiAineisto(n, k, p, testi, jakauma);
        
    }

    public static JatkuvaAineisto syotaJatkuvaAineisto(int testi, int jakauma) {
        Scanner lukija = new Scanner(System.in);
        ArrayList<Integer> aineistoLista = new ArrayList<Integer>();

        System.out.println("Aineiston tiedot.");
        System.out.println("Syötä aineisto ja lopuksi -1:");
        int x;
        
        // Metodi kysyy aineiston satunnaismuuttujia vastaavia arvoja:
        
        while (true) {

            x = Integer.parseInt(lukija.nextLine());
            if (x == -1) {
                if (aineistoLista.isEmpty()) {
                    System.out.println("Et syöttänyt yhtäkään arvoa aineistoosi. Ohjelma ei tulkitse tyhjiä aineistoja.");
                }
                break;
            }
            if (x >= 0) {
                aineistoLista.add(x);
            } else {
                System.out.println("Syöte ei kelpaa. Syötä aineisto ja lopuksi -1:");
            }

        }
        
        JatkuvaAineisto aineisto = new JatkuvaAineisto(testi, jakauma, aineistoLista);
        
        return aineisto;
    }

    public static int valitseTesti() {
        Scanner lukija = new Scanner(System.in);
        int testi;

        while (true) {
            System.out.println("Valitse testi: ");
            System.out.println("z-testi / t-testi");
            String testiValinta = lukija.nextLine();

            if (testiValinta.equals("z-testi")) {
                testi = 1;
                break;
            } else if (testiValinta.equals("t-testi")) {
                testi = 2;
                break;
            } else {
                System.out.println("Syote ei kelpaa. Valitse jokin annetuista testeistä.");
            }

        }
        return testi;
    }
}

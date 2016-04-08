package ohha.hypoteesitesti;

import java.util.ArrayList;
import java.util.Scanner;
import ohha.hypoteesitesti.jakaumaluokat.JakaumanTyyppi;

public class AineistonSyottoLuokka {

    public void syotaAineisto() {
        // Käyttäjä syöttää aineistonsa ohjelmalle.

        Scanner lukija = new Scanner(System.in);

        int jakauma = valitseJakauma();
        int testi = valitseTesti();

        JakaumanTyyppi jakaumantyyppi = new JakaumanTyyppi(jakauma);

        if (jakaumantyyppi.onkoDiskreetti() == true) {
            syotaDiskreettiAineisto(testi, jakauma);
        } else if (jakaumantyyppi.onkoJatkuva() == true) {
            /// kesken /////
            JatkuvaAineisto jatkuvaaineisto = syotaJatkuvaAineisto(testi, jakauma);
        } else {
            System.out.println("Jotain meni vikaan. Aineisto ei ole diskreetti eikä jatkuva.");
        }

        // Ohjelma kysyy jakaumaa niin kauan, että käyttäjä syöttää hyväksyttävän arvon.
        // Sama juttu testin kysymysessä.
    }

    public static int valitseJakauma() {
        Scanner lukija = new Scanner(System.in);
        int jakauma = 0;
        while (jakauma == 0) {

//            System.out.println("Valitse jakauma: ");
//            System.out.println("binomi / normaali / poisson / eksponentti / tasainen / geometrinen / bernoulli");
//            String jakaumanValinta = lukija.nextLine();
            String jakaumanValinta = "binomi";

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

        System.out.print("Otoskoko: n = ");
        int n = Integer.parseInt(lukija.nextLine());

        System.out.print("Onnistumisten lukumäärä: k = ");
        int k = Integer.parseInt(lukija.nextLine());

        System.out.print("Nollahypoteesi H0: p = ");
        double p = Double.parseDouble(lukija.nextLine());

        int suunta = 0;
        double p1 = 0;

        while (suunta == 0) {
            System.out.println("Vastahypoteesi. Syötä valintaasi vastaava numero. H1:");
            System.out.println("1) p < " + p);
            System.out.println("2) p > " + p);
            System.out.println("3) Ei vastahypoteesia.");
            suunta = Integer.parseInt(lukija.nextLine());

            if (suunta != 1 && suunta != 2 && suunta != 3) {
                System.out.println("Syote ei kelpaa. Syötä joko 1, 2, tai 3.");
                suunta = 0;
            }
        }

        DiskreettiAineisto diskreettiaineisto = new DiskreettiAineisto(n, k, p, testi, jakauma);
        Testaaja testaaja = new Testaaja(diskreettiaineisto);

        testaaja.teeTesti(n, k, p, suunta);

    }

    public static JatkuvaAineisto syotaJatkuvaAineisto(int testi, int jakauma) {
        Scanner lukija = new Scanner(System.in);
        ArrayList<Integer> aineistoLista = new ArrayList<Integer>();

        // keskeneräistä: jatkuvaan aineistoon liittyvä logiikka lisätään myöhemmin.
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
        int testi = 1;

        // optio testin valintaan todennäköisesti poistetaan jossain vaiheessa koodista.
//        while (true) {
//            System.out.println("Valitse testi: ");
//            System.out.println("z-testi / t-testi");
//            String testiValinta = lukija.nextLine();
//
//            if (testiValinta.equals("z-testi")) {
//                testi = 1;
//                break;
//            } else if (testiValinta.equals("t-testi")) {
//                testi = 2;
//                break;
//            } else {
//                System.out.println("Syote ei kelpaa. Valitse jokin annetuista testeistä.");
//            }
//
//        }
        return testi;
    }
}

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
            String jakaumanValinta = "geometrinen";

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

        int n = 0;
        int k = -1;
        double p = -1;
        
        if (jakauma == 1) {
            while (n <= 0) {

                System.out.print("Otoskoko: n = ");
                n = Integer.parseInt(lukija.nextLine());

                if (n <= 0) {
                    System.out.println("Syötteesi ei kepaa. Valitse n > 0.");
                }
            }
        }

        while (k > n || k < 0) {

            System.out.print("Onnistumisten lukumäärä: k = ");
            k = Integer.parseInt(lukija.nextLine());
            if (jakauma != 1) {
                n = Math.max(k, n);
            }
            if (k > n || k < 0) {
                System.out.println("Syötteesi ei kelpaa. Valitse k >= 0.");
            }

        }

        while (p < 0 || p > 1) {

            System.out.print("Nollahypoteesi H0: p = ");
            p = Double.parseDouble(lukija.nextLine());

            if (p < 0 || p > 1) {
                System.out.println("Syötteesi ei kelpaa. Valitse 0 < p < 1.");
            }
        }

        int suunta = 0;

        while (suunta == 0) {
            System.out.println("Vastahypoteesi. Syötä valintaasi vastaava numero. H1:");
            System.out.println("1) p < " + p);
            System.out.println("2) p > " + p);
            System.out.println("3) Ei vastahypoteesia.");
            suunta = Integer.parseInt(lukija.nextLine());

            if (suunta != 1 && suunta != 2 && suunta != 3) {
                System.out.println("Syötteesi ei kelpaa. Syötä joko 1, 2, tai 3.");
                suunta = 0;
            }
        }

        DiskreettiAineisto diskreettiaineisto = new DiskreettiAineisto(n, k, p, jakauma);
        Testaaja testaaja = new Testaaja(diskreettiaineisto);

        testaaja.teeTesti(n, k, p, suunta);

    }

    public static void syotaJatkuvaAineisto(int testi, int jakauma) {
        Scanner lukija = new Scanner(System.in);
        ArrayList<Integer> aineistoLista = new ArrayList<Integer>();

        // keskeneräistä: jatkuvaan aineistoon liittyvä logiikka lisätään myöhemmin.
        System.out.println("Aineiston tiedot.");
        System.out.println("Haluatko syöttää otoskeskiarvon ja -varianssin (1) vai koko aineiston (2)?");
        int tyyppi = Integer.parseInt(lukija.nextLine());
        
        if (tyyppi == 1) {
            syotaJatkuvanAineistonMujaVar();
        } else if (tyyppi == 2) {
            syotaJatkuvaAineistoKokonaan();
        } else {
            System.out.println("Jotain meni vikaan. Yritä uudelleen.");
        }
        
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
    }
    
    public static void syotaJatkuvanAineistonMujaVar() {
        
    }
    
    public static void syotaJatkuvaAineistoKokonaan() {
        
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

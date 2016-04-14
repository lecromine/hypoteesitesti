package ohha.hypoteesitesti;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * AineistonSyottoLuokka, samoin kuin testaajan metodi tulosteKayttajalle(), on
 * koodaamisen alkupuolella luotu osa helpottamaan koodaamista. Tämä luokka
 * poistetaan lopullisesta versiosta. Luokan tehtävänä on vastaanottaa käyttäjän
 * syöte ja tallentaa ne parametreihin.
 *
 * @author Lecromine
 */
public class AineistonSyottoLuokka {

    public void syotaAineisto() {

        Scanner lukija = new Scanner(System.in);

        int jakauma = valitseJakauma();

        JakaumanTyyppi jakaumantyyppi = new JakaumanTyyppi(jakauma);

        if (jakaumantyyppi.onkoDiskreetti() == true) {
            syotaDiskreettiAineisto(jakauma);
        } else if (jakaumantyyppi.onkoDiskreetti() == false) {
            /// kesken /////

        } else {
            System.out.println("Jotain meni vikaan. Aineisto ei ole diskreetti eikä jatkuva.");
        }

    }

    /**
     * Käyttäjä valitsee jakauman: esim. binomijakauma, normaalijakauma... Eri
     * jakaumat vaativat tietoonsa eri parametreja, siksi jakauma pitää valita
     * erikseen. Aineistoista ei jakaumaa voi päätellä (tai kenties voi, mutta
     * se taas on paljon laajempi ongelma)
     *
     * @return jakauma jakauma tallennetaan int :ksi
     */
    public static int valitseJakauma() {
        Scanner lukija = new Scanner(System.in);
        int jakauma = 0;
        while (jakauma == 0) {

            System.out.println("Valitse jakauma: ");
            System.out.println("binomi / normaali / poisson / eksponentti / tasainen / geometrinen / bernoulli");
            String jakaumanValinta = lukija.nextLine();
//            String jakaumanValinta = "binomi";

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

    /**
     * Diskreetin aineiston syöttö. Diskreetti ja jatkuva pitää tehdä erikseen,
     * koska ovat niin erilaiset tapaukset.
     *
     * @param jakauma käyttäjän syöttämä jakauma, joka on muutettu integeriksi
     */
    public static void syotaDiskreettiAineisto(int jakauma) {
        Scanner lukija = new Scanner(System.in);

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

        JakaumanTyyppi jakaumantyyppi = new JakaumanTyyppi(jakauma);
        Testaaja testaaja = new Testaaja(jakaumantyyppi);

        testaaja.teeTesti(n, k, p, suunta);

    }

    /**
     * Jatkuvan aineiston syöttö. Tämä osa koodia on vielä kesken ja se
     * rakennetaan myöhemmin.
     *
     *
     * @param jakauma metodille annetaan käyttäjän valitsema jakauma Integeriksi
     * muunnettuna
     */
    public static void syotaJatkuvaAineisto(int jakauma) {
        Scanner lukija = new Scanner(System.in);
        ArrayList<Integer> aineistoLista = new ArrayList<Integer>();

        System.out.println("Aineiston tiedot.");
        System.out.println("Haluatko syöttää otoskeskiarvon ja -varianssin (1) vai koko aineiston (2)?");
        int tyyppi = Integer.parseInt(lukija.nextLine());

        if (tyyppi == 1) {
 
        } else if (tyyppi == 2) {

        } else {
            System.out.println("Jotain meni vikaan. Yritä uudelleen.");
        }

        System.out.println("Syötä aineisto ja lopuksi -1:");
        int x;

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

    }

}

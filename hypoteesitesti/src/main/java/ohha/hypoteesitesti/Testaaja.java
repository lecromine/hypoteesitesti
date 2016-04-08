package ohha.hypoteesitesti;

import java.text.DecimalFormat;

public class Testaaja {

    private DiskreettiAineisto diskreettiaineisto;

    public Testaaja(DiskreettiAineisto diskreettiaineisto) {
        this.diskreettiaineisto = diskreettiaineisto;
    }

    public void teeTesti(int n, int k, double p, int suunta) {
        if (diskreettiaineisto.getJakauma() == 1) {
            binomiTesti(n, k, p, suunta);
        } else if (diskreettiaineisto.getJakauma() == 6) {
            bernoulliTesti(n, p);
        } else if (diskreettiaineisto.getJakauma() == 7) {
            geometrinenTesti(n, p);
        }
    }

    public void binomiTesti(int n, int k, double p, int suunta) {

        // kaksisuuntainen asetelma H0: p = p0
        DecimalFormat df = new DecimalFormat("##.#####");

        double p_arvo = 0;
        int alaraja = 0; // kriittinen alue: [0, alaraja]
        int ylaraja = 0; // kriittinen alue: [ylaraja, n]
        
        // nollahypoteesin kannalta suotuisa alue: [alaraja, yläraja]

        // suunta: 1 = alas, 2 = ylös, 3 = kaksisuuntainen
//        lantin harhattomuus: nollahypoteesi H väittää, että onnistumistn p = 0.5
//        aineisto: n heittoa, k onnistumista
//        tukeeko aineisto nollahypoteesia H?
//        E(K) = n/2 -> nollahypoteesin kannalta kriittisiä ovat n/2 suuresti poikkeavat arvot
//        eli | k - n/2 | on suurta
//        p = P{ | K - n/2 | >= | k - n/2 | } = P{ K <= n/2 - | k - n/2 | } + P{K >= n/2 + | k - n/2 | }
//
        if (suunta == 1 || suunta == 3) { // kriittinen alue joko [0, alaraja] ja/tai [ylaraja, n]
             
            alaraja = (int) (n * p - Math.abs(k - n * p));
            for (int i = 0; i <= alaraja; i++) {
                p_arvo = p_arvo + diskreettiaineisto.binomi.ptnf(n, i, p);
            }

        }

        if (suunta == 2 || suunta == 3) { // kriittinen alue joko [ylaraja, n] ja/tai [0, alaraja]
            ylaraja = (int) (n * p + Math.abs(k - n * p));

            for (int i = ylaraja; i <= n; i++) {
                p_arvo = p_arvo + diskreettiaineisto.binomi.ptnf(n, i, p);
            }
        }

//        System.out.println("[" + alaraja + ", " + ylaraja + "]");

        // Aluksi tutkitaan merkitsevyystaso a = 0.05
        if (p_arvo < 0.1) {
            if (p_arvo < 0.05) {
                if (p_arvo < 0.01 ) {
                    System.out.println("p-arvoksi saadaan " + df.format(p_arvo) + " < 0.01, joten nollahypoteesi hylätään merkitsevyystasolla 0.01");
                } else if (p_arvo > 0.01) {
                    System.out.println("p-arvoksi saadaan 0.01 < " + df.format(p_arvo) + " < 0.05, joten nollahypoteesi hylätään merkitsevyystasolla 0.01 mutta hyväksytään tasolla 0.05");
                }
            } else {
                System.out.println("p-arvoksi saadaan 0.05 < " + df.format(p_arvo) + " < 0.1, joten nollahypoteesi hylätään merkitsevyystasolla 0.05 mutta hyväksytään tasolla 0.1");
                
            }
            
        } else if (p_arvo > 0.1) {
            System.out.println("p-arvoksi saadaan " + df.format(p_arvo) + " > 0.1, joten nollahypoteesi hyväksytään merkitsevyystasolla 0.1");
        }

    }

    public void bernoulliTesti(int n, double p) {

    }

    public void geometrinenTesti(int n, double p) {

    }

    public void maaritaJakauma(int jakaumaNumero) {

    }

    public void maaritaTesti(int testiNumero) {

    }

}

package ohha.hypoteesitesti;

import java.text.DecimalFormat;

public class Testaaja {

    private DiskreettiAineisto diskreettiaineisto;

    public Testaaja(DiskreettiAineisto diskreettiaineisto) {
        this.diskreettiaineisto = diskreettiaineisto;
    }

    public void teeTesti() {
        if (diskreettiaineisto.getJakauma() == 1) {
            binomiTesti();
        } else if (diskreettiaineisto.getJakauma() == 6) {
            bernoulliTesti();
        } else if (diskreettiaineisto.getJakauma() == 7) {
            geometrinenTesti();
        }
    }

    public void binomiTesti() {
        
        // yksisuuntainen asetelma H0: p = p0; H1: p > p0
        
                
    }
    
    public void binomiTestiKaksiSuuntainen() {
        
        DecimalFormat df = new DecimalFormat("##.#####");
        
        double nollahypoteesi = 0.7;
        double testisuure;
        double p_arvo = 0;

        int k = 90;
        int n = 120;
        double p = nollahypoteesi;

//        int k = diskreettiaineisto.getk();
//        int n = diskreettiaineisto.getn();
//        double p = diskreettiaineisto.getp();
        // lantin harhattomuus: nollahypoteesi H väittää, että onnistumistn p = 0.5
        // aineisto: n heittoa, k onnistumista
        // tukeeko aineisto nollahypoteesia H?
        // E(K) = n/2 -> nollahypoteesin kannalta kriittisiä ovat n/2 suuresti poikkeavat arvot
        // eli | k - n/2 | on suurta
        // p = P{ | K - n/2 | >= | k - n/2 | } = P{ K <= n/2 - | k - n/2 | } + P{K >= n/2 + | k - n/2 | }
        int alaraja = (int) (n * p - Math.abs(k - n * p));
        int ylaraja = (int) (n * p + Math.abs(k - n * p));

        System.out.println("[" + alaraja + ", " + ylaraja + "]");

        for (int i = 0; i <= alaraja; i++) {
            p_arvo = p_arvo + diskreettiaineisto.binomi.ptnf(n, i, p);
        }

        for (int i = ylaraja; i < n; i++) {
            p_arvo = p_arvo + diskreettiaineisto.binomi.ptnf(n, i, p);
        }

        // Aluksi tutkitaan merkitsevyystaso a = 0.05
        if (p_arvo < 0.05) {
            System.out.println("p-arvoksi saadaan " + df.format(p_arvo) + " < 0.05, joten nollahypoteesi hylätään merkitsevyystasolla 0.05");
        } else {
            System.out.println("p-arvoksi saadaan " + df.format(p_arvo) + " > 0.05, joten nollahypoteesi hyväksytään merkitsevyystasolla 0.05");
        }

    }

    public void bernoulliTesti() {

    }

    public void geometrinenTesti() {

    }

    public void maaritaJakauma(int jakaumaNumero) {

    }

    public void maaritaTesti(int testiNumero) {

    }

}

package ohha.hypoteesitesti;

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

        double nollahypoteesi = 0.5;
        double testisuure;
        double p_arvo = 0;

        int k = 50;
        double n = 120;
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

        System.out.println(ylaraja + " + " + alaraja);

        // Aluksi tutkitaan merkitsevyystaso a = 0.05
        
        if (p_arvo < 0.05) {
            // aineisto todistaa nollahypoteesia vastaan
        } else {
            // Aineisto ei todista nollahypoteesia vastaan
        }

        System.out.println("ptnf " + diskreettiaineisto.binomi.ptnf());

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

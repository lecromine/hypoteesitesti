package ohha.hypoteesitesti.logiikka;

import org.apache.commons.math3.stat.inference.AlternativeHypothesis;
import org.apache.commons.math3.stat.inference.BinomialTest;

public class Binomi {

    double parvo;
    BinomialTest binomi = new BinomialTest();

    /**
     * teeTesti suorittaa testin.
     *
     * Jos parametri p = 0.5, on kyseessä sign -testi (kaksisuuntainen tapaus).
     * Muutoin tehdään binomitesti.
     *
     * @param n diskreetin aineiston otoskoko
     * @param k diskreetin aineiston onnistumisten lukumäärä
     * @param p diskreetin aineiston nollahypoteesin parametri
     * @param suunta diskreetin aineiston suunta: kaksisuuntainen, suurempaa
     * kuin, pienempää kuin
     * @return parvo palauttaa testin mukaisen p-arvon sitä kutsuneelle luokalle
     */
    public double teeBinomiTesti(int n, int k, double p, int suunta) {

        if (n <= 0) {
            return -1;
        } else if (k < 0) {
            return -1;
        } else if (k > n) {
            return -1;
        } else if (p <= 0) {
            return -1;
        } else if (p >= 1) {
            return -1;
        } else if (suunta < 1) {
            return -1;
        } else if (suunta > 3) {
            return -1;
        } else {

            parvo = 0;

            switch (suunta) {
                case 1:
                    parvo = binomi.binomialTest(n, k, p, AlternativeHypothesis.GREATER_THAN);
                    break;
                case 2:
                    parvo = binomi.binomialTest(n, k, p, AlternativeHypothesis.LESS_THAN);
                    break;
                case 3:
                    if (p == 0.5) {
                        parvo = binomi.binomialTest(n, k, p, AlternativeHypothesis.TWO_SIDED);
                    } else {
                        parvo = binomiTestiYleisesti(n, k, p);
                    }
                    break;
                default:
                    break;
            }

            return parvo;
        }
    }

    /**
     * Tämä metodi ajetaan silloin, kun parametri p != 0.5, sillä
     * math3-kirjaston binomitesti TWO_SIDED -tapauksessa tuottaa vääriä arvoja.
     *
     * @param n     otoskoko
     * @param k     onnistumisten lkm
     * @param p     parametri
     * @return  parvo
     */
    public double binomiTestiYleisesti(int n, int k, double p) {

        double odotusarvo = n * p;

        int alaraja = (int) odotusarvo - Math.abs(k - (int) odotusarvo);
        int ylaraja = (int) odotusarvo + Math.abs(k - (int) odotusarvo);

        parvo = binomi.binomialTest(n, ylaraja, p, AlternativeHypothesis.GREATER_THAN)
                + binomi.binomialTest(n, alaraja, p, AlternativeHypothesis.LESS_THAN);

        System.out.println("parvo " + parvo);

        return parvo;
    }

}

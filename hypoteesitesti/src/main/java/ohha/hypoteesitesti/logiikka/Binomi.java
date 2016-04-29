package ohha.hypoteesitesti.logiikka;

import org.apache.commons.math3.stat.inference.AlternativeHypothesis;
import org.apache.commons.math3.stat.inference.BinomialTest;

public class Binomi {

    double parvo;

    /**
     * teeTesti suorittaa testin.
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
        } else if (p < 0) {
            return -1;
        } else if (p > 1) {
            return -1;
        } else if (suunta < 1) {
            return -1;
        } else if (suunta > 3) {
            return -1;
        } else {

            BinomialTest binomi = new BinomialTest();

            switch (suunta) {
                case 1:
                    parvo = binomi.binomialTest(n, k, p, AlternativeHypothesis.GREATER_THAN);
                    break;
                case 2:
                    parvo = binomi.binomialTest(n, k, p, AlternativeHypothesis.LESS_THAN);
                    break;
                case 3:
                    parvo = binomi.binomialTest(n, k, p, AlternativeHypothesis.TWO_SIDED);
                    break;
                default:
                    break;
            }

            return parvo;
        }
    }
}

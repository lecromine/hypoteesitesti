package ohha.hypoteesitesti.logiikka;

import org.apache.commons.math3.distribution.ChiSquaredDistribution;
import org.apache.commons.math3.distribution.NormalDistribution;
import org.apache.commons.math3.distribution.TDistribution;

/**
 * Tämä luokka sisältää t-jakauman, khii toiseen -jakauman ja
 * standardinormaalijakauman testaamisia varten.
 */
public class Testisuure {

    double t;
    double z;
    double x;
    double parvo;

    public Testisuure() {

    }

    /**
     * Tekee testin t-jakaumaa käyttäen
     *
     * @param n otoskoko
     * @param ka otoskeskiarvo
     * @param p testattava arvo
     * @param s otoskeskihajonta
     * @param suuntaNumero testin suunta: kaksisuuntainen jne.
     * @return parvo
     */
    public double tTesti(int n, double ka, double p, double s, int suuntaNumero) {
        if (s < 0 || n < 1 || ka < 0 || p < 0 || suuntaNumero < 1 || suuntaNumero > 3) {
            return -1;
        }
        

        TDistribution tjakauma = new TDistribution(n - 1);

        t = Math.abs((ka - p) / s * Math.sqrt(n));

        switch (suuntaNumero) {
            case 1:
                parvo = 1 - tjakauma.cumulativeProbability(t);
                break;
            case 2:
                parvo = tjakauma.cumulativeProbability(t);
                break;
            case 3:
                parvo = 2 * (1 - tjakauma.cumulativeProbability(t));
                break;
            default:
                parvo = -1;
                break;

        }

        return parvo;
    }

    /**
     * Tekee testin standardinormaalijakaumaa käyttäen
     *
     * @param n otoskoko
     * @param ka otoskeskiarvo
     * @param p testattava arvo
     * @param var varianssi
     * @param suuntaNumero testin suunta: kaksisuuntainen jne.
     * @return parvo
     */
    public double zTesti(int n, double ka, double p, double var, int suuntaNumero) {
        if (p <= 0 || var <= 0 || n < 1 || ka <= 0 || suuntaNumero < 1 || suuntaNumero > 3) {
            return -1;
        }

        NormalDistribution standardinormaali = new NormalDistribution(0, 1);

        z = (ka - p) / (Math.sqrt(var / n));

        System.out.println("z = " + z);

        switch (suuntaNumero) {
            case 1:
                parvo = 1 - standardinormaali.cumulativeProbability(z);
                break;
            case 2:
                parvo = standardinormaali.cumulativeProbability(z);
                break;
            case 3:
                if (z < 0) {
                    parvo = standardinormaali.cumulativeProbability(z) * 2;
                    break;
                } else {
                    parvo = (1 - standardinormaali.cumulativeProbability(z)) * 2;
                    break;
                }
            default:
                parvo = -1;
                break;

        }

        return parvo;
    }

    /**
     * Tekee testin khii2-jakaumaa käyttäen
     *
     * @param n otoskoko
     * @param p testattava arvo
     * @param s otoskeskihajonta
     * @return parvo
     */
    public double khiiToiseenTesti(int n, double s, double p) {

        if (n < 1 || p < 0 || s < 0) {
            return -1;
        }

        ChiSquaredDistribution khii = new ChiSquaredDistribution(n - 1);

        x = (n - 1) * Math.pow(s, 2) / Math.pow(p, 2);

        parvo = 1 - khii.cumulativeProbability(x);

        return parvo;
    }

    public double getx() {
        return this.x;
    }

    public double getz() {
        return this.z;
    }

    public double gett() {
        return this.t;
    }

}

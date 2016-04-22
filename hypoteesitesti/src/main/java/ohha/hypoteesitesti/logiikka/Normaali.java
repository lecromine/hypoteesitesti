/**
 * Tämä luokka sisältää kaikki normaaliin jakaumaan liittyvät tiedot.
 * Testauslogiikka säilytetään joko täällä tai siirretään Testaajaan: riippuu
 * siitä, kuinka pitkä testistä tulee.
 *
 * @author Lecromine
 */

package ohha.hypoteesitesti.logiikka;

import org.apache.commons.math3.distribution.ChiSquaredDistribution;
import org.apache.commons.math3.distribution.NormalDistribution;
import org.apache.commons.math3.distribution.TDistribution;
import org.apache.commons.math3.stat.inference.TTest;


public class Normaali {

    private double n;
    private double k;
    private double p;
    double t;
    double x;
    double z;
    private int jakaumaNumero;

    /**
     * Normaali -olion alustus.
     */
    
    public Normaali() {
        this.jakaumaNumero = 2;
    }

    /**
     * Normaalitesti joko t- tai z-testillä. Koodi on kesken. Tämä metodi laskee
     * p-arvon, kun käyttäjä on syöttänyt otoskeskiarvon ja -hajonnan erikseen.
     *
     * @param n otoskoko
     * @param ka otoskeskiarvo
     * @param s otoskeskihajonta
     * @param p nollahypoteesia vastaava parametri
     * @return p-arvo
     */
    public double testaaNormaaliOdotusArvo(int n, double ka, double s, double p) {
        TDistribution tjakauma = new TDistribution(n - 1);
        t = 0;
        t = Math.abs((ka - p) / s * Math.sqrt(n));

        double parvo = 2 * (1 - tjakauma.cumulativeProbability(t));

        return parvo;
    }

    /**
     * Testaa normaalin jakauman hypotetisoitua odotusarvoa silloin, kun
     * tiedetään varmasti, mikä on varianssin arvo.
     *
     * @param n     otoskoko
     * @param ka    otoskeskiarvo
     * @param var   varianssi
     * @param p     nollahypoteesi odotusarvosta
     * @return p-arvo
     */
    public double testaaNormaaliOdotusarvoVarianssiTunnettu(int n, double ka, double var, double p) {

        NormalDistribution standardinormaali = new NormalDistribution(0, 1);

        z = (ka - p) / (var / Math.sqrt(n));

        double parvo = 0;

        if (z < 0) {
            parvo = standardinormaali.cumulativeProbability(z);
        } else {
            parvo = 1 - standardinormaali.cumulativeProbability(z);
        }

        return parvo;
    }
    
    /**
     * Testaa normaalijakauman varianssia Khii-toiseen -testillä.
     * @param n     otoskoko
     * @param s     otoskeskihajonta
     * @param p     nollahypoteesia varianssin arvosta
     * @return parvo
     */

    public double testaaNormaaliVarianssi(int n, double s, double p) {
        ChiSquaredDistribution khii = new ChiSquaredDistribution(n - 1);

        x = (n - 1) * Math.pow(s, 2) / Math.pow(p, 2);

        double parvo = 1 - khii.cumulativeProbability(x);

        return parvo;
    }

    /**
     * palauttaa otoskoon.
     * @return n
     */
    
    public double getn() {
        return this.n;
    }
    
    /**
     * palauttaa nollahypoteesia vastaavan arvon.
     * @return p 
     */

    public double getp() {
        return this.p;
    }
    
    /**
     * palauttaa t-testissä käytettävän t-parametrin arvon.
     * @return  t
     */

    public double gett() {
        return this.t;
    }

    /**
     * palauttaa varianssin testissä käytettävän arvon.
     * @return x
     */
    
    public double getx() {
        return this.x;
    }
    
    /**
     * palauttaa z-testissä käytettävän arvon.
     * @return  z
     */

    public double getz() {
        return this.z;
    }
    
    /**
     * palauttaa jakaumanumeron 1 tai 2.
     * @return jakaumaNumero
     */

    public int getjakaumaNumero() {
        return this.jakaumaNumero;
    }

}

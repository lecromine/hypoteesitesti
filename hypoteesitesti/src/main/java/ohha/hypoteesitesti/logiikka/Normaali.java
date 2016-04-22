/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ohha.hypoteesitesti.logiikka;

import org.apache.commons.math3.distribution.ChiSquaredDistribution;
import org.apache.commons.math3.distribution.NormalDistribution;
import org.apache.commons.math3.distribution.TDistribution;
import org.apache.commons.math3.stat.inference.TTest;

/**
 * Tämä luokka sisältää kaikki normaaliin jakaumaan liittyvät tiedot.
 * Testauslogiikka säilytetään joko täällä tai siirretään Testaajaan: riippuu
 * siitä, kuinka pitkä testistä tulee.
 *
 * @author Lecromine
 */
public class Normaali {

    private double n;
    private double k;
    private double p;
    double t;
    double x;
    double z;
    private int jakaumaNumero;

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
     * @param var varianssi
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

    public double testaaNormaaliVarianssi(int n, double s, double p) {
        ChiSquaredDistribution khii = new ChiSquaredDistribution(n - 1);

        x = (n - 1) * Math.pow(s, 2) / Math.pow(p, 2);

        double parvo = 1 - khii.cumulativeProbability(x);

        return parvo;
    }

    public double getn() {
        return this.n;
    }

    public double getk() {
        return this.k;
    }

    public double getp() {
        return this.p;
    }

    public double gett() {
        return this.t;
    }

    public double getx() {
        return this.x;
    }

    public double getz() {
        return this.z;
    }

    public int getjakaumaNumero() {
        return this.jakaumaNumero;
    }

}

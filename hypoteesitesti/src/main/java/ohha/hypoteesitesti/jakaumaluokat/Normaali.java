/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ohha.hypoteesitesti.jakaumaluokat;

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
     * @param p nollahypoteesia vastaava parametri
     * @return p-arvo
     */
    public double testaaNormaaliOdotusarvo(int n, double ka, double s, double p) {

        TDistribution tjakauma = new TDistribution(n - 1);

        

        double t = (ka - p) / Math.pow(s, 2) * Math.sqrt(n);

        System.out.println(tjakauma.getNumericalMean());

        return 0;
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

    public int getjakaumaNumero() {
        return this.jakaumaNumero;
    }

}

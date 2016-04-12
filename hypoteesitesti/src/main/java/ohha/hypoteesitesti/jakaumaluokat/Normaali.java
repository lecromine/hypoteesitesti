/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ohha.hypoteesitesti.jakaumaluokat;

import org.apache.commons.math3.distribution.TDistribution;
import org.apache.commons.math3.stat.inference.TTest;

/**
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

    public double testaaNormaaliOdotusarvo(int n, double ka, double p) {
        
        TDistribution tjakauma = new TDistribution(n-1);
        
        for (int i = 1; i < n; i++) {
            
        }
        
        double t = (ka - p);
        
        
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

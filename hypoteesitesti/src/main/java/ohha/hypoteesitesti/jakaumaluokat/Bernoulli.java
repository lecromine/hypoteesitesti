/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ohha.hypoteesitesti.jakaumaluokat;

/**
 *
 * @author Lecromine
 */
public class Bernoulli {
    
    private double n;
    private double p;
    private int jakaumaNumero;

    public Bernoulli(double n, double p) {
        this.n = n;
        this.p = p;
        this.jakaumaNumero = 7;
    }

    public double ptnf() {
        if (p < 0 || p > 1) {
            return -1;
        }
        return Math.pow(p, n) * Math.pow(1-p,1-n);
    }

    public double getn() {
        return this.n;
    }

    public double getp() {
        return this.p;
    }

    public int getjakaumaNumero() {
        return this.jakaumaNumero;
    }

}

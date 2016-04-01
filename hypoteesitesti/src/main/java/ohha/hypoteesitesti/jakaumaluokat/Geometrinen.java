
package ohha.hypoteesitesti.jakaumaluokat;


public class Geometrinen {
    private double k;
    private double p;
    private int jakaumaNumero;

    public Geometrinen(double k, double p) {
        this.k = k;
        this.p = p;
        this.jakaumaNumero = 6;
    }

    public double ptnf() {
        if (p < 0 || p > 1 ) {
            return -1;
        }
        return p * Math.pow(1-p, k);
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


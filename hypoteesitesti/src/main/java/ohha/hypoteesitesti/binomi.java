package ohha.hypoteesitesti;

public class binomi {

    private double n;
    private double k;
    private double p;

    public binomi(double n, double k, double p) {
        this.n = n;
        this.k = k;
        this.p = p;
    }

    public double ptnf() {
        if ( p < 0 || p > 1 || n < k) return -1;
        return kombinaatio(n, k) * Math.pow(n, k) * Math.pow(1 - p, n - k);
    }

    public double kombinaatio(double n, double k) {
        return permutaatio(n) / (permutaatio(k) * permutaatio(n - k));
    }

    public double permutaatio(double i) {
        if (i == 1) {
            return 1;
        }
        return i * permutaatio(i - 1);
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

}

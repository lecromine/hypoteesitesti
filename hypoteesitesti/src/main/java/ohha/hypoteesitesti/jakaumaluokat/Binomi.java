package ohha.hypoteesitesti.jakaumaluokat;

import java.text.DecimalFormat;

public class Binomi {

    private int jakaumaNumero;

    public Binomi() {
        this.jakaumaNumero = 1;
    }

    public double ptnf(int n, int k, double p) {
        if (p < 0 || p > 1 || n < k || n < 0 || k < 0) {
            return -1;
        } else if (k == 0 && n != 0) {
            return Math.pow(1 - p, n);
        } else if (n == 0) {
            return -1;
        }

        return kombinaatio(n, k) * Math.pow(p, k) * Math.pow(1 - p, n - k);
    }

    public double kombinaatio(double n, double k) {
        return permutaatio(n) / (permutaatio(k) * permutaatio(n - k));
    }

    public double permutaatio(double i) {
        if (i == 1 || i == 0) {
            return 1;
        }

        return i * permutaatio(i - 1);
    }

    public int getjakaumaNumero() {
        return this.jakaumaNumero;
    }

}

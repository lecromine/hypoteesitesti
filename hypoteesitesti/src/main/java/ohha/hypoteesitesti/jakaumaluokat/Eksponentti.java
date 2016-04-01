package ohha.hypoteesitesti.jakaumaluokat;

public class Eksponentti {

    private double x;

    private double p;
    private int jakaumaNumero;

    public Eksponentti(double x, double p) {
        this.x = x;
        this.p = p;
        this.jakaumaNumero = 4;
    }

    public double tf() {
        if (p < 0 || p > 1) {
            return -1;
        }
        return p * Math.pow(Math.E, -p * x);
    }

    public double getp() {
        return this.p;
    }

    public int getjakaumaNumero() {
        return this.jakaumaNumero;
    }

}

package ohha.hypoteesitesti.jakaumaluokat;

import org.apache.commons.math3.distribution.GeometricDistribution;

public class Geometrinen {

    private int jakaumaNumero;
    private double parvo = 0;
    
    public Geometrinen() {

        this.jakaumaNumero = 6;
    }

    public double geometrinenTesti(int k, double p, int suunta) {

        if (k < 0 || p < 0 || p > 1 || suunta < 1 || suunta > 3) {
            return -1;
        }

        // kaksisuuntainen asetelma H0: p = p0
        
        
        GeometricDistribution geom = new GeometricDistribution(p);

        double expected = (1-p)/p;
        int ylaraja = (int) expected - (int) Math.abs(k - expected); // kriittinen alue: [ylaraja, n]
                
        // esim. i = 10. H0: p>0.5 H1: p<0.5
        // 
        
        if (suunta == 2 || suunta == 3) {

            ylaraja = 0;

            for (int i = ylaraja; i <= k; i++) {
                parvo = parvo + geom.probability(i);
            }
        }

        return parvo;

    }

    public int getjakaumaNumero() {
        return this.jakaumaNumero;
    }

}

package ohha.hypoteesitesti.jakaumaluokat;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import org.apache.commons.math3.distribution.BinomialDistribution;

public class Binomi {

    private int jakaumaNumero;

    public Binomi() {
        this.jakaumaNumero = 1;
    }

    public double binomiTesti(int n, int k, double p, int suunta) {
        
        if (n < 0 || k < 1 || k > n || p < 0 || p > 1 || suunta < 1 || suunta > 3) {
            return -1;
        }

        // kaksisuuntainen asetelma H0: p = p0
        BinomialDistribution binomijakauma = new BinomialDistribution(n, p);
        
        double parvo = 0;
        int alaraja = 0; // kriittinen alue: [0, alaraja]
        int ylaraja = 0; // kriittinen alue: [ylaraja, n]

        if (suunta == 1 || suunta == 3) {

            alaraja = (int) (n * p - Math.abs(k - n * p));
                        
            
            for (int i = 0; i <= alaraja; i++) {
                parvo = parvo + binomijakauma.probability(i);
            }
        }
              

        if (suunta == 2 || suunta == 3) {

            ylaraja = (int) (n * p + Math.abs(k - n * p));
            
            if (ylaraja == alaraja) {
                ylaraja++;
            }
            
            for (int i = ylaraja; i <= n; i++) {
                parvo = parvo + binomijakauma.probability(i);
            }
        }

        return parvo;

    }

    public int getjakaumaNumero() {
        return this.jakaumaNumero;
    }

}

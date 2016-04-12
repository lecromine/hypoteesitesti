package ohha.hypoteesitesti;

import java.text.DecimalFormat;
import ohha.hypoteesitesti.jakaumaluokat.*;
import org.apache.commons.math3.distribution.BinomialDistribution;

public class Testaaja {

    public Binomi binomi;
    public Geometrinen geometrinen;
    public Bernoulli bernoulli;

    public double parvo;
    private DiskreettiAineisto diskreettiaineisto;

    public Testaaja(DiskreettiAineisto diskreettiaineisto) {
        this.diskreettiaineisto = diskreettiaineisto;
        this.parvo = 0;
    }

    public void teeTesti(int n, int k, double p, int suunta) {
        if (diskreettiaineisto.getJakauma() == 1) {
            Binomi binomi = new Binomi();
            binomi.binomiTesti(n, k, p, suunta);
        } else if (diskreettiaineisto.getJakauma() == 6) {
            bernoulliTesti(n, p);
        } else if (diskreettiaineisto.getJakauma() == 7) {
            geometrinenTesti(n, p);
        }
    }

    

    public void bernoulliTesti(int n, double p) {

    }

    public void geometrinenTesti(int n, double p) {

    }

    public void maaritaJakauma(int jakaumaNumero) {

    }

    public void maaritaTesti(int testiNumero) {

    }

}

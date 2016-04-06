package ohha.hypoteesitesti;

import java.util.ArrayList;
import ohha.hypoteesitesti.jakaumaluokat.JakaumanTyyppi;

public class DiskreettiAineisto {

    private int testi;
    private int jakauma;
    private double p;
    private int k;
    private int n;
    private JakaumanTyyppi tyyppi;

    public DiskreettiAineisto(int n, int k, double p, int testi, int jakauma) {

        if (testi == 1 || testi == 2) {
            this.testi = testi;
        }
        
        this.p = p;
        this.k = k;
        this.n = n;
        
    }

    public String getJakauma() {
        if (jakauma == 1) {
            return "binomi";
        } else if (jakauma == 2) {
            return "normaali";
        } else if (jakauma == 3) {
            return "poisson";
        } else if (jakauma == 4) {
            return "eksponentti";
        } else if (jakauma == 5) {
            return "tasainen";
        } else if (jakauma == 6) {
            return "geometrinen";
        } else if (jakauma == 7) {
            return "bernoulli";
        } else {
            return "Jakaumaa ei ole valittu";
        }
    }

    public void jakaumanaBinomi() {

    }

    public String getTesti() {
        if (testi == 1) {
            return "z-testi";
        } else if (testi == 2) {
            return "t-testi";
        } else {
            return "Testiä ei ole valittu";
        }
    }


}

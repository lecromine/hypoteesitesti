package ohha.hypoteesitesti;

import java.util.ArrayList;
import ohha.hypoteesitesti.jakaumaluokat.Bernoulli;
import ohha.hypoteesitesti.jakaumaluokat.Binomi;
import ohha.hypoteesitesti.jakaumaluokat.Geometrinen;
import ohha.hypoteesitesti.jakaumaluokat.JakaumanTyyppi;

public class DiskreettiAineisto {

    public Binomi binomi;
    public Geometrinen geometrinen;
    public Bernoulli bernoulli;

    private int testi;
    private int jakauma;
    
    private double p;
    private int k;
    private int n;
    
    private JakaumanTyyppi tyyppi;

    public DiskreettiAineisto(int n, int k, double p, int jakauma) {

        if (testi == 1 || testi == 2) {
            this.testi = testi;
        }
        
        this.jakauma = jakauma;
        this.testi = testi;
        this.p = p;
        this.k = k;
        this.n = n;

        if (jakauma == 1) {
            this.binomi = new Binomi();
        } else if (jakauma == 6) {
            this.bernoulli = new Bernoulli();
        } else if (jakauma == 7) {
            this.geometrinen = new Geometrinen();
        }

    }

    //////////////////////////////////////////////////////////////////
    // get-metodit
    /////////////////////////////////////////////////////////////////////
    
    public int getJakauma() {
        return jakauma;
    }
    
    public int getn() {
        return n;
    }
    
    public int getk() {
        return k;
    }
    
    public double getp() {
        return p;
    }
    
    public String getJakaumanNimi() {
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

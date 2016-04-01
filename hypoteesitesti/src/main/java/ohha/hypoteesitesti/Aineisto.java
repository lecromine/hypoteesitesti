package ohha.hypoteesitesti;

import java.util.ArrayList;
import ohha.hypoteesitesti.jakaumaluokat.JakaumanTyyppi;

public class Aineisto {

    private int testi;
    private int jakauma;
//    private double parametri;
//    private double onnistumiset;
    private JakaumanTyyppi tyyppi;
    private ArrayList<Integer> satunnaismuuttujat;

    public Aineisto(int testi, int jakauma, ArrayList<Integer> satunnaismuuttujat) {

        if (testi == 1 || testi == 2) {
            this.testi = testi;
        }
        if (jakauma <= 7 && jakauma >= 1) {
            this.jakauma = jakauma;
            if (jakauma == 1) {
                jakaumanaBinomi();
            }
        }
        this.satunnaismuuttujat = satunnaismuuttujat;
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

    public String getAineisto() {
        String sm = "";
        int i = 0;
        while (true) {
            if (i < satunnaismuuttujat.size() - 1) {
                sm = sm + satunnaismuuttujat.get(i) + ", ";
                i++;
            } else {
                sm = sm + satunnaismuuttujat.get(i);
                break;
            }
        }

        return sm;
    }

}

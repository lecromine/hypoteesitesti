
package ohha.hypoteesitesti;

import java.util.ArrayList;
import ohha.hypoteesitesti.jakaumaluokat.Binomi;

public class Aineisto {
    private int jakauma;
    private ArrayList<Integer> satunnaismuuttujat;
    
    
    
    public Aineisto(int jakauma, ArrayList<Integer> satunnaismuuttujat) {
        this.jakauma = jakauma;
        this.satunnaismuuttujat = satunnaismuuttujat;
    }
    
    public String getJakauma() {
        if (jakauma == 1) return "binomi";
        else if (jakauma == 2) return "normaali";
        else if (jakauma == 3) return "poisson";
        else if (jakauma == 4) return "eksponentti";
        else if (jakauma == 5) return "tasainen";
        else if (jakauma == 6) return "geometrinen";
        else if (jakauma == 7) return "bernoulli";
        else return "Jakaumaa ei valittu";
    }
    
    public ArrayList<Integer> getAineisto() {
        return satunnaismuuttujat;
    }
        
}

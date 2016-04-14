package ohha.hypoteesitesti;

import ohha.hypoteesitesti.jakaumaluokat.Bernoulli;
import ohha.hypoteesitesti.jakaumaluokat.Binomi;
import ohha.hypoteesitesti.jakaumaluokat.Eksponentti;
import ohha.hypoteesitesti.jakaumaluokat.Geometrinen;
import ohha.hypoteesitesti.jakaumaluokat.Normaali;
import ohha.hypoteesitesti.jakaumaluokat.Poisson;
import ohha.hypoteesitesti.jakaumaluokat.Tasainen;

/**
 * Tämä luokka säilyttää tiedon jakaumaa vastaavista int -arvoista sekä luo
 * uuden olion (esim. new Binomi), kun käyttäjä on syöttänyt ohjelmalle
 * testissään käyttämän jakauman.
 *
 * @author Lecromine
 */
public class JakaumanTyyppi {

    public Binomi binomi;
    public Geometrinen geometrinen;
    public Bernoulli bernoulli;

    public Normaali normaali;
    public Tasainen tasainen;
    public Poisson poisson;
    public Eksponentti eksponentti;

    int jakauma;

    /**
     * JakaumanTyyppi luo uuden jakaumaa vastaavan olion.
     *
     * @param jakauma käyttäjän valitsemaa jakaumaa vastaava int
     */
    public JakaumanTyyppi(int jakauma) {
        this.jakauma = jakauma;

        if (jakauma == 1) {
            this.binomi = new Binomi();
        } else if (jakauma == 2) {
            this.normaali = new Normaali();
        } else if (jakauma == 3) {
            this.poisson = new Poisson();
        } else if (jakauma == 4) {
            this.eksponentti = new Eksponentti();
        } else if (jakauma == 5) {
            this.tasainen = new Tasainen();
        } else if (jakauma == 6) {
            this.bernoulli = new Bernoulli();
        } else if (jakauma == 7) {
            this.geometrinen = new Geometrinen();
        }
    }

    public int getJakauma() {
        return jakauma;
    }

    /**
     * Kertoo, onko käsitelty jakauma diskreetti vai jatkuva. Jatkuvan
     * tapauksessa palauttaa false.
     *
     * @return
     */
    public boolean onkoDiskreetti() {
        if (jakauma == 1 || jakauma == 6 || jakauma == 7) {
            return true;
        } else {
            return false;
        }
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
}

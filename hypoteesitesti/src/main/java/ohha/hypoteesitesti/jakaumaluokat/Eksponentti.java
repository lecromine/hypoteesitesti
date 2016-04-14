package ohha.hypoteesitesti.jakaumaluokat;
/**
 * Tämä luokka sisältää kaikki eksponenttijakaumaan liittyvät tiedot.
 * Testauslogiikka säilytetään joko täällä tai siirretään Testaajaan: riippuu
 * siitä, kuinka pitkä testistä tulee.
 *
 * @author Lecromine
 */
public class Eksponentti {

    private double x;

    private double p;
    private int jakaumaNumero;

    public Eksponentti() {
        
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

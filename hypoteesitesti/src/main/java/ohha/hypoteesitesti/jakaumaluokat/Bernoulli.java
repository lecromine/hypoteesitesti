package ohha.hypoteesitesti.jakaumaluokat;

/**
 * Tämä luokka sisältää kaikki bernoullin jakaumaan liittyvät tiedot.
 * Testauslogiikka säilytetään joko täällä tai siirretään Testaajaan: riippuu
 * siitä, kuinka pitkä testistä tulee.
 *
 * @author Lecromine
 */

public class Bernoulli {

    private int jakaumaNumero;

    public Bernoulli() {
        this.jakaumaNumero = 7;
    }

    public double bernoulliTesti(int n, double p) {
        return 0;
    }

    public int getjakaumaNumero() {
        return this.jakaumaNumero;
    }

}

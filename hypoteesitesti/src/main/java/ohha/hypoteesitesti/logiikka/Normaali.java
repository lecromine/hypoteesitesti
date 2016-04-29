/**
 * Tämä luokka sisältää kaikki normaaliin jakaumaan liittyvät tiedot.
 * Testauslogiikka säilytetään joko täällä tai siirretään Testaajaan: riippuu
 * siitä, kuinka pitkä testistä tulee.
 *
 * @author Lecromine
 */
package ohha.hypoteesitesti.logiikka;

import ohha.hypoteesitesti.gui.Vikailmoitus;

public class Normaali {

    double parvo;
    public Testisuure testisuure = new Testisuure();

    public Normaali() {
    }

    public double teeNormaaliTesti(int n, double ka, double s, double p, int suuntaNumero, int testi) {
        

        if (n <= 0
                || ka <= 0
                || s <= 0
                || p <= 0
                || testi < 1
                || testi > 3) {
            return -1;
        } else {

            switch (testi) {
                case 1:
                    parvo = OdotusarvoVarianssiTunnettu(n, ka, s, p, suuntaNumero);
                    break;
                case 2:
                    parvo = Odotusarvo(n, ka, s, p, suuntaNumero);
                    break;
                case 3:
                    parvo = Varianssi(n, s, p);
                    break;
                default:
                    new Vikailmoitus().setVisible(true);
                    return -1;
            }
            return parvo;
        }

    }

    /**
     * Normaalitesti joko t- tai z-testillä. Koodi on kesken. Tämä metodi laskee
     * p-arvon, kun käyttäjä on syöttänyt otoskeskiarvon ja -hajonnan erikseen.
     *
     * @param n otoskoko
     * @param ka otoskeskiarvo
     * @param s otoskeskihajonta
     * @param p nollahypoteesia vastaava parametri
     * @return p-arvo
     */
    public double Odotusarvo(int n, double ka, double s, double p, int suuntaNumero) {

        return testisuure.tTesti(n, ka, p, s, suuntaNumero);
    }

    /**
     * Testaa normaalin jakauman hypotetisoitua odotusarvoa silloin, kun
     * tiedetään varmasti, mikä on varianssin arvo.
     *
     * @param n otoskoko
     * @param ka otoskeskiarvo
     * @param var varianssi
     * @param p nollahypoteesi odotusarvosta
     * @param suuntaNumero  onko testi esim. kaksisuuntainen jne
     * @return p-arvo
     */
    public double OdotusarvoVarianssiTunnettu(int n, double ka, double var, double p, int suuntaNumero) {
        return testisuure.zTesti(n, ka, p, var, suuntaNumero);
    }

    /**
     * Testaa normaalijakauman varianssia Khii-toiseen -testillä.
     *
     * @param n otoskoko
     * @param s otoskeskihajonta
     * @param p nollahypoteesia varianssin arvosta
     * @return parvo
     */
    public double Varianssi(int n, double s, double p) {
        return testisuure.khiiToiseenTesti(n, s, p);
    }

}

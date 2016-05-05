package ohha.hypoteesitesti.logiikka;

import ohha.hypoteesitesti.gui.Vikailmoitus;

public class Normaali {

    double parvo;
    public Testisuure testisuure = new Testisuure();

    /**
     * Tämä luokka sisältää kaikki normaaliin jakaumaan liittyvät tiedot.
     * Testauslogiikka säilytetään joko täällä tai siirretään Testaajaan:
     * riippuu siitä, kuinka pitkä testistä tulee.
     *
     * @author Lecromine
     */
    
    public Normaali() {
    }

    /**
     * teeNormaaliTesti hakee normaalille jakaumalle p-arvot.
     * @param n     otoskoko
     * @param ka    otoskeskiarvo
     * @param s     otoskeskihajonta
     * @param p     nollahypoteesi
     * @param suuntaNumero  kertoo, onko testi yksi- vai kaksisuuntainen
     * @param testi         kertoo, suoritetaanko varianssin vai odotusarvon testi
     * @return parvo
     */
    
    public double teeNormaaliTesti(int n, double ka, double s, double p, int suuntaNumero, int testi) {

        if (n <= 1
                || ka <= 0
                || s <= 0
                || p <= 0
                || testi < 1
                || testi > 3) {
            return -1;
        } else {

            switch (testi) {
                case 1:
                    parvo = odotusarvoVarianssiTunnettu(n, ka, s, p, suuntaNumero);
                    break;
                case 2:
                    parvo = odotusarvo(n, ka, s, p, suuntaNumero);
                    break;
                case 3:
                    parvo = varianssi(n, s, p);
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
     * @param suuntaNumero kertoo onko kyseessä esim. kaksisuuntainen testi
     * @return p-arvo
     */
    
    public double odotusarvo(int n, double ka, double s, double p, int suuntaNumero) {

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
     * @param suuntaNumero onko testi esim. kaksisuuntainen jne
     * @return p-arvo
     */
    public double odotusarvoVarianssiTunnettu(int n, double ka, double var, double p, int suuntaNumero) {
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
    public double varianssi(int n, double s, double p) {
        return testisuure.khiiToiseenTesti(n, s, p);
    }

}

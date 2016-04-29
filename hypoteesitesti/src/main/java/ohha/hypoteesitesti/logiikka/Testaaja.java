package ohha.hypoteesitesti.logiikka;

public class Testaaja {

    public double parvo;

    /**
     * Testaaja on yhteydessä Normaaliin ja Binomiin (luokkia). Lisäksi se
     * välittää saadun p-arvon mainille.
     *
     * @author Lecromine
     */
    
    public Testaaja() {
        this.parvo = 0;
    }

    /**
     * Lähettää käyttäjän syöttämät arvot Binomi-luokalle, joka suorittaa
     * binomitestin.
     *
     * @param n otoskoko
     * @param k "onnistumisten" lukumäärä (kolikonheitossa esim. klaavojen
     * määrä)
     * @param p parametrin arvo nollahypoteesissa
     * @param suuntaNumero kokonaisluku 1, 2 tai 3 joka kertoo, onko testi yksi
     * vai kaksisuuntainen
     * @return p-arvo
     */
    public double teeBinomiTesti(int n, int k, double p, int suuntaNumero) {
        Binomi binomi = new Binomi();
        return binomi.teeBinomiTesti(n, k, p, suuntaNumero);
    }

    /**
     * teeJatkuvaTesti testaa jatkuvaa aineistoa mm. t-testillä
     *
     * @param n otoskoko
     * @param ka otoskeskiarvo
     * @param s keskihajonta
     * @param p hypoteesi odotusarvosta
     * @param suuntaNumero  kertoo tehdäänkö esim. kaksisuuntainen testi
     * @param testi lukuarvona 1, 2 tai 3. Kertoo, mikä testi ajetaan:
     * odotusarvon testi, kun varianssi on tunnettu/tuntematon, vai varianssin
     * testi.
     * @return parvo
     */
    public double normaaliTesti(int n, double ka, double s, double p, int suuntaNumero, int testi) {
        Normaali normaali = new Normaali();
        return normaali.teeNormaaliTesti(n, ka, s, p, suuntaNumero, testi);
    }
}

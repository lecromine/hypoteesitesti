package ohha.hypoteesitesti.logiikka;

import java.text.DecimalFormat;
import ohha.hypoteesitesti.gui.Vikailmoitus;
import org.apache.commons.math3.distribution.BinomialDistribution;
import org.apache.commons.math3.distribution.GeometricDistribution;
import org.apache.commons.math3.stat.inference.AlternativeHypothesis;
import org.apache.commons.math3.stat.inference.BinomialTest;
import org.apache.commons.math3.stat.inference.TTest;

/**
 * Testaajan tehtävä on vastaanottaa käyttäjän syöttämät arvot ja tehdä testi
 * niiden perusteella.
 *
 * @param parvo tähän muuttujaan tallennetaan saatu p-arvo
 * @param JakaumanTyyppi JakaumanTyypin pääasiallinen tehtävä on pitää
 * muistissa, onko aineisto diskreetti/jakautunut sekä jakauman nimi
 *
 */
public class Testaaja {

    public double parvo;

    public Testaaja() {
        this.parvo = 0;
    }

    /**
     * teeTesti suorittaa testin
     *
     * @param n diskreetin aineiston otoskoko
     * @param k diskreetin aineiston onnistumisten lukumäärä
     * @param p diskreetin aineiston nollahypoteesin parametri
     * @param suunta diskreetin aineiston suunta: kaksisuuntainen, suurempaa
     * kuin, pienempää kuin
     * @return parvo palauttaa testin mukaisen p-arvon sitä kutsuneelle luokalle
     */
    public double teeBinomiTesti(int n, int k, double p, int suunta) {

        if (n <= 0) {
            return -1;
        } else if (k < 0) {
            return -1;
        } else if (k > n) {
            return -1;
        } else if (p < 0) {
            return -1;
        } else if (p > 1) {
            return -1;
        } else if (suunta < 1) {
            return -1;
        } else if (suunta > 3) {
            return -1;
        } else {

            BinomialTest binomi = new BinomialTest();

            if (suunta == 1) {
                parvo = binomi.binomialTest(n, k, p, AlternativeHypothesis.GREATER_THAN);
            } else if (suunta == 2) {
                parvo = binomi.binomialTest(n, k, p, AlternativeHypothesis.LESS_THAN);
            } else if (suunta == 3) {
                parvo = binomi.binomialTest(n, k, p, AlternativeHypothesis.TWO_SIDED);
            }

            return parvo;
        }
    }

    /**
     * teeJatkuvaTesti testaa jatkuvaa aineistoa mm. t-testillä
     *
     * @param n otoskoko
     * @param ka otoskeskiarvo
     * @param s keskihajonta
     * @param p hypoteesi odotusarvosta
     * @return parvo
     */
    public double teeNormaaliTesti(int n, double ka, double s, double p, int testi) {
        Normaali normaali = new Normaali();

        if (n <= 0
                || ka <= 0
                || s <= 0
                || p <= 0
                || testi < 1
                || testi > 3) {
            return -1;
        } else {

            if (testi == 1) {
                parvo = normaali.testaaNormaaliOdotusarvoVarianssiTunnettu(n, ka, s, p);
            } else if (testi == 2) {
                parvo = normaali.testaaNormaaliOdotusArvo(n, ka, s, p);
            } else if (testi == 3) {
                parvo = normaali.testaaNormaaliVarianssi(n, s, p);
            } else {

                new Vikailmoitus().setVisible(true);
                return -1;
            }

            return parvo;
        }
    }

}

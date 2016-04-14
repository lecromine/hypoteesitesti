package ohha.hypoteesitesti;

import java.text.DecimalFormat;
import ohha.hypoteesitesti.jakaumaluokat.*;
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
 *
 */
public class Testaaja {

    public double parvo;

    private JakaumanTyyppi jakaumantyyppi;

    public Testaaja(JakaumanTyyppi jakaumantyyppi) {
        this.jakaumantyyppi = jakaumantyyppi;
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
    public double teeTesti(int n, int k, double p, int suunta) {

        if (n < 0 || k < 1 || k > n || p < 0 || p > 1 || suunta < 1 || suunta > 3) {
            return -1;
        }

        if (jakaumantyyppi.getJakauma() == 1) {

            BinomialTest binomi = new BinomialTest();

            if (suunta == 1) {
                parvo = binomi.binomialTest(n, k, p, AlternativeHypothesis.GREATER_THAN);
            } else if (suunta == 2) {
                parvo = binomi.binomialTest(n, k, p, AlternativeHypothesis.LESS_THAN);
            } else if (suunta == 3) {
                parvo = binomi.binomialTest(n, k, p, AlternativeHypothesis.TWO_SIDED);
            }

//            tulosteKayttajalle(n, k, p, suunta, parvo);
        } else if (jakaumantyyppi.getJakauma() == 6) {
            Bernoulli bernoulli = new Bernoulli();
            parvo = bernoulli.bernoulliTesti(n, p);
        } else if (jakaumantyyppi.getJakauma() == 7) {

            GeometricDistribution geom = new GeometricDistribution(p);

            System.out.println("geom: " + geom.cumulativeProbability(k));

//            Geometrinen geom = new Geometrinen();
//            parvo = geom.geometrinenTesti(n, p, suunta);
        }

        return parvo;

    }

    /**
     * tulosteKayttajalle on koodauksen alkuvaiheessa tehty tulosriville
     * ilmestyvä teksti, joka helpottaa koodaamista. Tämä osa koodia poistetaan
     * lopullisessa versiossa.
     *
     * @param n otoskoko
     * @param k onnistumisten lkm
     * @param p nollahypoteesin mukainen parametri
     * @param suunta yksisuuntainen, suurempi kuin, pienempi kuin
     * @param parvo teeTesti() :n laskema p-arvo
     */
    public void tulosteKayttajalle(int n, int k, double p, int suunta, double parvo) {

        DecimalFormat df = new DecimalFormat("##.######");

        System.out.println("-----------------------------------");
        System.out.println("Kokeita: " + n);
        System.out.println("Onnistumisia: " + k);

        if (suunta == 3) {
            System.out.println("Nollahypoteesi: p = " + p);
        } else if (suunta == 1) {
            System.out.println("Nollahypoteesi: p >= " + p);
            System.out.println("Vastahypoteesi: p < " + p);
        } else if (suunta == 2) {
            System.out.println("Nollahypoteesi: p <= " + p);
            System.out.println("Vastahypoteesi: p > " + p);
        }

        System.out.println("-----------------------------------");

        System.out.println("p-arvo " + parvo);

        if (parvo < 0.1) {
            if (parvo < 0.05) {
                if (parvo < 0.01) {
                    System.out.println("Todennäköisyys saada oheinen aineisto nollahypoteesin pätiessä on "
                            + df.format(parvo) + ".");
                    System.out.println("Nollahypoteesi hylätään merkitsevyystasolla 0.01");
                } else if (parvo > 0.01) {
                    System.out.println("Todennäköisyys saada oheinen aineisto nollahypoteesin pätiessä on "
                            + df.format(parvo) + ".");
                    System.out
                            .println("Nollahypoteesi hylätään merkitsevyystasolla 0.01 mutta hyväksytään tasolla 0.05");
                }
            } else {

                System.out.println(
                        "Todennäköisyys saada oheinen aineisto nollahypoteesin pätiessä on " + df.format(parvo) + ".");
                System.out.println("Nollahypoteesi hylätään merkitsevyystasolla 0.05 mutta hyväksytään tasolla 0.1");

            }

        } else if (parvo > 0.1) {
            System.out.println(
                    "Todennäköisyys saada saatu aineisto nollahypoteesin pätiessä on " + df.format(parvo) + ".");
            System.out.println("Nollahypoteesi hylätään merkitsevyystasolla 0.1");
        }
    }

}

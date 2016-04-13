package ohha.hypoteesitesti;

import java.text.DecimalFormat;
import ohha.hypoteesitesti.jakaumaluokat.*;
import org.apache.commons.math3.distribution.BinomialDistribution;
import org.apache.commons.math3.distribution.GeometricDistribution;
import org.apache.commons.math3.stat.inference.AlternativeHypothesis;
import org.apache.commons.math3.stat.inference.BinomialTest;
import org.apache.commons.math3.stat.inference.TTest;

public class Testaaja {

    public double parvo;

    private DiskreettiAineisto diskreettiaineisto;

    public Testaaja(DiskreettiAineisto diskreettiaineisto) {
        this.diskreettiaineisto = diskreettiaineisto;
        this.parvo = 0;
    }

    public double teeTesti(int n, int k, double p, int suunta) {
        if (diskreettiaineisto.getJakauma() == 1) {

            BinomialTest binomi = new BinomialTest();
            
            if (suunta == 1) {
                parvo = binomi.binomialTest(n, k, p, AlternativeHypothesis.GREATER_THAN);
            } else if (suunta == 2) {
                parvo = binomi.binomialTest(n, k, p, AlternativeHypothesis.LESS_THAN);
            } else if (suunta == 3) {
                parvo = binomi.binomialTest(n, k, p, AlternativeHypothesis.TWO_SIDED);
            }
            tulosteKayttajalle(n, k, p, suunta, parvo);
            
        } else if (diskreettiaineisto.getJakauma() == 6) {
            Bernoulli bernoulli = new Bernoulli();
            parvo = bernoulli.bernoulliTesti(n, p);
        } else if (diskreettiaineisto.getJakauma() == 7) {
            
            GeometricDistribution geom = new GeometricDistribution(p);
            
            System.out.println("geom: " + geom.cumulativeProbability(k));
            
//            Geometrinen geom = new Geometrinen();
//            parvo = geom.geometrinenTesti(n, p, suunta);
        }

        return parvo;

    }

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

    public void maaritaJakauma(int jakaumaNumero) {

    }

    public void maaritaTesti(int testiNumero) {

    }

}

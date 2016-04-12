package ohha.hypoteesitesti.jakaumaluokat;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import org.apache.commons.math3.distribution.BinomialDistribution;

public class Binomi {

    private int jakaumaNumero;
    private double parvo;

    public Binomi() {
        this.jakaumaNumero = 1;
    }

    
    public double binomiTesti(int n, int k, double p, int suunta) {
        
        if (n < 0 || k < 1 || k > n || p < 0 || p > 1 || suunta < 1 || suunta > 3) {
            return -1;
        }
        
        // kaksisuuntainen asetelma H0: p = p0
        DecimalFormat df = new DecimalFormat("##.######");
        BinomialDistribution binomijakauma = new BinomialDistribution(n, p);

        int alaraja = 0; // kriittinen alue: [0, alaraja]
        int ylaraja = 0; // kriittinen alue: [ylaraja, n]

        if (suunta == 1 || suunta == 3) {

            alaraja = (int) (n * p - Math.abs(k - n * p));
            for (int i = 0; i <= alaraja; i++) {
                parvo = parvo + binomijakauma.probability(i);
            }

        }

        if (suunta == 2 || suunta == 3) {

            ylaraja = (int) (n * p + Math.abs(k - n * p));

            for (int i = ylaraja; i <= n; i++) {
                parvo = parvo + binomijakauma.probability(i);
            }
        }

        // Aluksi tutkitaan merkitsevyystaso a = 0.05
        System.out.println("-----------------------------------");
        System.out.println("Kokeita: " + n);
        System.out.println("Onnistumisia: " + k);
        System.out.println("Nollahypoteesi: p = " + p);

        if (suunta == 1) {
            System.out.println("Vastahypoteesi: p < " + p);
        } else if (suunta == 2) {
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

        
        return parvo;
        
    }
    
    public int getjakaumaNumero() {
        return this.jakaumaNumero;
    }

}

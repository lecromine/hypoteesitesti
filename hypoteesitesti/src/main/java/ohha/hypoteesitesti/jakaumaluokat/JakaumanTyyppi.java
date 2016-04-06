package ohha.hypoteesitesti.jakaumaluokat;

public class JakaumanTyyppi {

    private Binomi binomi;
    private Geometrinen geometrinen;
    private Bernoulli bernoulli;

    private Normaali normaali;
    private Tasainen tasainen;
    private Poisson poisson;
    private Eksponentti eksponentti;

    public JakaumanTyyppi(int jakauma) {
        if (jakauma == 1 || jakauma == 6 || jakauma == 7) {
            diskreetti(jakauma);
        } else if (jakauma == 2 || jakauma == 3 || jakauma == 4 || jakauma == 5) {
            jatkuva(jakauma);
        }
    }

    public void diskreetti(int jakauma) {
        
    }

    public void jatkuva(int jakauma) {
        
    }
}

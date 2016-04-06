package ohha.hypoteesitesti.jakaumaluokat;

public class JakaumanTyyppi {



    private Normaali normaali;
    private Tasainen tasainen;
    private Poisson poisson;
    private Eksponentti eksponentti;

    private boolean diskreetti;
    private boolean jatkuva;

    public JakaumanTyyppi(int jakauma) {
        if (jakauma == 1 || jakauma == 6 || jakauma == 7) {
            this.diskreetti = true;
        } else if (jakauma == 2 || jakauma == 3 || jakauma == 4 || jakauma == 5) {
            this.jatkuva = true;
        }
    }
    

    public boolean onkoDiskreetti() {
        if (diskreetti == true) {
            return true;
        } else {
            return false;
        }
    }

    public boolean onkoJatkuva() {
        if (jatkuva == true) {
            return true;
        } else {
            return false;
        }
    }
}

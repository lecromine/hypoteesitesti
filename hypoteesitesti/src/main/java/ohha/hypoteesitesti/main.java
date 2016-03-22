
package ohha.hypoteesitesti;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
      public static void main(String[] args) {
          
          Scanner lukija = new Scanner(System.in);
          
          ArrayList<Integer> aineisto = new ArrayList<Integer>();
          
          System.out.println("Aineiston tiedot.");
          System.out.println("Syötä aineisto ja lopuksi -1:");
          int x = 0;
          while (true) {
              
              x = Integer.parseInt(lukija.nextLine());
              if (x == -1) break;
              aineisto.add(x);
          }
          
          for (int i = 0; i < aineisto.size(); i++) {
              System.out.print(aineisto.get(i));
          }
          
          int jakauma = 0;
          while (jakauma == 0) {
            System.out.println("Valitse jakauma: ");
            System.out.println("binomi / normaali / poisson / eksponentti / tasainen / geometrinen / bernoulli");
            String jakaumanValinta = lukija.nextLine();
          
        
          
            if (jakaumanValinta.equals("binomi")) jakauma = 1;
            else if (jakaumanValinta.equals("normaali")) jakauma = 2;
            else if (jakaumanValinta.equals("poisson")) jakauma = 3;
            else if (jakaumanValinta.equals("eksponentti")) jakauma = 4;
            else if (jakaumanValinta.equals("tasainen")) jakauma = 5;
            else if (jakaumanValinta.equals("geometrinen")) jakauma = 6;
            else if (jakaumanValinta.equals("bernoulli")) jakauma = 7;
            else System.out.println("Valitse jokin annetuista jakaumista.");
          }
          
          System.out.println("Valitse testi: ");
          System.out.println("z-testi / t-testi");
          String testiValinta = lukija.nextLine();
          
          
          System.out.println("Onko testi yksisuuntainen vai kaksisuuntainen?");
          
          
          // testi(aineisto, jakauma);
          
          
      }
}

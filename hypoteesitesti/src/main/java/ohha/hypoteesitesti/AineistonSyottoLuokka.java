/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ohha.hypoteesitesti;

import java.util.ArrayList;
import java.util.Scanner;

public class AineistonSyottoLuokka {
        
    public static Aineisto syotaAineisto() {
        // Käyttäjä syöttää aineistonsa ohjelmalle.
          
          Scanner lukija = new Scanner(System.in);
          
          ArrayList<Integer> aineistoLista = new ArrayList<Integer>();
          
          System.out.println("Aineiston tiedot.");
          System.out.println("Syötä aineisto ja lopuksi -1:");
          
          int x;
          while (true) {
              
              x = Integer.parseInt(lukija.nextLine());
              if (x == -1) break;
              aineistoLista.add(x);
          }
          
          for (int i = 0; i < aineistoLista.size(); i++) {
              System.out.print(aineistoLista.get(i));
          }
          
          // Ohjelma kysyy jakaumaa niin kauan, että käyttäjä syöttää hyväksyttävän arvon.
          
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
            else System.out.println("Syote ei kelpaa. Valitse jokin annetuista jakaumista.");
          }
          
          Aineisto aineisto = new Aineisto(jakauma, aineistoLista);
          
          // Sama juttu testin kysymysessä.
          
          int testi = 0;
          
          while (testi == 0) {
              System.out.println("Valitse testi: ");
              System.out.println("z-testi / t-testi");
              String testiValinta = lukija.nextLine();
              
              if (testiValinta.equals("z-testi")) testi = 1;
              else if (testiValinta.equals("t-testi")) testi = 2;
              else System.out.println("Syote ei kelpaa. Valitse jokin annetuista testeistä.");
              
          }
    
    return aineisto;
    }
}

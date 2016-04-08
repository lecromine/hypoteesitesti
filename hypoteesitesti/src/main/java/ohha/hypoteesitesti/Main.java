package ohha.hypoteesitesti;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;
import ohha.hypoteesitesti.jakaumaluokat.Binomi;

public class Main {

    public static void main(String[] args) {

        AineistonSyottoLuokka aineistonsyottoluokka = new AineistonSyottoLuokka();
        
        System.out.println("Huom! Ohjelma suorittaa toistaiseksi pelkästään binomitestejä.");
        
        aineistonsyottoluokka.syotaAineisto();
        
    }
}

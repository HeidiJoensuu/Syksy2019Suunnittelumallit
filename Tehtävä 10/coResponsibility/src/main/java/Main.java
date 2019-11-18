
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Heidi
 */
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        LahiEsimies esimies = new LahiEsimies();
        Paallikko paallikko = new Paallikko();
        Toimitusjohtaja johtaja = new Toimitusjohtaja();
        esimies.setKasittely(paallikko);
        paallikko.setKasittely(johtaja);
        
        double palkka = 4200;
        double toive;
        double prosentti;
        System.out.println("Palkkasi on " + palkka +". Minkä haluaisit uudeksi palkaksesi?");
        try {
            toive = s.nextInt();
            if (toive <= palkka) {
                System.out.println("Etkö halunnutkaan palkankorotusta?");
            } else {
                prosentti = toive/palkka;
                System.out.println(prosentti);
                esimies.käsittele(new KorotusToive(prosentti));
            }
        } catch (Exception e){
            System.out.println("Toiveesi ei ollut numeroita!");
        }

    }
}

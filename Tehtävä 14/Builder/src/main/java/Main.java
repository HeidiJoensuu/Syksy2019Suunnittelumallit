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
        Tilaus tilaus = new Tilaus();
        HampurilaisBuilder tuplaJuusto = new BurgerKing();
        HampurilaisBuilder juusto = new Hesburger();
        System.out.println("Hesburgerin juusto:");

        tilaus.setHamppariBuilder(juusto);
        tilaus.kokoaHamppari();
        
        Hampurilainen juustoisa = tilaus.getBurger();
        juustoisa.getAinekset();
        
        tilaus.setHamppariBuilder(tuplaJuusto);
        tilaus.kokoaHamppari();
        Hampurilainen juustoisampi = tilaus.getBurger();
         System.out.println("Burgerkingin tuplajuusto:");
        juustoisampi.getAinekset();
        
    }
}

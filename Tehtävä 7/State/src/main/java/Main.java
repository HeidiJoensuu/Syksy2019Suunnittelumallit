
import java.awt.BorderLayout;
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
        Komennot komenna = new Komennot();
        Scanner s = new Scanner(System.in);
        String selected;
        System.out.println("Sinulla on käytössäsi psychic-tyyppinen pokemon, jota voit komentaa luomaan erilaisia iskuja.");

        do {            
            System.out.println("\n\n\n");
            System.out.println("(1) Tarkista pokemonisi.");
            System.out.println("(2) hypnoosi");
            System.out.println("(3) varjopallo");
            System.out.println("(4) signaalisäihke");
            System.out.println("(5) Kehitä pokemoniasi.");
            System.out.println("(6) Ota pokemonisi talteen myöhempää ottelua varten. [EXIT]\n\n");
            selected = s.nextLine();

            switch(selected){
                case "1":
                    System.out.println("Sinun pokemonisi on " +  komenna.nimi()); 
                break;
                case "2":
                    komenna.hypnoosi(); 
                break;
                 case "3":
                    komenna.varjoPallo();
                break;
                 case "4":
                    komenna.signaaliSäihke();
                break;
                 case "5":
                    komenna.kehitäPokemon();    
                break;
                case "6":
                break;
            }
        } while (!selected.equals("6"));
    }
}

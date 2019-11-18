
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
public class KVPGame extends Game {
    OpponentChoice opponent;
    Compare comare;
    String move1=null;
    String move2= "tie";
    String end = "tie";
    Scanner s = new Scanner(System.in);
    String selected;
    /* Implementation of necessary concrete methods */
    void initializeGame() {
        System.out.println("Kivi-Sakset-Paperi!\n"); 
        opponent = new OpponentChoice();
        comare = new Compare();
    }
    void makePlay(int player) {
        if (player == 0){
            System.out.println("Valintasi on:");
            move1=s.nextLine().toLowerCase();             
        }
        if (player == 1){
            move2 = opponent.choice();
            System.out.println("Vastustajasi valinta:");
            System.out.println(move2);
            end = comare.compare(move1, move2);   
        }
    }
    boolean endOfGame() {
        if (end != "tie"){
            return true;
        } else return false;
    }
    void printWinner() {
        if (end == move1){
            System.out.println("Voitit!");
        }
        if (end == move2){
            System.out.println("Hävisit...");
        }
    }
    /* Specific declarations for the game. */
    


}

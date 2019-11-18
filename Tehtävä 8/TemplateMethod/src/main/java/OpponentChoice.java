
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Heidi
 */
public class OpponentChoice {
    String kivi = "kivi", paperi = "paperi", sakset ="sakset";
    Random r = new Random();
    
    public String choice(){
        int random = r.nextInt(3);
        if (random == 0){
            return kivi;
        }
        if (random == 1){
            return sakset;
        }
        if (random == 2){
            return paperi;
        }
        return "tie";
    }
    
}

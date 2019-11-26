/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Heidi
 */
public class Velho {
    int elinvoimat;
    public Velho(int elinvoima){
        this.elinvoimat = elinvoima;
    }
    
    public int loitsi(){
        return 35;
    }
    public int kiroa(){
        return 99;
    }
    public String arvoNimi(){
        return "Suuri Merlin";
    }

    public int getElinvoimat() {
        return elinvoimat;
    }
    
}

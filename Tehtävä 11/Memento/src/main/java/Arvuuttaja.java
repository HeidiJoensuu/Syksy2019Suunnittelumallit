
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * (Originator)
 * @author Heidi
 */
public class Arvuuttaja {
    Random r = new Random();

    public void liityPeliin(Asiakkaat a){
        a.addMemento(new Memento(r.nextInt(100)));
    }
    public boolean arvaus(Asiakkaat a, int arvaus){
        return a.getMemento().getVastaus()==arvaus;
    }
    
}

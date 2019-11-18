
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Heidi
 */
public class Composition {
    private IListConverter stategy;
    
    
    public Composition(IListConverter stategy){
        this.stategy = stategy;
    }

    
    public void print(ArrayList<String> alkiot){
        stategy.listToString(alkiot);
    }
    
    public void setStrategy(IListConverter stategy){
        this.stategy = stategy;
    }
}

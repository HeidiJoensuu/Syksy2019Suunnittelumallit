
import java.util.Observable;
import java.util.Observer;
import javax.security.auth.Subject;
import jdk.nashorn.api.tree.BreakTree;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Heidi
 */
public class FirstClock implements Cloneable{
    Viisari sekuntti = new Viisari(37);
    Viisari minuutti = new Viisari(26);
    Viisari tunti = new Viisari(14);

    
    public FirstClock(){
        
    }
    
    @Override
    public Object clone() throws CloneNotSupportedException{
        FirstClock cloned = (FirstClock)super.clone();
        return cloned;
    }
    
    public void tok(){ 
        sekuntti.tik();
        if (sekuntti.getAika()==60){
            sekuntti.setAika(0);
            minuutti.tik();
        }
        if (minuutti.getAika()==60){
            minuutti.setAika(0);
            tunti.tik();
        }
        if(tunti.getAika()==24){
            tunti.setAika(0);
        }
        System.out.println("Time: "+ tunti.getAika() +":"+minuutti.getAika() +":"+sekuntti.getAika());
    }
}
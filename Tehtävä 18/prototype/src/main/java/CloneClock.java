
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Heidi
 */
public class CloneClock implements Cloneable{
    private FirstClock clock = new FirstClock();
    
    public FirstClock getClock(){
        return clock;
    }
    public CloneClock clone() throws CloneNotSupportedException{
        CloneClock c = (CloneClock)super.clone();
        System.out.println(clock);
        c.clock = (FirstClock)clock.clone();
        c.clock.sekuntti.setAika(50);
        c.clock.minuutti.setAika(59);
        c.clock.tunti.setAika(23);
        return c;
    }
    
}

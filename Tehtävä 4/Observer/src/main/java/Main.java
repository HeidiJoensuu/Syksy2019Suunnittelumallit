
import java.util.concurrent.CompletableFuture;

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
    public static void main(String[] args) throws InterruptedException {
        boolean paalla = true;
        ClockTimer timer = new ClockTimer();

        DigitalClock digitalClock = new DigitalClock(timer);
        AnalogClock analogClock = new AnalogClock(timer);
        
        while (paalla == true){
            Thread.sleep(1000);
            timer.tick();
        } 
    }

}


import java.util.Observable;
import java.util.Observer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Heidi
 */
public class AnalogClock implements Observer{
    private ClockTimer timer;
    
    public AnalogClock(ClockTimer ct){
        timer = ct;
        timer.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o==timer){
            draw();
        }
    }
    private void draw(){
        int hour = timer.getHour();
        int minute = timer.getMinute();
        int second = timer.getSecond();
        System.out.println("Analog Clock: "+hour + "." + minute + "." + second);
    }
}

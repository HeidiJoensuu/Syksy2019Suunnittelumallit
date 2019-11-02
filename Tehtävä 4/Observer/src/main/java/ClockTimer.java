
import java.util.Observable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Heidi
 */
public class ClockTimer extends Observable{
    private int hour, minute, second;
    //muuttujat

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }
    
    void tick(){
        second++;
        if (second >= 60){
            second = 0;
            minute++;
        }
        if(minute>= 60){
            minute =0;
            hour++;
        }
        setChanged();
        notifyObservers();
    }
}

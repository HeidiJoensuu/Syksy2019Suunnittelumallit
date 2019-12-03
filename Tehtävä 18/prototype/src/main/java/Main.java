
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
    public static void main(String[] args) throws InterruptedException, CloneNotSupportedException {
        FirstClock first = new FirstClock();
        CloneClock second = new CloneClock();
        Boolean loop = true;   
        second.clone();
        
        while(loop){
            Thread.sleep(1000);
            first.tok();
            second.getClock().tok();
        }
        
    
    }

}

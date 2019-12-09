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
    public static void main(String[] args){
    Light lamp = new Light();
    SilverScreen SS = new SilverScreen();
    ICommand switchUp = new FlipUpCommand(lamp);
    ICommand switchDown = new FlipDownCommand(lamp);
    ICommand screenDown = new GetDownCMD(SS);
    ICommand screenUp = new GetUpCMD(SS);
    WallButton button1 = new WallButton(switchUp, screenDown);
    WallButton button2 = new WallButton(switchDown, screenUp);
    button1.push();
    button2.push();
}
    
}

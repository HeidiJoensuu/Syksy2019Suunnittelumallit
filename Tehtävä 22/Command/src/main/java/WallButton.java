/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Heidi
 */
public class WallButton {
    ICommand cmd;
    ICommand cmd2;
    public  WallButton(ICommand cmd, ICommand cmd2){
        this.cmd = cmd;
        this.cmd2 = cmd2;
    }
    public void push(){
        cmd.execute();
        cmd2.execute();
    }
}

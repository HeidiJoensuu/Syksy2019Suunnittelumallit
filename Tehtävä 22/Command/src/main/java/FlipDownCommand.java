/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Heidi
 */
public class FlipDownCommand implements ICommand {
    private Light light;
    public FlipDownCommand(Light light) {
        this.light = light;
    }
    
    @Override // Command
    public void execute() {
        light.turnOff();
    }
}
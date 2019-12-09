/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Heidi
 */
public class FlipUpCommand implements ICommand {
    private Light light;
    public FlipUpCommand(Light light) {
        this.light = light;
    }
    
    @Override // Command
    public void execute() {
        light.turnOn();
    }
}

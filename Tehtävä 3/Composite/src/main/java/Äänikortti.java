/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Heidi
 */
public class Äänikortti implements ILaiteOsa{
    private double x = 12.25;
    
    public Äänikortti(){
    }
    
    @Override
    public double hinta() {
        return x;
    }

    @Override
    public void lisaaOsa(ILaiteOsa osa) {
        throw new RuntimeException("Plaa Plaa");
        }
}

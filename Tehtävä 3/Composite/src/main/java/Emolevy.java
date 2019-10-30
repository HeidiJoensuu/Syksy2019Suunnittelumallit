/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Heidi
 */
public class Emolevy implements ILaiteOsa{
    private double x = 57.80;
    ILaiteOsa[] osat = {new Verkonohjain(), new Äänikortti(), new Suoritin()};
    
    public Emolevy(){
    }
    
    @Override
    public double hinta() {
        double y = x;
        for (ILaiteOsa o : osat){
            y += o.hinta();
        }
        return y;
    }

    @Override
    public void lisaaOsa(ILaiteOsa osa) {
        throw new RuntimeException("Plaa Plaa");
        }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Heidi
 */
public class Verkonohjain implements ILaiteOsa{
    private double x = 8;
    
    public Verkonohjain(){
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

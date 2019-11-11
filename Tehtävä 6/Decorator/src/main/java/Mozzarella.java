/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Heidi
 */
public class Mozzarella extends Taytteet{
    
    public Mozzarella(ITayte täytteet) {
        super(täytteet);
    }
    
    @Override
    public double getHinta() {
        return super.getHinta() + 2.00;
    }

    @Override
    public String getNimi() {
        return super.getNimi() + " mozzarellaa";
    }
}

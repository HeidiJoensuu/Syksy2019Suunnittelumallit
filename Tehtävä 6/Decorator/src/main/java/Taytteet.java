/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Heidi
 */
public class Taytteet implements ITayte{
    protected ITayte täytteet;
    
    public Taytteet(ITayte täytteet){
        this.täytteet = täytteet;
    }

    @Override
    public double getHinta() {
        return täytteet.getHinta();
    }

    @Override
    public String getNimi() {
        return täytteet.getNimi();
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Heidi
 */
public class Tomaatti extends Taytteet{
    
    public Tomaatti(ITayte täytteet) {
        super(täytteet);
    }
    
    @Override
    public double getHinta() {
        return super.getHinta() + 0.80;
    }

    @Override
    public String getNimi() {
        return super.getNimi() + " kirsikkatomaattia";
    }
}

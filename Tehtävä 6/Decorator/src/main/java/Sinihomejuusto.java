/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Heidi
 */
public class Sinihomejuusto extends Taytteet{
    
    public Sinihomejuusto(ITayte täytteet) {
        super(täytteet);
    }
    
    @Override
    public double getHinta() {
        return super.getHinta() + 0.50;
    }

    @Override
    public String getNimi() {
        return super.getNimi() + " sinihomejuustoa";
    }
}

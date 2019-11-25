/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Heidi
 */
abstract class HampurilaisBuilder {
    protected Hampurilainen hampurilainen;
    
    public Hampurilainen getBurger(){
        return hampurilainen;
    }
    public void createNewBurger(){
        hampurilainen = new Hampurilainen();
    }
    
    public abstract void buildSampyla();
    public abstract void buildPihvi();
    public abstract void buildJuusto();
    public abstract void buildMajoneesi();
    public abstract void buildLisuke();
    
    
}

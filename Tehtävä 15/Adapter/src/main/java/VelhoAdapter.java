/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Heidi
 */
public class VelhoAdapter implements ITaistelija{
    Velho velho = new Velho(999);

    public VelhoAdapter(){
    }

    @Override
    public int lyö() {
        return velho.loitsi();
    }

    @Override
    public int potki() {
        return velho.kiroa();
    }

    @Override
    public String nimi() {
        return velho.arvoNimi();
    }
    
    @Override
    public int getHealt(){
        return velho.getElinvoimat();
    }
    
}

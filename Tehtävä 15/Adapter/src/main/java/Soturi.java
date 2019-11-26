/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Heidi
 */
public class Soturi implements ITaistelija{
    int healt;
    public Soturi(int hipa){
        this.healt = hipa;
    }
    
    @Override
    public int lyö() {
        return 25;
    }

    @Override
    public int potki() {
        return 15;
    }

    @Override
    public String nimi() {
        return "Mikaelano";
    }

    @Override
    public int getHealt() {
        return healt;
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *TCP Connection 
 * @author Heidi
 */
public class Komennot{
    private IPokemon poke;
    
    public Komennot(){
        poke = Abra.getInstance();
    }

    public void kehitäPokemon() {
       poke = poke.kehitäPokemon();
    }

    public void hypnoosi() {
        poke.hypnoosi();
    }

    public void varjoPallo() {
        poke.varjoPallo();
    }

    public void signaaliSäihke() {
        poke.signaaliSäihke();
    }

    public String nimi() {
        return poke.nimi();
    }

}

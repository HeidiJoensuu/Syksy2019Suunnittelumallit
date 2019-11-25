/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Heidi
 */
public class Abra implements IHahmo{

    @Override
    public void accept(Visitor v) {
        v.VisitAbra(this);
    }
    
    @Override
    public int hypnoosi() {
        System.out.println("Abra yrittää keskittyä ja saada toisen pokemonin valtaansa, mutta väsähtää ja ryhtyy nukkumaan päiväunia.");
        return 1;
    }

    @Override
    public int varjoPallo() {
        System.out.println("Abra luo pienillä tassuillaan mustaa hohtavan pallon ja sinkauttaa sen toista pokemonia päin - valitettavasti ohitse osuen.");
        return 3;
    }

    @Override
    public int signaaliSäihke() {
        System.out.println("Abran valojuova syntyy hetkessä ja osuu toiseen pokemoniin. Toinen pokemon lentää selälleen.");
        return 7;
    }

    @Override
    public String nimi() {
        return "pienin pieni Abra-pokemon.";
    }
    
    
}

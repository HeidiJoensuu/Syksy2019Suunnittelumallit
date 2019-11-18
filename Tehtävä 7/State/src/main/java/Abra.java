/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Heidi
 */
public class Abra implements IPokemon{

    private static class abraHolder{
        private static Abra INSTANCE = new Abra();
    }
    
    public static Abra getInstance(){
        return abraHolder.INSTANCE;
    }
    
    @Override
    public void hypnoosi() {
        System.out.println("Abra yrittää keskittyä ja saada toisen pokemonin valtaansa, mutta väsähtää ja ryhtyy nukkumaan päiväunia.");
    }

    @Override
    public void varjoPallo() {
        System.out.println("Abra luo pienillä tassuillaan mustaa hohtavan pallon ja sinkauttaa sen toista pokemonia päin - valitettavasti ohitse osuen.");
    }

    @Override
    public void signaaliSäihke() {
        System.out.println("Abran valojuova syntyy hetkessä ja osuu toiseen pokemoniin. Toinen pokemon lentää selälleen.");
    }


    public IPokemon kehitäPokemon(){
        System.out.println("Pokemonisi on kehittynyt!");
        return Kadabra.getInstance();
    }
    
    @Override
    public String nimi() {
        return "pienin pieni Abra-pokemon.";
    }
    
    
}

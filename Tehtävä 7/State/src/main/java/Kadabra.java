/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Heidi
 */
public class Kadabra implements IPokemon{
    private Kadabra(){};
    
    private static class kadabraHolder{
        private static Kadabra INSTANCE = new Kadabra();
    }
    
    public static Kadabra getInstance(){
        return kadabraHolder.INSTANCE;
    }
    
    @Override
    public void hypnoosi() {
        System.out.println("Kadabra ottaa toisen pokemonin mielen valtaansa ja laittaa sen lyömään itseään.");
    }

    @Override
    public void varjoPallo() {
        System.out.println("Kadabra luo jättimäisen varjopallon, joka iskeytyy vastustaja pokemoniin.");
    }
    @Override
    public void signaaliSäihke() {
        System.out.println("Kadabran valojuova sinkoaa viholliseen ja saa tämän lentämään pitkän matkan päähän. Pokemonisi alkaa olemaan varsin hyvä tässä iskussa.");
    }

    @Override
    public IPokemon kehitäPokemon(){
        System.out.println("Pokemonisi on kehittynyt!");
        return Alakazam.getInstance();
    }
    
    @Override
    public String nimi() {
        return "mystisesti yhtä lusikkaa heilutteleva Kadabra.";
    }
}

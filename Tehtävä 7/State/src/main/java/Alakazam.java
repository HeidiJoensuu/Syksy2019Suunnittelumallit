/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Heidi
 */
public class Alakazam implements IPokemon{
    private Alakazam(){};

    @Override
    public IPokemon kehitäPokemon() {
        System.out.println("Alakazam heittää sinua varjopallolla. Kehtaatkin tehdä siitä vanhusta!");
        return this;
    }
       
    private static class alakazamHolder{
        private static Alakazam INSTANCE = new Alakazam();
    }
    
    public static Alakazam getInstance(){
        return alakazamHolder.INSTANCE;
    }
    
    @Override
    public void hypnoosi() {
        System.out.println("Alakazam katsoo sinua ärtyneellä katseella ja alkaa hitaasti heiluttelemaan lusikoitaan. Ei kai se omistajaansa hypnotisoisi?");
    }

    @Override
    public void varjoPallo() {
        System.out.println("Alakazam istuutuu maahan leikkien lusikoillaan, eikä kiinitä mitään huomiota komentoihisi.");
    }

    @Override
    public void signaaliSäihke() {
        System.out.println("Alakazam katsoo sinua kyseenalaistaen ja heittää laiskan, mutta vahvan signaali säihkeen vastustaja pokemoniin");
    }

    @Override
    public String nimi() {
        return "voimakas Alakazam! Se pitelee kädessään kahta lusikkaa seisten vastustajapokemonin edessä ylpeänä!";
    } 
    
}

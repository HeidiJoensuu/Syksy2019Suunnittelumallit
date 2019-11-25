/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Heidi
 */
public class Alakazam implements IHahmo{

    @Override
    public void accept(Visitor v) {
        v.VisitAlakazam(this);
    }
       
    @Override
    public int hypnoosi() {
        System.out.println("Alakazam katsoo sinua ärtyneellä katseella ja alkaa hitaasti heiluttelemaan lusikoitaan. Ei kai se omistajaansa hypnotisoisi?");
        return 0;
    }

    @Override
    public int varjoPallo() {
        System.out.println("Alakazam istuutuu maahan leikkien lusikoillaan, eikä kiinitä mitään huomiota komentoihisi.");
        return 0;
    }

    @Override
    public int signaaliSäihke() {
        System.out.println("Alakazam katsoo sinua kyseenalaistaen ja heittää laiskan, mutta vahvan signaali säihkeen vastustaja pokemoniin");
        return 1;
    }

    @Override
    public String nimi() {
        return "voimakas Alakazam! Se pitelee kädessään kahta lusikkaa seisten vastustajapokemonin edessä ylpeänä!";
    } 
    
}

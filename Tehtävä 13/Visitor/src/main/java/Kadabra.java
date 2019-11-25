/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Heidi
 */
public class Kadabra implements IHahmo{
    

    @Override
    public void accept(Visitor v) {
        v.VisitKadabra(this);
    }
  
    @Override
    public int hypnoosi() {
        System.out.println("Kadabra ottaa toisen pokemonin mielen valtaansa ja laittaa sen lyömään itseään.");
        return 7;
    }

    @Override
    public int varjoPallo() {
        System.out.println("Kadabra luo jättimäisen varjopallon, joka iskeytyy vastustaja pokemoniin.");
        return 8;
    }
    @Override
    public int signaaliSäihke() {
        System.out.println("Kadabran valojuova sinkoaa viholliseen ja saa tämän lentämään pitkän matkan päähän. Pokemonisi alkaa olemaan varsin hyvä tässä iskussa.");
        return 10;
    }
    
    @Override
    public String nimi() {
        return "mystisesti yhtä lusikkaa heilutteleva Kadabra.";
    }
}

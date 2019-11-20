/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Heidi
 */
public class Main {
    public static void main(String[] args) {
        Arvuuttaja arvuuttaja = new Arvuuttaja();
        Asiakkaat Niro = new Asiakkaat("Niro", arvuuttaja);
        Asiakkaat Markku = new Asiakkaat("Markku", arvuuttaja);  
        Asiakkaat Ella = new Asiakkaat("Ella", arvuuttaja);  
        Asiakkaat Katariina = new Asiakkaat("Katariina", arvuuttaja);  
        
        arvuuttaja.liityPeliin(Niro);
        arvuuttaja.liityPeliin(Markku);
        arvuuttaja.liityPeliin(Ella);
        arvuuttaja.liityPeliin(Katariina);
        

        Niro.start();
        Markku.start();
        Ella.start();
        Katariina.start();
 
        
    }
    
    /*
    Asiakas väittää olevansa parametri
    liityPeliiin();
    
    
    asiakas arvaa luvun arvaus() -välittää itsensä ja arvauksensa
    true tai false
    */
}

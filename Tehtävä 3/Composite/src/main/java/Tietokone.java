/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Heidi
 */
public class Tietokone {
   
    public void uusiKone(){
        ILaiteOsa kaikkiOsat = new Kotelo();
        
        ILaiteOsa emolevy = new Emolevy();
        kaikkiOsat.lisaaOsa(emolevy);
        ILaiteOsa kotelo = new Kotelo();
        kaikkiOsat.lisaaOsa(kotelo);
        ILaiteOsa muistipiiri = new Muistipiiri();
        kaikkiOsat.lisaaOsa(muistipiiri);
        ILaiteOsa näytönohjain = new Näytönohjain();
        kaikkiOsat.lisaaOsa(näytönohjain);
        ILaiteOsa suoritin = new Suoritin();
        kaikkiOsat.lisaaOsa(suoritin);
        ILaiteOsa verkonohjain = new Verkonohjain();
        kaikkiOsat.lisaaOsa(verkonohjain);
        ILaiteOsa äänikortti = new Äänikortti();
        kaikkiOsat.lisaaOsa(äänikortti);
        
        System.out.println(String.format("%.2f",kaikkiOsat.hinta()));
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Heidi
 */
/*
Suunnittele Composite-mallin mukaisesti rajapinnat ja
toteutukset systeemille, jolla voit esittää pöytätietokoneen kokoonpanon ja
laskea sen hinnan, kun kukin komponentti tietää oman hintansa.
Idea on että tietokoneen kaikki osat ovat vaikkapa Laiteosa-rajapinnan
toteuttajia. Laiteosalla on hinta.
Laiteosia on erilaisia, esim:
- muistipiiri
- emolevy
- prosessori
- verkkokortti
- näytönohjain
- kotelo

Näistä ainakin emolevy ja kotelo ovat koostekomponentteja. Näiden hinta
muodostuu komponentin omasta hinnasta sekä mahdollisen sisällön eli
liitettyjen komponenttien hinnasta.
Esitä luokkahierarkia ja rakenna pöytätietokonekokoonpano haluamistasi
osista ja laske lopuksi kokoonpanon hinta ja tulosta se. Hinnan ilmoittava
metodi palauttaa hinnan metodin paluuarvona.
*/
public class Main {
  
    public static void main(String[] args) {
        Tietokone kone = new Tietokone();
        kone.uusiKone();
    }
 
}

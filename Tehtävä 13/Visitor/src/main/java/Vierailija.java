/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Heidi
 */
public class Vierailija implements Visitor{
    private int pisteet = 0;

    public Vierailija(){};

    @Override
    public void VisitAbra(Abra Ab) {
        pisteet+= Ab.hypnoosi();
        pisteet+= Ab.signaaliSäihke();
        pisteet+= Ab.varjoPallo();
    }

    @Override
    public void VisitAlakazam(Alakazam Al) {
        pisteet+=Al.hypnoosi();
        pisteet+=Al.signaaliSäihke();
        pisteet+=Al.varjoPallo();
    }

    @Override
    public void VisitKadabra(Kadabra Ka) {
        pisteet+=Ka.hypnoosi();
        pisteet+=Ka.signaaliSäihke();
        pisteet+=Ka.varjoPallo();
    }
    public  int getPisteet(){
        return pisteet;
    }
    
}

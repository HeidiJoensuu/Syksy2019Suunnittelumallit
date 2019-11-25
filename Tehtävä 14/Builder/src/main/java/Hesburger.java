/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Heidi
 */
public class Hesburger  extends HampurilaisBuilder{

    @Override
    public void buildSampyla() {
        hampurilainen.setSampyla("Pieni sämpylä");
    }

    @Override
    public void buildPihvi() {
        hampurilainen.setPihvi("45g pihvi");
    }

    @Override
    public void buildJuusto() {
        hampurilainen.setJuusto("1 juusto");
    }

    @Override
    public void buildMajoneesi() {
        hampurilainen.setMajoneesi("Kurkkumajoneesi");
    }

    @Override
    public void buildLisuke() {
        hampurilainen.setLisuke("Ketsuppi");
    }
    
}

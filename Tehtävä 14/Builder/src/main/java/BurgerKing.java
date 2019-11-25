/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Heidi
 */
public class BurgerKing extends HampurilaisBuilder{

    @Override
    public void buildSampyla() {
        hampurilainen.setSampyla("Iso sämpylä");
    }

    @Override
    public void buildPihvi() {
        hampurilainen.setPihvi("100g juusto");
    }

    @Override
    public void buildJuusto() {
        hampurilainen.setJuusto("2 juustoa");
    }

    @Override
    public void buildMajoneesi() {
        hampurilainen.setMajoneesi("Majoneesi");
    }

    @Override
    public void buildLisuke() {
        hampurilainen.setLisuke("Salaatti");
    }
    
}

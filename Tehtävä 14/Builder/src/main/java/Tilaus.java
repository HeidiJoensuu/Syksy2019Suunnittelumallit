/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Heidi
 */
class Tilaus {
    private HampurilaisBuilder hb;
    
    public void setHamppariBuilder(HampurilaisBuilder hb) {
        this.hb = hb;
    }

    void kokoaHamppari() {
        hb.createNewBurger();
        hb.buildSampyla();
        hb.buildMajoneesi();
        hb.buildPihvi();
        hb.buildJuusto();
        hb.buildLisuke();
    }
    public Hampurilainen getBurger(){
        return hb.getBurger();
    }
}

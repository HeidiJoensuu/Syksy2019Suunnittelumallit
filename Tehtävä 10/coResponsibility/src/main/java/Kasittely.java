/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Heidi
 */
public abstract class Kasittely {
    protected Kasittely ylempiTaho;
    
    public void setKasittely(Kasittely yt){
        this.ylempiTaho = yt;
    }
    
    public void käsittele(KorotusToive korotus){ 
    }
    
}

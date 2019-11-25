/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Heidi
 */
class Hampurilainen {
    private String sampyla="";
    private String pihvi="";
    private String juusto="";
    private String majoneesi="";
    private String lisuke="";
    
    public void setSampyla(String sampyla){
        this.sampyla=sampyla;
    }
    public void setPihvi(String pihvi){
        this.pihvi=pihvi;
    }
    public void setJuusto(String juusto){
        this.juusto=juusto;
    }
    public void setMajoneesi(String majoneesi){
        this.majoneesi=majoneesi;
    }
    public void setLisuke(String lisuke){
        this.lisuke=lisuke;
    }
    public void getAinekset(){
        System.out.println(sampyla+" "+pihvi+" "+juusto+" "+majoneesi+" "+lisuke);
    }
}

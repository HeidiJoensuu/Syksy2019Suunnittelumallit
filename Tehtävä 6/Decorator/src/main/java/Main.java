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
     
        ITayte ekaPizza = new Juusto(new Kinkku(new Mozzarella(new Kastike(new Pohja()))));
        ITayte tokaPizza = new Juusto(new ParmanKinkku(new Tomaatti(new Kastike(new Pohja()))));
        ITayte kolmasPizza = new Juusto(new Sinihomejuusto(new Sieni(new Kastike(new Pohja()))));
        
        System.out.println("Pizza Kimo: "+ ekaPizza.getHinta() + "\nSisältää: " + ekaPizza.getNimi()+ "\n");
        System.out.println("Pizza Pato: "+ tokaPizza.getHinta() + "\nSisältää: " + tokaPizza.getNimi()+ "\n");
        System.out.println("Pizza Sisi: "+ kolmasPizza.getHinta() + "\nSisältää: " + kolmasPizza.getNimi()+ "\n");
        
    }
}

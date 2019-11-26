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
        ITaistelija hyökkääjä = new Soturi(100);
        ITaistelija puolustaja = new VelhoAdapter();
        int lyönti, hipa1, hipa2;
        

        hipa1 = hyökkääjä.getHealt();
        hipa2 = puolustaja.getHealt();
        
        System.out.println("Taisteljasi nimi on "+ hyökkääjä.nimi() +"  Healt: " + hipa1);
        System.out.println("Vihollisesi nimi on "+ puolustaja.nimi());
        
        lyönti = hyökkääjä.lyö();
        System.out.println("Soturisi iskee viholliseensa tehden damagea " + lyönti);
        hipa2-=lyönti;
        System.out.println("Vihollisen healt: " + hipa2);
        lyönti = hyökkääjä.potki();
        System.out.println("Soturisi sivaltaa tehden " + lyönti +" damagea");
        hipa2-=lyönti;
        System.out.println("Vihollisen healt: " + hipa2);
        System.out.println("Vihollisesi valmistautuu iskemään. Sähäkkä juova osuu taistelijaasi.");
        hipa1-=puolustaja.lyö();
        System.out.println("Taistelijasi healt: " +hipa1);
        System.out.println("Ympäristö alkaa täristä ja taivas muuttuu mustaksi. Hyökkääjäsi näkee viimeisenä asianaan suuren ukkospallon lentävän häntä kohti.");
        hipa1-=puolustaja.potki();
        System.out.println("Taistelijasi healt: " + hipa1);
        
        
    }
}

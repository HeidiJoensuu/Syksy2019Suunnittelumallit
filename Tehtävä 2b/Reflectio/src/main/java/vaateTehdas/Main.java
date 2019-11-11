
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

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
        Class co = null;
        Class cb = null;
        AbstractFactory vaateO = null;
        AbstractFactory vaateB = null;
        String selected;
        Scanner s = new Scanner(System.in);
        System.out.println(new File(".").getAbsolutePath());
        Properties properties = new Properties();
        try{
            properties.load(
                    new FileInputStream("C:\\Users\\Heidi\\Documents\\Koulu\\Vuosi 2\\Puolvuotisprojekti 2\\Suunnittelumallit\\Tehtävä 2b\\Reflectio\\src\\main\\java\\vaateTehdas\\vaate.properties"));
        } catch(IOException e) {
            e.printStackTrace();}
        try{
            co = Class.forName(properties.getProperty("vaateop"));
            cb = Class.forName(properties.getProperty("vaatebo"));
            vaateO = (AbstractFactory)co.newInstance();
            vaateB = (AbstractFactory)cb.newInstance();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

        
        do {
        System.out.println("Oletko Jasper Adidas opiskelija (1)");
        System.out.println("vai Boss insinööri (2)?");
        selected = s.nextLine();
        System.out.println("Jasper ylpeästi sanoo: Minulla on päällä");
        switch(selected){
        case "1":
            //
            IVaate iv = vaateO.create();
            System.out.println(iv.getPaahine()+", "+ iv.getPaita()+ ", " + iv.getHousut() + " sekä " + iv.getKengat());
        break;
        case "2":
            IVaate vi = vaateB.create();
            System.out.println(vi.getPaahine()+", "+ vi.getPaita()+ ", " + vi.getHousut() + " sekä " + vi.getKengat());
        break;
        case "3":
        break;
        }
        } while (!selected.equals("3"));
         
        
    }
}

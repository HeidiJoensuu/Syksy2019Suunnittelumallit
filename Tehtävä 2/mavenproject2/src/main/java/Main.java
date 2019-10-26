
import java.util.Scanner;

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
        Scanner s = new Scanner(System.in);
        String selected;
        AbstractFactory af;
        IVaate iv;
        
        do {            
            System.out.println("Oletko Jasper Adidas opiskelija (1)");
            System.out.println("vai Boss insinööri (2)?");
            selected = s.nextLine();
            System.out.println("Jasper ylpeästi sanoo: Minulla on päällä");
            
            switch(selected){
                case "1":
                    iv = (IVaate)FactoryProvider.getFactory("Adidas").create();
                    System.out.println(iv.getPaahine()+", "+ iv.getPaita()+ ", " + iv.getHousut() + " sekä " + iv.getKengat());  
                break;
                case "2":
                    iv = (IVaate)FactoryProvider.getFactory("Boss").create();
                    System.out.println(iv.getPaahine()+", "+ iv.getPaita()+ ", " + iv.getHousut() + " sekä " + iv.getKengat());  
                break;
                case "3":
                break;
               
            }
            
        } while (!selected.equals("3"));
    }
    
    
}

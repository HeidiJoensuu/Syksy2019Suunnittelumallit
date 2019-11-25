
import java.util.ArrayList;

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
        Vierailija vierailija = new Vierailija();
        Abra Ab = new Abra();
        Kadabra Ka = new Kadabra();
        Alakazam Al = new Alakazam();
        
        System.out.println("Vierailijalla on pisteitä: "+vierailija.getPisteet() +"\n");
        vierailija.VisitAbra(Ab);
        System.out.println("Vierailijalla on pisteitä: "+vierailija.getPisteet()+"\n");
        vierailija.VisitKadabra(Ka);
        System.out.println("Vierailijalla on pisteitä: "+vierailija.getPisteet()+"\n");
        vierailija.VisitAlakazam(Al);
        System.out.println("Vierailijalla on pisteitä: "+vierailija.getPisteet());
        
        
    }
}

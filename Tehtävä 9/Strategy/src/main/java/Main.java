
import java.util.ArrayList;
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
        ArrayList<String> alkiot = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        //int maara = 0;
        String alkio = "";
        Composition eka = new Composition(new AfterAll());
        
        while (!alkio.equals("exit")){
            System.out.println("('exit' = lopeta)\nKirjoita jotain!");
            alkio = s.nextLine();
            if (!alkio.equals("exit")) alkiot.add(alkio);
        }
        
        eka.print(alkiot);
        eka.setStrategy(new AfterSecond());
        eka.print(alkiot);
        eka.setStrategy(new AfterThird());
        eka.print(alkiot);

        
    }
}

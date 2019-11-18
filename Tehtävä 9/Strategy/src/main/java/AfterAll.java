
import java.util.ArrayList;
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Heidi
 */
public class AfterAll implements IListConverter{

    @Override
    public void listToString(ArrayList<String> alkiot) {
        String lauseke = "";
        for (String string : alkiot) {
            lauseke += string + " ";
        }
        System.out.println(lauseke);
    }

    
    
}

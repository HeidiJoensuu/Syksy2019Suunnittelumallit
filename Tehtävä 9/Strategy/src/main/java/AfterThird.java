
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
public class AfterThird implements IListConverter{

    @Override
    public void listToString(ArrayList<String> alkiot) {
        String lauseke = "";
        int again = 0;
        for (int i = 0; i<alkiot.size(); i++) {
            lauseke += alkiot.get(i);
            if (again == 2) {
                lauseke += " ";
                again = 0;
            } else again++;
        }
        System.out.println(lauseke);
    }
}

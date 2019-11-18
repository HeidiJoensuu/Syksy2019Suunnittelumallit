
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Heidi
 */
public class Toimitusjohtaja extends Kasittely{
    private final double Sallittu = 1.20;
    Random r = new Random();
    
    @Override
    public void käsittele(KorotusToive toive){
        int pohdinta= 0;
        if (toive.getProsentti() >= Sallittu) System.out.println("Toimitusjohtajalta tuli kysymys: 'Kuka kuvittelet olevasi?' ");
        else {
            pohdinta = r.nextInt(2);
            if (pohdinta != 0){
                System.out.println("Toimitusjohtaja hyväksyi palkankorotuksen!");
            } else System.out.println("Toimitusjohtajalta tuli viesti: Valitettavasti en hyväksy palkankorotustasi.");
        }
    }
}

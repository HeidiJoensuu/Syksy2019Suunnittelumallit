
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
public class LahiEsimies extends Kasittely{
    private final double Sallittu = 1.02;
    Random r = new Random();
    
    @Override
    public void setKasittely(Kasittely yt){
        this.ylempiTaho = yt;
    }
    
    @Override
    public void käsittele(KorotusToive toive){
        if (toive.getProsentti() < Sallittu){
            int pohdinta= 0;
            pohdinta = r.nextInt(3);
            if (pohdinta != 0){
                System.out.println("Lähiesimiehesi hyväksyi palkankorotuksen");
            } else System.out.println("Lähiesimiehesi ei hyväksynyt palkankorotusta");
        }else if (ylempiTaho != null){
            System.out.println("Lähiesimiehesi lähetti pyyntösi eteenpäin päälikölle.");
            ylempiTaho.käsittele(toive);
        }
        
    }
    
}

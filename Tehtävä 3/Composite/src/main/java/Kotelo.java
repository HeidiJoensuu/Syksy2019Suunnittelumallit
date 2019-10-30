
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Heidi
 */
public class Kotelo implements ILaiteOsa{
    private double x = 25;
    List<ILaiteOsa> osaList = new ArrayList<ILaiteOsa>();
    
    public Kotelo(){
    }
    
    @Override
    public void lisaaOsa(ILaiteOsa koneenOsat) {
        osaList.add(koneenOsat);
    }
    
    @Override
    public double hinta() {
        double a = x;
        for (ILaiteOsa iLaiteOsa : osaList) {
            a += iLaiteOsa.hinta();
        }
        return a;
    } 
}

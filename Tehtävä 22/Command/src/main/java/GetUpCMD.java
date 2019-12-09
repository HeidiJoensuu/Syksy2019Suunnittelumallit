/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Heidi
 */
public class GetUpCMD implements ICommand{
    private SilverScreen SS;
    
    public GetUpCMD(SilverScreen SS){
        this.SS = SS;
    }
    @Override
    public void execute(){
        SS.getUp();
    }
    
}

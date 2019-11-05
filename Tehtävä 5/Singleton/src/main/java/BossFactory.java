/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Heidi
 */
public class BossFactory implements AbstractFactory{
    private BossFactory(){};
    
     private static class FactoryHolder{
        private static BossFactory INSTANCE = new BossFactory();
    }
    public static BossFactory getNewInstance(){
        return FactoryHolder.INSTANCE;
    }
    
    @Override
    public IVaate create() {
        return new Boss();
    }
}

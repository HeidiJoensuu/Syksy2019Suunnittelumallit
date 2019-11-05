/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Heidi
 */
public class FactoryProvider {
    public static AbstractFactory getFactory(String choice) {
        if ("Adidas".equalsIgnoreCase(choice)){
            return (AbstractFactory) OpiskelijaFactory.getNewInstance();
        }
        else if ("Boss".equalsIgnoreCase(choice)){
            return (AbstractFactory) BossFactory.getNewInstance();
        }
        return null;
    }
    
}

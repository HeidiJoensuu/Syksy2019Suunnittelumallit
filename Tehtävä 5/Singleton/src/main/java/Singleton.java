/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Heidi
 */
public class Singleton {
    private Singleton(){
        
    };
    
    private static Singleton INSTANCE = null;
    
    public static Singleton getInstance(){
        if (INSTANCE == null) INSTANCE = new Singleton();
        return INSTANCE;
    }
    
}

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

    @Override
    public IVaate create() {
        return new Boss();
    }
}

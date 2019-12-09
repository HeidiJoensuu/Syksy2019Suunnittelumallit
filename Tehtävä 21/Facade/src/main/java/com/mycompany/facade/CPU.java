/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.facade;

/**
 *
 * @author Heidi
 */
public class CPU {
    public void freeze() {
        System.out.println("freeze");
    }
    public void jump(long position) {
        System.out.println("jump " + position);
    }
    public void execute() {
        System.out.println("execute");
    }
}
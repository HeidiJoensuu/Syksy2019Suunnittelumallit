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
public class Memory {
    public void load(long position, byte[] data) {
        System.out.println(position + " " + data[0]);
    }
}


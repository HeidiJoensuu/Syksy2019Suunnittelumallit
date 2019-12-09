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
public class HardDrive {
    public byte[] read(long lba, int size) {
        byte[] b = new byte[2];
        b[0] = (byte) lba;
        b[1] = (byte) size;
        return b;
    }
}

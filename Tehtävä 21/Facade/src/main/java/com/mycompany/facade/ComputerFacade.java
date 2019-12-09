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
public class ComputerFacade {
    
    private final CPU processor;
    private final Memory ram;
    private final HardDrive hd;
    private long BOOT_ADDRESS;
    private long BOOT_SECTOR = 12345;
    private int SECTOR_SIZE;

    public ComputerFacade() {
        this.processor = new CPU();
        this.ram = new Memory();
        this.hd = new HardDrive();
    }

    public void start() {
        processor.freeze();
        ram.load(BOOT_ADDRESS, hd.read(BOOT_SECTOR, SECTOR_SIZE));
        processor.jump(BOOT_ADDRESS);
        processor.execute();
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Heidi
 */
public interface IHahmo {
    void accept (Visitor v);
    public int hypnoosi();
    public int varjoPallo();
    public int signaaliSäihke();
    public String nimi();
}

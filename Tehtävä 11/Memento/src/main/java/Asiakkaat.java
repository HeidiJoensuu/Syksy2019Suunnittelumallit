
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Caretaker
 * @author Heidi
 */
public class Asiakkaat extends Thread{
    Memento m;
    Random r = new Random();
    Arvuuttaja ar;
    String nimi;
    
    public Asiakkaat(String nimi, Arvuuttaja ar){
        this.nimi = nimi;
        this.ar =ar;
    }
    
    void addMemento(Memento memento) {
        this.m = memento;
    }

    public Memento getMemento() {
        return m;
    }
    
    @Override
    public void run(){
        while(!ar.arvaus(this, r.nextInt(100))){
            System.out.println(this.nimi + "n arvaus oli väärin.");
        }System.out.println(this.nimi + " arvasi oikein!");
    }
    
}

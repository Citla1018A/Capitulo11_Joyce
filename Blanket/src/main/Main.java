/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Citlalli
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Blanket manta = new Blanket();
        manta.setTamaño("rey");
        manta.setMaterial("cashmere");
        System.out.println(manta.toString());
        
        ElectricBlanket eb = new ElectricBlanket();
        eb.setApagadoAutomatico(true);
        eb.setNumConfCalor(8);
        System.out.println(eb.toString());
    }
    
}

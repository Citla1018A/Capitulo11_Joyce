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
        Bridge bridge = new Bridge();
        System.out.println(bridge.displayDescription());
        Pocker pocker = new Pocker();
        System.out.println(pocker.displayDescription());
        
    }
    
}

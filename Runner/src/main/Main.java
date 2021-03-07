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
        Machine machine = new Machine();
        Athlete athlete = new Athlete();
        PoliticalCandidate pc = new PoliticalCandidate();
        machine.run();
        athlete.run();
        pc.run();
    }
    
}

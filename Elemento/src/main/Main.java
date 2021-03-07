/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author tutuo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ElementArray elementos = new ElementArray();
        elementos.addElemento(new MetalElement("C", 6, 12.01));
        elementos.addElemento(new MetalElement("H", 1, 10.14));
        elementos.addElemento(new NonMetalElement("Mg", 12, 15.2));
        elementos.addElemento(new NonMetalElement("O", 16, 32.06));
        elementos.imprimir();
    }
    
}

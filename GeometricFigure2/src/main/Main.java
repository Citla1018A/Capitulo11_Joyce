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
       Cuadrado2 cuadrado = new Cuadrado2(10.0, 10.0,"cuadrado");
       Triangulo2 triangulo = new Triangulo2(5.0, 5.0, "Triangulo");
        System.out.println(cuadrado.toString());
        System.out.println(triangulo.toString());
       
    }
    
}

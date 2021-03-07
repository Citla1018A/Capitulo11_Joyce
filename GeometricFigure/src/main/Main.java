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
       Cuadrado cuadrado = new Cuadrado(10.0, 10.0,"cuadrado");
       Triangulo triangulo = new Triangulo(5.0, 5.0, "Triangulo");
        System.out.println(cuadrado.area());
        System.out.println(triangulo.area());
       
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @author Citlalli
 */
public abstract class Division {
    public String nombre;
    public String numCuenta;

    public Division(String nombre, String numCuenta) {
        this.nombre = nombre;
        this.numCuenta = numCuenta;
    }
    
    public abstract void display();
}

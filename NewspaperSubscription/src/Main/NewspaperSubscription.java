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
public abstract class NewspaperSubscription {
    public String nombre;
    public String direccion;
    public Double tarifa;

    public NewspaperSubscription(String nombre) {
        this.nombre = nombre;      
        this.tarifa = tarifa;
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public String getDireccion(){
        return this.direccion;
    }
    
    public Double getTarifa(){
        return this.tarifa;
    }
    
    public abstract void setDireccion();
    
}

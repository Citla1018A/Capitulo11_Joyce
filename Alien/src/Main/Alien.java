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
public abstract class Alien {
    protected Integer numeroOjos;
    protected String nombre;
    protected Integer edad;
    
    public Alien(Integer numeroOjos, String nombre, Integer edad){
        this.numeroOjos=numeroOjos;
        this.nombre=nombre;
        this.edad=edad;
    }
    @Override
    public String toString(){
        return "Ojos: "+this.numeroOjos+" Nombre: "+this.nombre+" edad: "+this.edad;
    }
}

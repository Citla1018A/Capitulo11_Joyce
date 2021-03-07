/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Objects;

/**
 *
 * @author Citlalli
 */
public class Participant {
    private String nombre;
    private Integer edad;
    private String direccion;

    public Participant(String nombre, Integer edad, String direccion) {
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
    }
        
    @Override
    public String toString(){
        return String.format("%s %d %s",this.nombre,this.edad,this.direccion);        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    public static Boolean equals(Participant p1, Participant p2){
        if(p1.getNombre()==p2.getNombre() && p1.getDireccion()==p2.getDireccion() && Objects.equals(p1.getEdad(), p2.getEdad())){
            return true;
        }else{
            return false;
        }
    }
    
    
    
    
    
    
    
    
}

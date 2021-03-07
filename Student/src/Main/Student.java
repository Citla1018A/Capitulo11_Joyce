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
public abstract class Student {
    private Integer numIdentificacion;
    public Integer tarifa;
    private String nombre;
    
    public Student(Integer numIdentificacion, String nombre){
        this.numIdentificacion=numIdentificacion;
        this.nombre=nombre;
    }

    public Integer getNumIdentificacion() {
        return numIdentificacion;
    }

    public void setNumIdentificacion(Integer numIdentificacion) {
        this.numIdentificacion = numIdentificacion;
    }

    public Integer getTarifa() {
        return tarifa;
    }

    public abstract void setTarifa();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public String toString(){
        return String.format("%d $%d %s", this.numIdentificacion,this.tarifa,this.nombre);
    }
    
    
}

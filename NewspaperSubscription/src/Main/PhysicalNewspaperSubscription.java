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
public class PhysicalNewspaperSubscription extends NewspaperSubscription{

    public PhysicalNewspaperSubscription(String nombre) {
        super(nombre);
        setDireccion();
    }
    
    @Override
    public void setDireccion() {
        this.tarifa=15.0;
    }
    
    @Override
    public String toString(){
        return "Nombre: "+this.nombre+" Direc: "+this.direccion+" Tasa: "+this.tarifa;
    }    
    
}

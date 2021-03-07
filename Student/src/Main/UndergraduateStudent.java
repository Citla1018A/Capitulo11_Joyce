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
public class UndergraduateStudent extends Student {

    public UndergraduateStudent(Integer numIdentificacion, String nombre) {
        super(numIdentificacion, nombre);
        setTarifa();
    }

    @Override
    public void setTarifa() {        
        this.tarifa=1000;
    }
    
}

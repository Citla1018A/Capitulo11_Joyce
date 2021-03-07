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
public class DomesticDivision extends Division {
    private String estado;

    public DomesticDivision(String nombre,String numcuenta,String estado) {
        super(nombre,numcuenta);
        this.estado = estado;
    }
    
    @Override
    public String toString(){
        return "Nombre: "+this.nombre+" NumCuenta: "+this.numCuenta+" Estado: "+this.estado;
    }

    @Override
    public void display() {
        
    }
    
    
}

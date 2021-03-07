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
public class InternationalDivision extends Division{
    private String pais;
    private String idioma;

    public InternationalDivision(String nombre, String numCuenta,String idioma,String pais) {
        super(nombre, numCuenta);
        this.idioma=idioma;
        this.pais=pais;
    }

    @Override
    public void display() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public String toString(){
        return "Nombre: "+this.nombre+" NumCuenta: "+this.numCuenta+" Idioma: "+this.idioma+" Pais: "+this.pais;
    }
    
    
}

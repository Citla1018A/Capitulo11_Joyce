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
public final class NonFiction extends Book {
    
    public NonFiction(String titulo,Double precio) {
        super(titulo,precio);
        setPrecio();
    }

    @Override
    public void setPrecio() {
        this.precio=37.99;
    }
    
    public void imprimir(){
        System.out.println(" "+this.getTitulo()+" $"+getPrecio());
    }
    
}

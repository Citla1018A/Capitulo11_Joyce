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
public abstract class Book {
    public String titulo;
    public Double precio;
    
    public Book(String titulo,Double precio){
        this.titulo=titulo; 
        this.precio=precio;
    }
    
    public Double getPrecio(){
        return this.precio;
    }
    
    public String getTitulo(){
        return this.titulo;
    }

    public abstract void setPrecio();
    
    
    
    
    
    
}

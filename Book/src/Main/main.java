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
public class main {


    public static void main(String[] args) {
        
        Fiction fiction = new Fiction("Harry Potter",0.0);
        NonFiction nFiction = new NonFiction("Cenicienta",0.0);
        
        fiction.imprimir();
        nFiction.imprimir();
        
        
        BookArray libros = new BookArray();
        libros.add(new Fiction("oso juancho", 0.0));
        libros.add(new NonFiction("oso juancho 1", 0.0));
        libros.add(new Fiction("oso juancho 2 ", 0.0));
        libros.add(new NonFiction("oso juancho 3 ", 0.0));
        libros.add(new Fiction("el regreso del oso juancho", 0.0));
        libros.add(new NonFiction("caliz de fuego", 0.0));
        libros.add(new Fiction("piedra filosofal", 0.0));
        libros.imprimir();
        
        
    }
    
}

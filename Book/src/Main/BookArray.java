/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.ArrayList;

/**
 *
 * @author Citlalli
 */
public class BookArray {
    private ArrayList<Book> books;
    
    public BookArray(){
        books = new ArrayList<>();
    }
    public void add(Book libro){
        books.add(libro);
    }
    
    public void imprimir(){
        for (int i = 0; i < books.size(); i++) {
            System.out.println(books.get(i).getTitulo()+" "+books.get(i).getPrecio());
        }
    }
  
}

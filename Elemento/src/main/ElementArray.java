/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.ArrayList;

/**
 *
 * @author Citlalli
 */
public class ElementArray {
    private ArrayList<Elemento> elementos;
    
    public ElementArray(){
        elementos = new ArrayList<>();
    }
    
    public void addElemento(Elemento elemento){
        elementos.add(elemento);        
    }
    
    public void imprimir(){
        for (int i = 0; i < elementos.size(); i++) {
            System.out.println(elementos.get(i).describeElement());
        }
    }
}

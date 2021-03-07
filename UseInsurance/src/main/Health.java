/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Citlalli
 */
public class Health extends Insurance{
    
    public Health(){
        super("Health");
        setCost();        
    }

    @Override
    public void setCost() {
        this.precioMensual=196;
    }


}

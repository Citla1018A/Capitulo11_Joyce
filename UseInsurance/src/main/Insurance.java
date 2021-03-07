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
public abstract class Insurance {
    private String tipoSeguro;
    public Integer precioMensual;
    
    public Insurance(String tipoSeguro){
        this.tipoSeguro=tipoSeguro;
    }

    public String getTipoSeguro() {
        return tipoSeguro;
    }

    public Integer getPrecioMensual() {
        return precioMensual;
    }
    
    public abstract void setCost();
    
    @Override
    public String toString(){
        return String.format("%s $%d",this.tipoSeguro,this.precioMensual);
    }
    
}

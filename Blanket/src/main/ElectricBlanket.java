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
public class ElectricBlanket extends Blanket{
    private Integer numConfCalor;
    private Boolean apagadoAutomatico;

    public ElectricBlanket() {
        this.numConfCalor=1;
        this.apagadoAutomatico=false;
    }

    public Integer getNumConfCalor() {
        return numConfCalor;
    }

    public void setNumConfCalor(Integer numConfCalor) {
        if(numConfCalor>0 && numConfCalor<6){
            this.numConfCalor = numConfCalor;
        }else{
            this.numConfCalor=1;
        }
    }

    public Boolean getApagadoAutomatico() {
        return apagadoAutomatico;
    }

    public void setApagadoAutomatico(Boolean apagadoAutomatico) {
        if(apagadoAutomatico==true){
           this.precio=precio+5.75;
        }else{
            this.apagadoAutomatico = apagadoAutomatico;
        }       
    }
    
    @Override
    public String toString(){
        Blanket b= new Blanket();
        
        return b.toString()+" numCofCalor: "+this.numConfCalor+" apagado automatico: "+this.apagadoAutomatico;
    }
    
    
    
    
    
}

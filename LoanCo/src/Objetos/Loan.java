/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

/**
 *
 * @author Citlalli
 */
public abstract class Loan implements LoanConstants{
    public Integer prestamo;
    public String apellido;
    public Integer montoPrestamo;
    public Float tasaInteres;
    public Integer plazo;

    public Loan(Integer prestamo, String apellido, Integer monto, Integer plazo) {
        this.prestamo = prestamo;
        this.apellido = apellido;
        if(monto<MONTOMAX){
            this.montoPrestamo=monto;
        }else{
            this.montoPrestamo=100000;
        }
        setPlazo(plazo);
    }
    public void setPlazo(Integer plazo){
        if((plazo!=CORTOP)&&(plazo!=MEDIAP)&&(plazo!=LARGO)){
            this.plazo=CORTOP;
        }else{
            this.plazo=plazo;
        }
    }
    @Override
    public String toString(){
        return String.format(EMPRESA+"\nEl prestamos N°: "+prestamo+" a "+apellido+" con un monto de "+montoPrestamo+" en un plazo de "+plazo+" con un interes del "+tasaInteres);
    }
    
    
}

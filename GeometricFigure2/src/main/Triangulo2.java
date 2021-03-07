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
public class Triangulo2 extends GeometricFigure2 {

    public Triangulo2(Double altura, Double ancho, String tipoFig) {
        super(altura, ancho, tipoFig);
        displaySides();        
    }

    @Override
    public Double area() {
        return (this.getAncho()*this.getAltura())/2;
    }
    
    @Override
    public void displaySides(){
        this.numLados=3;        
    }    
    
        
}

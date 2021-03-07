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
public class Triangulo extends GeometricFigure {

    public Triangulo(Double altura, Double ancho, String tipoFig) {
        super(altura, ancho, tipoFig);
    }

    @Override
    public Double area() {
        return (this.getAncho()*this.getAltura())/2;
    }
    
        
}

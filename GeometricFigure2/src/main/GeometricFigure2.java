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
public abstract class GeometricFigure2 implements SidedObject{
    private Double altura;
    private Double ancho;
    private String tipoFig;
    private Double area;
    public Integer numLados;
    

   
    public GeometricFigure2(Double altura, Double ancho, String tipoFig) {
        this.altura = altura;
        this.ancho = ancho;
        this.tipoFig = tipoFig;
        
        
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getAncho() {
        return ancho;
    }

    public void setAncho(Double ancho) {
        this.ancho = ancho;
    }

    public String getTipoFig() {
        return tipoFig;
    }

    public void setTipoFig(String tipoFig) {
        this.tipoFig = tipoFig;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }
    
    public abstract Double area();
    
    @Override
    public String toString(){
        //System.out.println("entra");
        return ""+this.area()+" lados: "+this.numLados;
        //return "";
    }
    
}

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
public class Blanket {
    private String tamaño;
    private String color;
    private String material;
    public Double precio;

    public Blanket() {
        this.tamaño = "twin";
        this.color = "blanco";
        this.material = "algodón";
        this.precio = 30.0;
    }
    

    public void setTamaño(String tamaño) {
        this.tamaño=tamaño;
        if(tamaño.contains("doble")){
            this.precio=precio+10;
        }else{
            if(tamaño.contains("reina")){
                this.precio=precio+25;
            }else{
                if(tamaño.contains("rey")){
                    this.precio=precio+40;
                }else{
                    this.precio=30.0;
                }
            }
        }
        
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMaterial(String material) {
        this.material = material;
        if(material.contains("lana")){
            this.precio=precio+20;
        }else{
            if(material.contains("cashmere")){
                this.precio=precio+45;
            }else{
                this.precio=30.0;
            }
        }            
    }

    @Override
   public String toString(){
       return "$"+this.precio;
   }


    
}

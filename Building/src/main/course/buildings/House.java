/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.course.buildings;

/**
 *
 * @author Citlalli
 */
public class House extends Building{
    private Integer numDormitorios;
    private Integer numBaños;

    public House(Integer numDormitorios, Integer numBaños, Double pies, String stories) {
        super(pies, stories);
        this.numDormitorios = numDormitorios;
        this.numBaños = numBaños;
    }

    public Integer getNumDormitorios() {
        return numDormitorios;
    }

    public void setNumDormitorios(Integer numDormitorios) {
        this.numDormitorios = numDormitorios;
    }

    public Integer getNumBaños() {
        return numBaños;
    }

    public void setNumBaños(Integer numBaños) {
        this.numBaños = numBaños;
    }
    @Override
    public String toString(){
        return this.getNumDormitorios()+" "+this.getNumBaños()+" "+this.getPies()+" "+this.getStories();
    }
}

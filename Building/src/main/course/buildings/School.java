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
public class School extends Building {
    private Integer numSalones;
    private String nivelGrado;

    public School(Integer numSalones, String nivelGrado, Double pies, String stories) {
        super(pies, stories);
        this.numSalones = numSalones;
        this.nivelGrado = nivelGrado;
    }

    public Integer getNumSalones() {
        return numSalones;
    }

    public void setNumSalones(Integer numSalones) {
        this.numSalones = numSalones;
    }

    public String getNivelGrado() {
        return nivelGrado;
    }

    public void setNivelGrado(String nivelGrado) {
        this.nivelGrado = nivelGrado;
    }
    @Override
    public String toString(){
        return this.numSalones+" "+this.nivelGrado+" "+this.getPies()+" "+this.getStories();
    }
}

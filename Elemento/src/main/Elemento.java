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
public abstract class Elemento {
    public String simbolo;
    public Integer numAtomico;
    public Double pesoAtomico;

    public Elemento(String simbolo, Integer numAtomico, Double pesoAtomico) {
        this.simbolo = simbolo;
        this.numAtomico = numAtomico;
        this.pesoAtomico = pesoAtomico;
    }

    public String getSimbolo() {
        return simbolo;
    }

    public Integer getNumAtomico() {
        return numAtomico;
    }

    public Double getPesoAtomico() {
        return pesoAtomico;
    }
    
    public abstract String describeElement();
}

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
public class MetalElement extends Elemento {

    public MetalElement(String simbolo, Integer numAtomico, Double pesoAtomico) {
        super(simbolo, numAtomico, pesoAtomico);
    }

    @Override
    public String describeElement() {
       return "Simbolo: "+this.simbolo+" numAtomico: "+
             this.numAtomico+" pesoAtomico: "+this.pesoAtomico+" Buenos conductores de electricidad";
    }
    
}

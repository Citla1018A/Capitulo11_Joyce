/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import Objetos.BusinessLoan;
import Objetos.CreateLoans;
import Objetos.PersonalLoan;

/**
 *
 * @author Citlalli
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        CreateLoans cL = new CreateLoans();
        cL.add(new PersonalLoan(15, "Tamayo", 78511, 3));
        cL.add(new BusinessLoan(71, "Nicolas", 256331, 5));
        cL.imprimir();
    }
    
}

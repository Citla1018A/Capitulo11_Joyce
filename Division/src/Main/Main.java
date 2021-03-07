/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @author Citlalli
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        InternationalDivision inter = new InternationalDivision("Martha", "18752", "Español", "México");
        System.out.println(inter.toString());
        
        DomesticDivision dd = new DomesticDivision("Abril", "7812", "Oaxaca");
        System.out.println(dd.toString());
    }
    
}

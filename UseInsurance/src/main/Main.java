/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;

/**
 *
 * @author Citlalli
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tipo de seguro: ");
        String seguro = scanner.next();
        if("Health".equals(seguro)){
            Health h = new Health();
            System.out.println(h.toString());
        }else{
            if("Life".equals(seguro)){
                Life l = new Life();
                System.out.println(l.toString());
            }else{
                System.out.println("error");
            }
        }
        
    }
    
}

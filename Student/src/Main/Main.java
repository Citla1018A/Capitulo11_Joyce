/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.ArrayList;

/**
 *
 * @author Citlalli
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        ArrayList<Student> alumnos = new ArrayList<>();
        alumnos.add(new UndergraduateStudent(781, "Abril"));
        alumnos.add(new GraduateStudent(892, "Martha"));
        alumnos.add(new StudentAtLarge(78, "Manuel"));
        
        for (int i = 0; i < alumnos.size(); i++) {
            System.out.println(alumnos.get(i).toString());
        }
        
        
    }
    
}

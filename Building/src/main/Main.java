/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import main.course.buildings.Building;
import main.course.buildings.House;
import main.course.buildings.School;

/**
 *
 * @@author Citlalli
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Building b = new Building(78.1, "H23");
        System.out.println(b.toString());
        House house = new House(7, 5, 10.23, "Higth");
        System.out.println(house.toString());
        School school = new School(10,"7",78.1,":D");
        System.out.println(school.toString());
        
    }
    
}

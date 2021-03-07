/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 *
 * @author Citlalli
 */
public class Main {

    public static void main(String[] args) {
        ArrayList<Participant> minimaraton = new ArrayList<>();
        minimaraton.add(new Participant("Citlalli",19,"Etla"));
        minimaraton.add(new Participant("Alejandra", 20, "Xoxo"));
        minimaraton.add(new Participant("Jairo", 18, "Santa Rosa"));
        
        ArrayList<Participant> buceo = new ArrayList<>();
        buceo.add(new Participant("Manuel", 22, "Capulalpam"));
        buceo.add(new Participant("Carla", 23, "Laura"));
        
        for (int i = 0; i < minimaraton.size(); i++) {
            System.out.println(minimaraton.get(i).toString());
        }
        for (int i = 0; i < buceo.size(); i++) {
            System.out.println(buceo.get(i).toString());
        }
        
    }
    
}

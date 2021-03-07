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
public class PhoneCallArray {
    private ArrayList<PhoneCall> phone;
    
    public PhoneCallArray(){
        phone = new ArrayList<>();
    }
    
    public void add(PhoneCall phones){
       phone.add(phones);
    }
    
    public void imprimir(){
        for (int i = 0; i < phone.size(); i++) {
            System.out.println(phone.get(i).toString());
        }
    }
    
}

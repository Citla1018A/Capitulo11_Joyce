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
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       PhysicalNewspaperSubscription n = new PhysicalNewspaperSubscription("Hello");
        System.out.println(n.toString());
        
        OnlineNewspaperSubscription n2 = new OnlineNewspaperSubscription("Yes7@8");
        System.out.println(n2.toString());
       
    }
    
}

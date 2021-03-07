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
        IncomingPhoneCall phone1 = new IncomingPhoneCall("9514632257");
        System.out.println(phone1.toString());
        
        OutgoingPhoneCall phone2 = new OutgoingPhoneCall("9515440149", 7);
        System.out.println(phone2.toString());
        
        
        PhoneCallArray phoneArray = new PhoneCallArray();
        phoneArray.add(new IncomingPhoneCall("9511588715"));
        phoneArray.add(new IncomingPhoneCall("951218230"));
        phoneArray.add(new IncomingPhoneCall("9512600275"));
        phoneArray.add(new IncomingPhoneCall("9515153721"));
        phoneArray.imprimir();
               
    }
    
}

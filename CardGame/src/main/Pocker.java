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
public class Pocker extends CardGame{
    public Pocker() {
        deal();
    }
    
    @Override
    public String displayDescription() {
       return String.format("Poker\nEl tipo de carta "+mazo+" de numero "+number+"\tSe le han repartido "+repartidas+" cartas");
    }

    @Override
    public void deal() {
        this.repartidas=5;
    }
        
}

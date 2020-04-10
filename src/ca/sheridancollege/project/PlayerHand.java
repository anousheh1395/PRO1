/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import java.util.ArrayList;

/**
 *
 * @author anousheh
 */
public class PlayerHand  {
    private ArrayList < Card > hand;
    
    public PlayerHand(){
    hand = new ArrayList< Card >();
	}
     public ArrayList < Card > getHand() {
        return hand;
    }

    /**
     * @param hand the hand to set
     */
    public void setHand(ArrayList < Card > hand) {
        this.hand = hand;
    }
    public void addCard(Card card){
getHand().add(card);	

	}
    

    @Override 
	public String toString(){
    return getHand() + "";

}
}

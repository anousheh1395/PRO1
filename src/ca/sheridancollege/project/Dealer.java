/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

/**
 *
 * @author anousheh
 */
public class Dealer extends PlayerHand {
    private String dealerID;
    public Dealer(){
		super();
		dealerID = "Dealer";
	}

    /**
     * @return the dealerID
     */
    public String getDealerID() {
        return dealerID;
    }

    /**
     * @param dealerID the dealerID to set
     */
    public void setDealerID(String dealerID) {
        this.dealerID = dealerID;
    }
    
    @Override
    public String toString(){

    return getDealerID() + "'s card hand is: " + super.toString();

	}
}
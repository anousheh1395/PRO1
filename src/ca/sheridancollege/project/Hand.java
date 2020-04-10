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
public class Hand {
    private String playerID;
    private String dealerID;
    
    public Hand(String playerID, String dealerID){
	//Initialize the player and dealer's names
        this.playerID = playerID;
	this.dealerID = dealerID;
}

    /**
     * @return the playerID
     */
    public String getPlayerID() {
        return playerID;
    }

    /**
     * @param playerID the playerID to set
     */
    public void setPlayerID(String playerID) {
        this.playerID = playerID;
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
    

}

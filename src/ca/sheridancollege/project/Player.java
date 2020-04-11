 /**
 * SYST 17796 Project Winter 2020 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * A class that models each Player in the game. Players have an identifier, which should be unique.
 * @author Sivagama
 *  @modifier IT Technicians
 * @date April 11,2020
 */
public class Player extends PlayerHand 
{
    
    private String playerID; //the unique ID for this player
  
    public Player(){
		super(); 
		Scanner playerInput = new Scanner(System.in);
		System.out.print("Enter your name: ");
		playerID = playerInput.next();
              
}
    
    public String getPlayerID() 
    {
        return playerID;
    }

    public void setPlayerID(String playerID) 
    {
       this.playerID = playerID;
    }
    @Override 
	public String toString(){
        return getPlayerID() + "'s card hand is: " + super.toString();

	}
   
}
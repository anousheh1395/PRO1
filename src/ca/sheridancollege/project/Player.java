/**
 * SYST 17796 Project Winter 2020 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

import java.util.Scanner;

/**
 * A class that models each Player in the game. Players have an identifier, which should be unique.
 * @author Sivagama
 *  @modifier IT Technicians
 * @date April 11,2020
 */
public abstract class Player 
{
    private String playerID; //the unique ID for this player
  
    public Player(String name)
    {
        playerID= name;
    }
    
    public String getPlayerID() 
    {
        return playerID;
    }

    public void setPlayerID(String givenID) 
    {
        playerID = givenID;
    }
    
    
     public abstract void play();
}
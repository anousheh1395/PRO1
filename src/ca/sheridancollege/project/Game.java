/**
 * SYST 17796 Project Winter 2020 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * The class that models your game. You should create a more specific
 * child of this class and instantiate the methods given.
 * @author Sivagama
 * @modifier IT Technicians
 * @date April 11,2020
 */
 public abstract class Game  {
    
    private final String blackJack;//the title of the game
    private ArrayList <Player> players;// the players of the game

    public Game(String givenName)
    {
        blackJack = givenName;
        players = new ArrayList();
    }
    public String getGameName() 
    {
        return blackJack;
    }
    public ArrayList <Player> getPlayers() 
    {
        return players;
    }
    public void setPlayers(ArrayList <Player> players) 
    {
        this.players = players;
    }
   
    public abstract void play();
   // public abstract void declareWinner();


 }
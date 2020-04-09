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
public class GameRunner {
   public static void main (String [] args){
    
    Game g=new BlackJack("blackjack");
    g.play();
    
}
}
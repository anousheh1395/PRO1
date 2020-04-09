/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author anousheh
 */
public class BlackJack extends Game {
    public BlackJack(String givenName){
        super(givenName);
    }
    // to start the game and declare the winner
    @Override
    public void play() {
    System.out.println("Welcome to BlackJack");
    GroupOfCards playingDeck=new GroupOfCards();
    playingDeck.createFullDeck();
    playingDeck.shuffle();
    GroupOfCards playerDeck=new GroupOfCards();
    GroupOfCards dealerDeck= new GroupOfCards();
    Scanner input=new Scanner(System.in);
   double playerMoney=100.00;
   while (playerMoney>0){
    System.out.println("You have $"+playerMoney+
            "How much would you like to bet?");
   double playerBet=input.nextDouble();
    if (playerBet>playerMoney){
    System.out.println("You cannot bet more than you have!");
    break;
  }
    boolean endRound=false;
             
    playerDeck.draw(playingDeck);
    playerDeck.draw(playingDeck);
             
    dealerDeck.draw(playingDeck);
    dealerDeck.draw(playingDeck);
   
     while(true){
     System.out.println("Your hand:");
    System.out.println(playerDeck.toString());
     System.out.println("Your hand value:"+ playerDeck.cardValue());
                  
     System.out.println("Dealer hand:"
     +dealerDeck.getCard(0).toString()+"[Hidden Card]");
                 
     System.out.println("Would you like to (1)hit or (2)stand?");
      int response=input.nextInt();
    
     if(response==1){
     playerDeck.draw(playingDeck);
     System.out.println("You draw a:"
     +playerDeck.getCard(playerDeck.deckSize()-1).toString());
      }
     if(playerDeck.cardValue()>=21){
    System.out.println("Bust! value:"+playerDeck.cardValue());
       playerMoney -=playerBet;
      endRound=true;
   }
    if(response==2){
       break;
     }
     }
    System.out.println("Dealer hand:"+dealerDeck.toString());
    if((dealerDeck.cardValue()>playerDeck.cardValue())&& endRound==false){
    System.out.println("Dealer wins");
    playerMoney -=playerBet;
    endRound=true;
    }
    while((dealerDeck.cardValue()>17)&& endRound==false){
   dealerDeck.draw(playingDeck);
    System.out.println("Dealer Draws:"
    +dealerDeck.getCard(dealerDeck.deckSize()-1).toString());
    }
             
    System.out.println("Dealer's hand value:"+dealerDeck.cardValue());
     if((dealerDeck.cardValue()>21)&& endRound==false){
          System.out.println("Dealer busts! you win.");
           playerMoney +=playerBet;
           endRound=true;
     }  
      if((dealerDeck.cardValue()==playerDeck.cardValue())&& endRound==false){
            System.out.println("push");
            endRound=true;
    }
    if((playerDeck.cardValue()> dealerDeck.cardValue())&& endRound==false){
         System.out.println("You win");
         playerMoney +=playerBet;
         endRound=true;
    } 
     else if(endRound==false){
         System.out.println("You loose");
          playerMoney -=playerBet;
          endRound=true;
     }
    playerDeck.moveAllToDeck(playingDeck);
     dealerDeck.moveAllToDeck(playingDeck);
    System.out.println("End of the game");

    }
   System.out.println("game Over");
     }   
    }
     
    
       
       

    




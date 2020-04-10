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
public class BlackJackGame {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        do{
	Player player = new Player();
        //to start the game 
        GroupOfCards playingDeck=new GroupOfCards();
        GroupOfCards playerDeck=new GroupOfCards();
        GroupOfCards dealerDeck= new GroupOfCards();
        Dealer dealer = new Dealer();
        ArrayList< Card > playerHand = player.getHand();
        ArrayList< Card > dealerHand = dealer.getHand();
        Hand Hand = new Hand(player.getPlayerID(), dealer.getDealerID());
        
        int playerScore = 0;
        
	
       
     //creating a deck of card   
    playingDeck.createFullDeck();
    //shuffling the deck of cards we created in the last step
    playingDeck.shuffle();
    //giving player two cards to start the game
    playerDeck.draw(playingDeck);
    playerDeck.draw(playingDeck);
     //dealer takes two cards (one faced up one hidden)        
    dealerDeck.draw(playingDeck);
    dealerDeck.draw(playingDeck);
    
    boolean endRound=false;
    //initial score of the player
    int score=0;
    
     while(true){
         //showing the first two cards of the player on the console
     System.out.println(player.getPlayerID()+"  's hand:");
     System.out.println(playerDeck.toString());
     //to calculating the value of the hand
     System.out.println(player.getPlayerID()+" hand value:"+ playerDeck.cardValue());
     //showing dealer's one faced up and one hidden card             
     System.out.println("Dealer hand:"
     +dealerDeck.getCard(0).toString()+"[Hidden Card]");
      //asking user to draw another card or keep the old hand           
     System.out.println("Would you like to (1)hit or (2)stand?");
     int response=input.nextInt();
     //if player wants another card
     if(response==1){
     playerDeck.draw(playingDeck);
     //to remove one card from initial deck
     System.out.println("You draw a:"
     +playerDeck.getCard(playerDeck.deckSize()-1).toString());
      }
     //to check if player's hand value is greater than 21(busted) or not
     if((playerDeck.cardValue()>=21)&& endRound==false){
    System.out.println("Bust! value:"+playerDeck.cardValue());
    score-=1;
    endRound=true;
    break;
  }
     //to check if user keeps the old hand
    if(response==2){
       break;
     }
     }
     //showing dealer's hand 
     System.out.println("Dealer hand:"+dealerDeck.toString());
     //to check if dealer's hand value is greater than player's and has won the game
     if((dealerDeck.cardValue()>playerDeck.cardValue())&& endRound==false){
    System.out.println("Dealer wins");
    score -= 1;
    endRound=true;
   }
     //if dealer's hand value is less than 17 he usually draws another card
     while((dealerDeck.cardValue()<17)&& endRound==false){
   dealerDeck.draw(playingDeck);
    System.out.println("Dealer Draws:"
    +dealerDeck.getCard(dealerDeck.deckSize()-1).toString());
    }
             
    System.out.println("Dealer's hand value:"+dealerDeck.cardValue());
    // to check if dealer is busted
     if((dealerDeck.cardValue()>21)&& endRound==false){
          System.out.println("Dealer busts! you win.");
         score += 1;
           endRound=true;
     }   
     //to check if the game is a tie
      if((dealerDeck.cardValue()==playerDeck.cardValue())&& endRound==false){
            System.out.println("push");
            endRound=true;
    }
      //to check if the player has won
    if((playerDeck.cardValue()> dealerDeck.cardValue())&& endRound==false){
         System.out.println("You win");
          score += 1;
         endRound=true;
    }  
     else if(endRound==false){
         System.out.println("You loose");
         score -= 1;
          endRound=true;
     }
    //showing the score
    System.out.println(player.getPlayerID()+"score is: "+score);
    //moving back all cards to the deck once the game is over
    playerDeck.moveAllToDeck(playingDeck);
    dealerDeck.moveAllToDeck(playingDeck);
     
    System.out.println("End of the game");

    } while(playAgain());
}
    //asking user to check if he wants to start over
	public static boolean playAgain(){

		Scanner playAgainInput = new Scanner(System.in);
		String answer;
		System.out.print("Enter the word 'yes' to play again, "
                        + "or anything else to end the game: ");
		answer = playAgainInput.next();
		if (answer.equalsIgnoreCase("yes")){
			return true;
		}
		else{
		return false;
		}

	}

}


        




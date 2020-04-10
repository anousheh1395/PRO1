/**
 * SYST 17796 Project Winter 2020 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

import ca.sheridancollege.project.Card.Suit;
import ca.sheridancollege.project.Card.Value;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;


/**
 * A concrete class that represents any grouping of cards for a Game.
 * HINT, you might want to subclass this more than once.
 * The group of cards has a maximum size attribute which is flexible for reuse.
 * @author Sivagama
 *  @modifier IT Technicians
 * @date April 11,2020
 */
public class GroupOfCards   
{
    private ArrayList <Card> cards;
    private int size=52;
   
    public GroupOfCards(){
        this.cards=new ArrayList <Card>();
    }
    //creating a deck of cards
    public void createFullDeck(){
        for(Card.Suit cardSuit:Card.Suit.values()){
           for(Card.Value cardVlaue:Card.Value.values()){
                this.cards.add(new Card(cardSuit,cardVlaue) {});
           } 
        }
    }
    //get the size of the deck 
     public int getSize() {
        return size;
    }
   public void setSize(int givenSize) {
        size = givenSize;
    }
    //To shuffle the deck of cards   
    public void shuffle()
    {
        ArrayList<Card> tmpDeck=new ArrayList <Card>();
        Random random=new Random();
        int randomCardIndex=0;
        int originalSize=this.cards.size();
        for (int i=0;i< originalSize;i++){
            randomCardIndex=random.nextInt((this.cards.size()-1-0)+1)+0;
            tmpDeck.add(this.cards.get(randomCardIndex));
            this.cards.remove(randomCardIndex);
        }
        this.cards=tmpDeck;
    }
    //to remove a card from the deck
     public void removeCard(int i){
        this.cards.remove(i);
    }
     public Card getCard(int i){
         return this.cards.get(i);
     }
     // to add a card to players's and dealer's hand
     public void addCard(Card addCard){
         this.cards.add(addCard);
     }
     //to draw a card from a deck
     public void draw(GroupOfCards comingFrom){
         this.cards.add(comingFrom.getCard(0));
         comingFrom.removeCard(0);
     }
     public int deckSize(){
         return this.cards.size();
     }
     //to move back all cards to the deck
     public void moveAllToDeck(GroupOfCards moveTo){
         int thisdeckSize=this.cards.size();
         for(int i=0;i<thisdeckSize;i++){
             moveTo.addCard(this.getCard(i));
         }
         for(int i=0;i<thisdeckSize;i++){
             this.removeCard(0);
         }
     }
     @Override
    public String toString(){
        String cardListOutput=" ";
        for(Card aCard:this.cards){
           cardListOutput +="\n" +aCard.toString();
        }
        return cardListOutput;
    }
     //to calculate the value of each card
     public int cardValue(){
         int total=0;
         int aces=0;
         
         for(Card aCard:this.cards){
             switch(aCard.getValue()){
                 case TWO: total +=2; break;
                 case THREE: total +=3; break;
                 case FOUR: total +=4; break;
                 case FIVE: total +=5; break;
                 case SIX: total +=6; break;
                 case SEVEN: total +=7; break;
                 case EIGHT: total +=8; break;
                 case NINE: total +=9; break;
                 case TEN: total +=10; break;
                 case JACK: total +=10; break;
                 case QUEEN: total +=10; break;
                 case KING: total +=10; break;
                 case ACE: total +=1; break;
             }
         }
         for (int i=0;i<aces;i++){
             if(total>10){
                 total +=1;
             }
             else{
                 total +=11;
             }
         }
         return total; 
     }
}//end class

/**
 * SYST 17796 Project Winter 2020 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

/**
 * A class to be used as the base Card class for the project. Must be general
 * enough to be instantiated for any Card game. Students wishing to add to the code 
 * should remember to add themselves as a modifier.
 * @author Sivagama
 * @modifier IT Technicians
 * @date April 11,2020
 */
public abstract class Card 
{
   public enum Suit{CLUBS,DIAMONDS,HEARTS,SPADES};
   public enum Value{TWO,THREE,FOUR,FIVE,SIX,SEVEN,
   EIGHT,NINE,TEN,JACK,QUEEN,KING,ACE};
    private Suit suit;
    private Value value;
    //constructor
    public Card(Suit suit, Value value){
        this.value=value;
        this.suit=suit;
    }
    public Value getValue(){
        return this.value;
}
    @Override
     public String toString(){
    return this.suit.toString()+ " " +this.value.toString();
}
}


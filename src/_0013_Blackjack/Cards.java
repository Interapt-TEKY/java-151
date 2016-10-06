package _0013_Blackjack;

/**
 * Created by kpascascio on 10/5/16.
 */
public class Cards {
    public Suit suit;
    public Value value;

//    Constructor = Cards(Suit, value);
    public Cards(Suit s, Value v){
        value = v;
        suit = s;
    }

//    Challenge Create a method getValue for a card
    public Value getValue(){
        return value;
    }

//  Create a string that allows us to compile both value and the suit
    public String toString(){
        return suit.toString() + "-" + value.toString();
    }

}

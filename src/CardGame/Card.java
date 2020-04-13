/**
 * SYST 17796 Project Winter 2020 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package CardGame;

/**
 * A class to be used as the base Card class for the project. Must be general
 * enough to be instantiated for any Card game. Students wishing to add to the
 * code should remember to add themselves as a modifier.
 *
 * @author dancye
 */
public abstract class Card {


    private final int JACK = 11,
            QUEEN = 12,
            KING = 13,
            ACE = 1;

    private final Suit.suits suits;
    private final Value.values values;

    public Card(Value.values values, Suit.suits suits) {
        this.values = values;
        this.suits = suits;
    }

    /**
     *
     * @return
     */
    public Suit getSuit() {
        return Suit.suits;
    }

    public Value getValue() {
        return Value.values;
    }

    public String getSuitAsString() {
        switch (suits) {
            case SPADES:
                return "spades";
            case HEART:
                return "heart";
            case CLUB:
                return "club";
            case DIAMONDS:
                return "dimonds";
            default:
                return "no suit";
        }
    }

    public String getValueAsString() {
        switch (values) {
            case ONE:
                return "Ace";
            case TWO:
                return "2";
            case THREE:
                return "3";
            case FOUR:
                return "4";
            case FIVE:
                return "5";
            case SIX:
                return "6";
            case SEVEN:
                return "7";
            case EIGHT:
                return "8";
            case NINE:
                return "9";
            case TEN:
                return "10";
            case JACK:
                return "Jack";
            case QUEEN:
                return "Queen";
            case KING:
                return "King";
            default:
                return "no value";
        }
    }

    /**
     * Students should implement this method for their specific children classes
     *
     */

    @Override
    public String toString(){
        return getValueAsString() + "of" + getSuitAsString();
    }

    
    
}


package ca.nl.cna.quintin.java1.InClassAssignments.Assign6;

/**
 * Class representing a playing card.
 *
 * <pre>
 * Create a class called ‘PlayingCard’ that does the following:
 *      • Has a constructor which creates the card - it should have a valid suit and a value.
 *      • You should have getters only for these values.
 *      • Note: use constants for suits and think of how you can constrain the value. Hint: You can
 *          use constants or enums.
 *      • Override the toString method to print the playing card like “8 ♣” or “K ♦” (static). (Hint:
 *          google ‘unicode character for diamond’)
 *      • Bonus: Print an ASCII Art version of the Card to the a print screen like the following:
 *          printAsciiCard(PlayingCard playingCard, PrintStream printStream)
 * </pre>
 *
 * @author quintin.tuck
 */

public class PlayingCard {

    public static final int ACE = 1;
    public static final int JACK = 11;
    public static final int QUEEN = 12;
    public static final int KING = 13;

    private final int value;
    private final Suit suit;

    /**
     * Constructor for the playing card. Takes a face value as an int and suit.
     * @param value Face value of the card. Must tbe between ACE and KING, default is ACE
     * @param suit suit of the card i.e. "DIAMONDS".
     */
    public PlayingCard(int value, Suit suit) {
        if(ACE <= value && value <= KING) {
            this.value = value;
        } else {
            this.value = ACE;
        }

        this.suit = suit;
    }

    /**
     * Get suit.
     * @return suit, the suit of the playing card. i.e. "DIAMONDS".
     */
    public Suit getSuit() {
        return suit;
    }

    /**
     * Get value.
     * @return value, the value of the card from 1-13. (1 = Ace, 11 = Jack, 12 = Queen, 13 = King)
     */
    public int getValue() {
        return value;
    }

    /**
     * Converts value of card to its face name if card is a face card.
     * Uses unicode characters for suits to display the suit.
     * @return returnString, string combination of the cards value and suit.
     */
    @Override
    public String toString() {
        String returnString = "";

        if(this.value == ACE){
            returnString += "A ";
        } else if (this.value == JACK) {
            returnString += "J ";
        } else if (this.value == QUEEN) {
            returnString += "Q ";
        } else if (this.value == KING){
            returnString += "K ";
        } else {
            returnString += this.value + " ";
        }

        if(this.suit == Suit.DIAMONDS){
            returnString += "♦";
        } else if (this.suit == Suit.HEARTS) {
            returnString += "♥";
        } else if (this.suit == Suit.SPADE) {
            returnString += "♠";
        } else if (this.suit == Suit.CLUBS) {
            returnString += "♣";
        }

        return returnString;
    }

    /**
     * Stored values of the playing card suits.
     */
    public enum Suit {DIAMONDS, HEARTS, CLUBS, SPADE}
}

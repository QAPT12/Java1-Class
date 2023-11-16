package ca.nl.cna.quintin.java1.InClassAssignments.Assign6;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Class to represent a deck of playing cards.
 *
 * <pre>
 * Create a class called ‘CardDeck’ that has the following methods:
 *      • Has an ArrayList of Playing cards
 *      • Starts with a full deck of cards
 *      • Can be shuffled
 *      • Can draw a card
 *      • Create an application with a menu that let’s you a) draw a card b) draw a hand c) print the
 *          deck, d) shuffle the deck and e) print out the deck
 * </pre>
 *
 * @author quintin.tuck
 */
public class CardDeck {

    private ArrayList<PlayingCard> cardsArray = new ArrayList<>();

    /**
     * Constructor for the deck of cards. Loops through values 1 - 13 and adds a card for each suit to the array list.
     */
    public CardDeck() {
        for (int i = 1; i <= 13 ; i++) {
            this.cardsArray.add(new PlayingCard(i, PlayingCard.Suit.DIAMONDS));
            this.cardsArray.add(new PlayingCard(i, PlayingCard.Suit.HEARTS));
            this.cardsArray.add(new PlayingCard(i, PlayingCard.Suit.SPADE));
            this.cardsArray.add(new PlayingCard(i, PlayingCard.Suit.CLUBS));
        }
    }

    /**
     * Get cardsArray.
     * @return the list of playing cards representing the deck of cards
     */
    public ArrayList<PlayingCard> getCardsArray() {
        return cardsArray;
    }

    /**
     * Shuffle. Randomize the order of the cards array to simulate shuffling a deck of cards.
     */
    public void shuffle(){
        Collections.shuffle(this.cardsArray);
    }

    /**
     * Draw a card. Gets the first card in the cardsArray, or the 'top' card of the deck.
     * @return PlayingCard, the PlayingCard object in position 0 of the arraylist.
     */
    public PlayingCard draw(){
        PlayingCard drawnCard = this.cardsArray.get(0);
        this.cardsArray.remove(0);
        return drawnCard;
    }

}

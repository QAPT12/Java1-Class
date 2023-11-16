package ca.nl.cna.quintin.java1.InClassAssignments.Assign6;

import java.util.Random;

/**
 * Class for creating a random playing card from the PlayingCard class.
 *
 * @author quintin.tuck
 */

public class PlayingCardFactory {

    public static Random random = new Random();

    /**
     * Generate a random playing card.
     * @return PlayingCard with a randomly chosen face value and suit.
     */
    public static PlayingCard generateRandomCard(){
        int face = random.nextInt(1, 14);
        PlayingCard.Suit suit = PlayingCard.Suit.values()[random.nextInt(4)];
        return new PlayingCard(face, suit );
    }

    /**
     * Generates a random face value for a card with the given suit.
     * @param suit the suit to use for the card.
     * @return Playing Card object with random face value and the given suit.
     */
    public static PlayingCard generateRandomCard(PlayingCard.Suit suit){
        int face = random.nextInt(1, 14);
        return new PlayingCard(face, suit);

    }
}

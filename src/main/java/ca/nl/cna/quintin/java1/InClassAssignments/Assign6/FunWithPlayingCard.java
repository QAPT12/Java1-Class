package ca.nl.cna.quintin.java1.InClassAssignments.Assign6;

/**
 * Class for playing around with the PlayingCard, CardDeck, and PlayingCardFactory classes for assignment 6.
 *
 * @author quintin.tuck
 */
public class FunWithPlayingCard {

    public static void main(String[] args) {
        System.out.println("Fun with Playing Cards");

//        PlayingCard aceDiamonds = new PlayingCard(PlayingCard.ACE, PlayingCard.Suit.DIAMONDS);
//        PlayingCard twoSpades = new PlayingCard(15, PlayingCard.Suit.SPADE);
//        PlayingCard kingHearts = new PlayingCard(PlayingCard.KING, PlayingCard.Suit.HEARTS);
//        PlayingCard randomCard = PlayingCardFactory.generateRandomCard();
//        PlayingCard randomHeart = PlayingCardFactory.generateRandomCard(PlayingCard.Suit.HEARTS);
//
//
//        System.out.println(aceDiamonds);
//        System.out.println(twoSpades);
//        System.out.println(kingHearts);
//        System.out.println(randomCard);
//        System.out.println(randomHeart);

        CardDeck deck = new CardDeck();

        System.out.println(deck.getCardsArray());

        deck.shuffle();

        System.out.println(deck.getCardsArray());

    }

}

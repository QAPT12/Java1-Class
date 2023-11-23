package ca.nl.cna.quintin.java1.InClassAssignments.Assign6;

import java.util.Scanner;

/**
 * Class for playing around with the PlayingCard, CardDeck, and PlayingCardFactory classes for assignment 6.
 *
 * @author quintin.tuck
 */
public class FunWithPlayingCard {

    public static void main(String[] args) {
        System.out.println("Fun with Playing Cards");

        Scanner input = new Scanner(System.in);
        char c;

        CardDeck deck = new CardDeck();

        do {
            printMenu();

            c = Character.toUpperCase(input.next().charAt(0));

            System.out.printf("\nEcho: %c\n", c);

            if (c == 'A') {
                deck.shuffle();
            } else if (c == 'B') {
                System.out.println(deck.draw());
            } else if (c == 'C') {
                System.out.println(deck.drawHand());
            } else if (c == 'D') {
                System.out.println(deck.printDeck());
            }

            if(deck.getDeckSize() == 0){
                deck = new CardDeck();
            }

        } while (c != 'Q');

        System.out.println("\nHope you had fun!");

    }

    /**
     * Prints a menu to show user the options they can choose.
     */
    public static void printMenu() {
        System.out.println("\n");
        System.out.println("""
                Choose one of the following (When emptied the deck will be rebuilt).
                [A] Shuffle Deck.
                [B] Draw a Card.
                [C] Draw a Hand (5 Cards).
                [D] Print the Deck.
                [Q] Quit.
                Enter choice:
                """);
    }

}
package ca.nl.cna.quintin.java1.Tests.Test1;

import java.util.Random;
import java.util.Scanner;

/**
 * Playing around with some random dice rolls.
 *
 * @author quintin.tuck
 */
public class FunWithDice {

    public static void main(String[] args) {
        System.out.println("Fun With some Random Dice!");

        Random random = new Random();

        Scanner input = new Scanner(System.in);
        char c;

        do{
            printMenu();

            c = Character.toUpperCase(input.next().charAt(0));

            System.out.printf("\nEcho: %c\n", c);

            if(c == 'A'){
                System.out.printf("You Rolled: %d", random.nextInt(6) + 1);
            } else if(c == 'B'){
                System.out.printf("You Rolled: %d", random.nextInt(10) + 1);
            } else if(c == 'C'){
                System.out.printf("You Rolled: %d", random.nextInt(20) + 1);
            }

        } while(c != 'Q');

        System.out.println("\nHope you had fun!");

    }

    /**
     * Prints a menu to show user the options they can choose.
     */
    public static void printMenu(){
        System.out.println("\n");
        System.out.println("""
                Choose one of the following:
                [A] Roll a 6 sided die
                [B] Roll a 10 sided die
                [C] Roll a 20 sided die
                [Q] quit
                Enter choice:
                """);
    }

}

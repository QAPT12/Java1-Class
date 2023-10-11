/**
 * <p><pre>
 *  Part 2: Fib-something pattern
 *   A) Using a for loop, generate the following pattern based on the for loops counter variable i:
 *   0, 1, 1, 2, 3, 5, 8, 13
 *   Hint: store the first two in variables and then save previous values in local variables. This is a famous
 *   sequence.
 *   B) Modify the loop to take in a limit from the user and generate the sequence to that limit. Ie. If
 *   someone enters 1000, keep looping and printing out this sequence until it hits 1000. (It won’t
 *   take long)
 * </pre></p>
 */

package cna.nl.ca.quintin.java1.Assignment1.InClassAssignment3;

import java.util.Scanner;

public class FibSomethingPatternB {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Fun With Fib Something!");
        System.out.println("Enter the number you want to reach (or closest in pattern): ");
        int userNum = input.nextInt();

        int firstNum;
        int secondNum = 1;

        for(int i = 0; i <= userNum; i = firstNum) {
            System.out.printf("%d ", i);
            firstNum = secondNum;
            secondNum += i;
        }

    }

}

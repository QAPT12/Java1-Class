/**
 * <p><pre>
 * Part 1: Simple number pattern
 *
 *  Using a for loop, generate the following pattern:
 *  -2, 1, 4, 7, 10, 13, 16, 19
 *  Hint: it’s a linear equation based on counter variable i.
 * </pre></p>
 */

package ca.nl.cna.quintin.java1.Assignment1.InClassAssignment3;

public class SimpleNumberPattern {

    public static void main(String[] args) {

        System.out.println("Fun With Simple Number Pattern!");

        for(int i = -2; i <= 19; i += 3) {
            System.out.printf("%d ", i);
        }

    }

}

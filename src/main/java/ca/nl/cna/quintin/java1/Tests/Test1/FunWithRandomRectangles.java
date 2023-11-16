package ca.nl.cna.quintin.java1.Tests.Test1;

import java.util.Random;
import static ca.nl.cna.quintin.java1.Tests.Test1.FunWithRectangles.printRectangleInfo;

/**
 * Playing around with randomly created rectangles.
 *
 * @author quintin.tuck
 */
public class FunWithRandomRectangles {

    public static void main(String[] args) {
        System.out.println("Fun with Random Rectangles!");

        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            Rectangle rectangle = new Rectangle(random.nextInt(11), random.nextInt(11));

            System.out.println("\n");
            printRectangleInfo(rectangle);

            if(rectangle.isSquare()){
                System.out.print(" <- WINNER! RANDOM SQUARE!");
            }

        }

    }

}

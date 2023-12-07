package ca.nl.cna.quintin.java1.Project.Printing;

import java.util.Random;

public class FooDataFactory {

    public static FooData generateSmallFooData(){
        Random random = new Random();
        int quantity = random.nextInt(10) + 1;
        double price = random.nextDouble(1000);
        return new FooData(String.valueOf(random.nextInt(100) + 1),
                "oijowijo",
                quantity,
                price,
                quantity * price);
    }

}

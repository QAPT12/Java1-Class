package ca.nl.cna.quintin.java1.Project.Printing;

import java.io.PrintStream;

/**
 * application to show printing column data with variable lengths
 * done in class as part of prep for invoice project
 *
 * @author quintin.tuck
 */
public class FunWIthPrintf {

    private static final int QUANTITY_COL_WIDTH = 10;

    public static void main(String[] args) {
        System.out.println("Fun with printf");

        printFooDataTableHeading(System.out);
        printFooData(FooDataFactory.generateSmallFooData(), System.out);



    }

    public static void printFooDataTableHeading(PrintStream printStream){
        printStream.printf("%3s %-20s %" + QUANTITY_COL_WIDTH + "s %10s %10s\n", "ID", "DESCRIPTION", "QUANTITY", "PRICE", "TOTAL");
    }

    public static void printFooData(FooData fooData, PrintStream printStream){
        //TODO this may migrate to a place with more settings and private variables
        printStream.printf("%3s %-20s %" + QUANTITY_COL_WIDTH +"d %10.2f %10.2f",
                fooData.getId(), fooData.getDescription(), fooData.getQuantity(), fooData.getPrice(), fooData.getTotal());
    }

}

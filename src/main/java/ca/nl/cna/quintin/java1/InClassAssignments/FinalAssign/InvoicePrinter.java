package ca.nl.cna.quintin.java1.InClassAssignments.FinalAssign;

import java.io.PrintStream;

/**
 * Class for printing an Invoice in nice formatting.
 *
 * @author quintin.tuck
 */
public class InvoicePrinter {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static int maxDescriptionWidth = 5;



    public static void printHeader(PrintStream printStream){
        printStream.println(ANSI_GREEN + "=============================================================");
        printStream.println(ANSI_RED + "Quintin's Retro Computers");
        printStream.println(ANSI_BLUE + "123" + ANSI_RED + " Road Street");
        printStream.println(ANSI_BLUE + "St. John's " +  "NL " + ANSI_RED +  "A1B2C3");
        printStream.println(ANSI_CYAN + "Phone: " + ANSI_RED + "709 682-2345");
        printStream.println(ANSI_CYAN + "Email: " + ANSI_RED + "info@retrocompshop.ca");
        printStream.println(ANSI_GREEN + "=============================================================");
    }

    public static void getLargesDescription(Invoice invoice){
        for (InvoiceLineItem invoiceLineItem: invoice.getInvoiceLineItemArrayList()) {
            if(invoiceLineItem.getItem().getDescription().length() > InvoicePrinter.maxDescriptionWidth){
                InvoicePrinter.maxDescriptionWidth = invoiceLineItem.getItem().getDescription().length();
            }
        }
    }

    public static void printColumnHeaders(PrintStream printStream){
        printStream.printf(ANSI_RED + "%4s %" + maxDescriptionWidth + "s %5s %10s %10s\n", "ID", "DESCRIPTION", "QTY", "PRICE($)", "TOTAL($)");
    }

    public static void printInvoiceData(PrintStream printStream){

    }

}

package ca.nl.cna.quintin.java1.InClassAssignments.FinalAssign;

import java.io.PrintStream;
import java.time.LocalDate;

/**
 * Class for printing an Invoice in nice formatting.
 *
 * @author quintin.tuck
 */
public class InvoicePrinter {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static int maxDescriptionWidth = 5;

    /**
     * printInvoice. Takes an invoice and calls all the methods to print it out to PrintStream nicely formatted.
     * @param printStream Area to print to.
     * @param invoice The invoice being printed to the screen.
     */
    public static void printInvoice(PrintStream printStream, Invoice invoice){
        InvoicePrinter.printHeader(printStream);
        InvoicePrinter.printInvoiceInformation(printStream, invoice);
        InvoicePrinter.getLargesDescription(invoice);
        InvoicePrinter.printInvoiceColumnHeaders(printStream);
        InvoicePrinter.printInvoiceData(printStream, invoice);

    }

    /**
     * printHeader. Prints all the company information for the top of the invoice.
     * @param printStream Area to print to.
     */
    public static void printHeader(PrintStream printStream){
        printStream.println(ANSI_GREEN + "===========================================================================");
        printStream.println(ANSI_RED + "Quintin's Retro Computers");
        printStream.println(ANSI_BLUE + "123 Road Street");
        printStream.println(ANSI_BLUE + "St. John's " +  "NL A1B2C3");
        printStream.println(ANSI_CYAN + "Phone: " + ANSI_RED + "709 682-2345");
        printStream.println(ANSI_CYAN + "Email: " + ANSI_RED + "info@retrocompshop.ca");
        printStream.println(ANSI_GREEN + "===========================================================================");
    }

    /**
     * printInvoiceInformation. Prints all the information about the invoice like invoice number, due dates, and customer information.
     * @param printStream Area to print to.
     * @param invoice Invoice to get the information from.
     */
    public static void printInvoiceInformation(PrintStream printStream, Invoice invoice){
        printStream.printf("\n" + ANSI_CYAN + "Invoice Number: " + ANSI_RED + "%S", invoice.getInvoiceNumber());
        printStream.printf("\n" + ANSI_CYAN + "Date: " + ANSI_RED + "%s", LocalDate.now());
        printStream.printf("\n" + ANSI_CYAN + "Due Date: " + ANSI_PURPLE + "%s",invoice.getDueDate());
        printStream.println("\n" + ANSI_GREEN + "\nCustomer Information");
        printStream.printf(ANSI_CYAN + "Customer Name: " + ANSI_RED + "%s %s", invoice.getCustomer().getFirstName(), invoice.getCustomer().getLastName());
        printStream.printf("\n" + ANSI_CYAN + "Customer Email: " + ANSI_RED + "%s", invoice.getCustomer().getEmail());
        printStream.printf("\n" + ANSI_CYAN + "Address: " + ANSI_BLUE + "%s %s \n\t%s %s %s",
                invoice.getCustomer().getAddress().getNumber(), //number
                invoice.getCustomer().getAddress().getStreet(), //street
                invoice.getCustomer().getAddress().getCity(), //city
                invoice.getCustomer().getAddress().getProvince(), //province
                invoice.getCustomer().getAddress().getPostal() //postal
                );
        printStream.println(ANSI_GREEN + "\n===========================================================================");
    }

    /**
     * getLargestDescription. Looks at all line items on the invoice and gets the largest description to set the width
     * of description in the invoice items printing section.
     * @param invoice Invoice we are looking to print.
     */
    public static void getLargesDescription(Invoice invoice){
        for (InvoiceLineItem invoiceLineItem: invoice.getInvoiceLineItemArrayList()) {
            if(invoiceLineItem.getItem().getDescription().length() > InvoicePrinter.maxDescriptionWidth){
                InvoicePrinter.maxDescriptionWidth = invoiceLineItem.getItem().getDescription().length();
            }
        }
    }

    /**
     * printInvoiceColumnHeaders. Prints out the headers for the invoice section.
     * @param printStream Area to print to.
     */
    public static void printInvoiceColumnHeaders(PrintStream printStream){
        printStream.printf(ANSI_RED + "%-10s %-" + maxDescriptionWidth + "s %5s %10s %10s\n", "ID", "DESCRIPTION", "QTY", "PRICE($)", "TOTAL($)");
    }

    /**
     * printInvoiceData. This is where all the line items and information like Quantity, Unit price, and Line total will be printed.
     * @param printStream Area to print to.
     */
    public static void printInvoiceData(PrintStream printStream, Invoice invoice){
        printStream.println(ANSI_GREEN + "---------------------------------------------------------------------------");
        for (InvoiceLineItem lineItem: invoice.getInvoiceLineItemArrayList()) {
            printStream.printf(ANSI_CYAN + "%-10s " + ANSI_WHITE + "%-" + maxDescriptionWidth + "s" + ANSI_BLUE +" %5s" + ANSI_WHITE +" %10.2f %10.2f\n",
                    lineItem.getItem().getId(), //ID
                    lineItem.getItem().getDescription(), //Description
                    lineItem.getQuantity(), //Quantity
                    lineItem.getItem().getPrice(), //Price
                    lineItem.calculatePrice() //Total
            );
        }
        printStream.println(ANSI_GREEN + "---------------------------------------------------------------------------");
        printStream.printf(ANSI_RED + "%-50s" + ANSI_WHITE + "%.2f", "Subtotal: ", invoice.calculateSubTotal());
        printStream.printf("\n" + ANSI_RED + "%-50s" + ANSI_WHITE + "%.2f", "Taxes(15%%): ", invoice.calculateTaxes());
        printStream.println("\n" + ANSI_GREEN + "---------------------------------------------------------------------------");
        printStream.printf(ANSI_RED + "%-50s" + ANSI_WHITE + "%.2f", "Total Amount Due: ", invoice.calculateFinalTotal());
        printStream.println(ANSI_GREEN + "\n===========================================================================" + ANSI_RESET);
    }

}

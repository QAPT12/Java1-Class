package ca.nl.cna.quintin.java1.InClassAssignments.FinalAssign;

import ca.nl.cna.quintin.java1.InClassAssignments.Assign6.CardDeck;

import java.time.LocalDate;
import java.util.Scanner;

public class FunWithInvoice {

    public static void main(String[] args) {
        System.out.println("Welcome to Quintin's Retro Computers!!!");

        Scanner input = new Scanner(System.in).useDelimiter("\n");
        char c;

        Catalog catalog = new Catalog();

        do {
            printMenu();

            c = Character.toUpperCase(input.next().charAt(0));

            if (c == 'A') {
                catalog.printCatalog(System.out);
            } else if (c == 'B') {
                System.out.println("Building Invoice...");
                System.out.println("Enter Customer Information.");

                System.out.print("First Name: ");
                String firstName = input.next();

                System.out.print("Last Name: ");
                String lastName = input.next();

                System.out.print("Email: ");
                String email = input.next();

                System.out.println("\nCustomer Address.");
                System.out.print("Province: ");
                String province = input.next().toUpperCase();

                System.out.print("City: ");
                String city = input.next();

                System.out.print("Street: ");
                String street = input.next();

                System.out.print("Num: ");
                String num = input.next();

                System.out.println("Postal Code: ");
                String postal = input.next().toUpperCase();

                Address customerAddress = new Address(province, city, street, num, postal);

                Customer customer = new Customer(firstName, lastName, email, customerAddress);

                System.out.print("Enter Invoice Number: ");
                String invoiceNum = input.next();

                Invoice invoice = new Invoice(customer, invoiceNum);

                String productId;
                do {
                    catalog.printCatalog(System.out);
                    System.out.print("\nEnter Product ID to add to invoice. (Q to finish): ");
                    productId = input.next().toUpperCase();
                    if(!productId.equals("Q")) {
                        if(catalog.getProduct(productId) != null) {
                            System.out.print("Quantity: ");
                            int quantity = input.nextInt();
                            invoice.addInvoiceLineItem(new InvoiceLineItem(catalog.getProduct(productId), quantity));
                        } else {
                            System.out.println("Error finding product, check ID and try again.");
                        }
                    }
                } while(!productId.equals("Q"));

                System.out.print("Enter Payment Terms(Days): ");
                int terms = input.nextInt();

                invoice.calculateDueDate(terms);

                InvoicePrinter.printInvoice(System.out, invoice);
            } else if (c == 'C') {
                FunWithInvoice.printJoshInvoice(catalog);
            }
        } while (c != 'Q');
    }

    /**
     * Prints a menu to show user the options they can choose.
     */
    public static void printMenu() {
        System.out.println("\n");
        System.out.println("""
                Choose one of the following.
                [A] Print Catalog.
                [B] Create Invoice.
                [C] Print Josh's Test Invoice.
                [Q] Quit.
                Enter choice:""");
    }

    /**
     * printJoshInvoice. Create and print Josh's invoice for the testing.
     * @param catalog catalog of products.
     */
    public static void printJoshInvoice(Catalog catalog) {

        Address customerAddress = new Address("NL", "St.John's", "Real Street", "123", "A1A 1A1");

        Customer customer = new Customer("Tosh", "Baylor", "joshtaylor@ed.cna.nl.ca", customerAddress);

        Invoice invoice = new Invoice(customer, "K000234");

        invoice.addInvoiceLineItem(new InvoiceLineItem(catalog.getProduct("CP001"), 1));
        invoice.addInvoiceLineItem(new InvoiceLineItem(catalog.getProduct("MB002"), 1));
        invoice.addInvoiceLineItem(new InvoiceLineItem(catalog.getProduct("HD003"), 1));
        invoice.addInvoiceLineItem(new InvoiceLineItem(catalog.getProduct("RM004"), 2));
        invoice.addInvoiceLineItem(new InvoiceLineItem(catalog.getProduct("VC005"), 1));
        invoice.addInvoiceLineItem(new InvoiceLineItem(catalog.getProduct("PS007"), 1));
        invoice.addInvoiceLineItem(new InvoiceLineItem(catalog.getProduct("FN013"), 1));
        invoice.addInvoiceLineItem(new InvoiceLineItem(catalog.getProduct("ASSEMBLE"), 1));

        invoice.calculateDueDate(30);

        InvoicePrinter.printInvoice(System.out, invoice);

    }

}

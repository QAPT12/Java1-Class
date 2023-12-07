package ca.nl.cna.quintin.java1.InClassAssignments.FinalAssign;

import java.io.PrintStream;

public class FunWithInvoice {

    public static void main(String[] args) {
//        System.out.println("Fun With Invoices!");
//        System.out.println("Making sure all my stuff works.");
//
//        System.out.println("\n creating new address.");
//        Address customerAddress = new Address("NL", "Mount Pearl", "Prince Philip Drive", "21", "A1A 1A1");
//        printAddress(customerAddress);
//
//        System.out.println("\n creating new customer.");
//        Customer customer = new Customer("Tosh", "Baylor", "joshtaylor@ed.cna.nl.ca", customerAddress);
//        printCustomer(customer);

        InvoicePrinter.printHeader(System.out);
//       InvoicePrinter.getLargesDescription(invoice);
        InvoicePrinter.printColumnHeaders(System.out);
    }

    public static void printAddress(Address address){
        System.out.printf("province: %s  city: %s  street: %s  number: %s  postal: %s", address.getProvince(), address.getCity(), address.getStreet(), address.getNumber(), address.getPostal());
    }

    public static void printCustomer(Customer customer){
        System.out.printf("firstname: %s  lastname: %s  email: %s  address: ", customer.getFirstName(), customer.getLastName(), customer.getEmail());
        printAddress(customer.getAddress());
    }

}

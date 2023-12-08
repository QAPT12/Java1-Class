package ca.nl.cna.quintin.java1.InClassAssignments.FinalAssign;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.util.ArrayList;
import java.util.Locale;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for the invoice class for the invoice system final assignment.
 */
class InvoiceTest {

    String id = "1984";
    String description = "a test item";
    double price = 125.00;
    int quantity = 2;
    String firstName = "Tosh";
    String lastName = "Baylor";
    String email = "email.com";
    String province = "NL";
    String city = "mount pearl";
    String street = "test street";
    String number = "12";
    String postal = "A1A2B2";
    String invoiceNum = "1234";
    Product testProduct;
    Address address;
    Customer customer;
    Invoice invoice;



    /**
     * addInvoiceLineItem. Test to make sure adding an item to the invoice works.
     */
    @Test
    void addInvoiceLineItem() {
        testProduct = new Product(id, description, price);
        address = new Address(province, city, street, number, postal);
        customer = new Customer(firstName, lastName, email, address);
        invoice = new Invoice(customer, invoiceNum);
        invoice.addInvoiceLineItem(new InvoiceLineItem(testProduct, quantity));
        assertNotEquals(invoice.getInvoiceLineItemArrayList().size(), 0);
    }

    /**
     * getCustomer. Test to make sure the getter for customer returns the correct user.
     */
    @Test
    void getCustomer() {
        testProduct = new Product(id, description, price);
        address = new Address(province, city, street, number, postal);
        customer = new Customer(firstName, lastName, email, address);
        invoice = new Invoice(customer, invoiceNum);
        invoice.addInvoiceLineItem(new InvoiceLineItem(testProduct, quantity));
        assertEquals(invoice.getCustomer(), customer);

    }

    /**
     * calculateDueDate. Test to make sure calculate due date calculates and returns the proper date.
     */
    @Test
    void calculateDueDate() {
        testProduct = new Product(id, description, price);
        address = new Address(province, city, street, number, postal);
        customer = new Customer(firstName, lastName, email, address);
        invoice = new Invoice(customer, invoiceNum);
        invoice.addInvoiceLineItem(new InvoiceLineItem(testProduct, quantity));
        LocalDate dueDate = LocalDate.now().plusDays(30);
        invoice.calculateDueDate(30);
        assertEquals(invoice.getDueDate(), dueDate);
    }

    /**
     * getDueDate. Test to make sure due date returns the proper value.
     */
    @Test
    void getDueDate() {
        testProduct = new Product(id, description, price);
        address = new Address(province, city, street, number, postal);
        customer = new Customer(firstName, lastName, email, address);
        invoice = new Invoice(customer, invoiceNum);
        invoice.addInvoiceLineItem(new InvoiceLineItem(testProduct, quantity));
        LocalDate dueDate = LocalDate.now().plusDays(30);
        invoice.calculateDueDate(30);
        assertEquals(invoice.getDueDate(), dueDate);
    }

    /**
     * getInvoiceNumber. Test to make sure getter for invoice number returns the right value.
     */
    @Test
    void getInvoiceNumber() {
        testProduct = new Product(id, description, price);
        address = new Address(province, city, street, number, postal);
        customer = new Customer(firstName, lastName, email, address);
        invoice = new Invoice(customer, invoiceNum);
        invoice.addInvoiceLineItem(new InvoiceLineItem(testProduct, quantity));
        assertEquals(invoice.getInvoiceNumber(), invoiceNum);
    }

    /**
     * calculateSubTotal. Test to make sure the calculate subtotal method works ad returns proper value.
     */
    @Test
    void calculateSubTotal() {
        testProduct = new Product(id, description, price);
        address = new Address(province, city, street, number, postal);
        customer = new Customer(firstName, lastName, email, address);
        invoice = new Invoice(customer, invoiceNum);
        invoice.addInvoiceLineItem(new InvoiceLineItem(testProduct, quantity));
        double properSubTotal = 250.00;

        assertEquals(invoice.calculateSubTotal(), properSubTotal);
    }

    /**
     * calculateTaxes. Test to make sure the calculate taxes method calculates and returns the proper value.
     */
    @Test
    void calculateTaxes() {
        testProduct = new Product(id, description, price);
        address = new Address(province, city, street, number, postal);
        customer = new Customer(firstName, lastName, email, address);
        invoice = new Invoice(customer, invoiceNum);
        invoice.addInvoiceLineItem(new InvoiceLineItem(testProduct, quantity));
        double properTax = 37.50;

        assertEquals(invoice.calculateTaxes(), properTax);
    }

    /**
     * calculateFinalTotal. Test to make sure the calculate total method works and returns the proper value
     */
    @Test
    void calculateFinalTotal() {
        testProduct = new Product(id, description, price);
        address = new Address(province, city, street, number, postal);
        customer = new Customer(firstName, lastName, email, address);
        invoice = new Invoice(customer, invoiceNum);
        invoice.addInvoiceLineItem(new InvoiceLineItem(testProduct, quantity));
        double properTotal = 287.50;

        assertEquals(invoice.calculateFinalTotal(), properTotal);
    }


}
package ca.nl.cna.quintin.java1.InClassAssignments.FinalAssign;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for InvoiceLineItemTest class for the invoice system.
 *
 * @author quintin.tuck
 */
class InvoiceLineItemTest {

    Product product = new Product("2", "A Test Item", 25.00);
    InvoiceLineItem invoiceItem = new InvoiceLineItem(product, 2);

    /**
     * getItem. Test to make sure the getter for item returns the proper item.
     */
    @Test
    void getItem() {
        assertEquals(invoiceItem.getItem(), product);
    }

    /**
     * getQuantity. Test to make sure the getter for quantity returns the proper value.
     */
    @Test
    void getQuantity() {
        assertEquals(invoiceItem.getQuantity(), 2);
    }

    /**
     * calculatePrice. Test to make sure the calculate price method returns the proper value.
     */
    @Test
    void calculatePrice() {
        assertEquals(invoiceItem.calculatePrice(), 50.00);
    }
}
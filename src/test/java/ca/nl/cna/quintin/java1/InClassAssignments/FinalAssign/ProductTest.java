package ca.nl.cna.quintin.java1.InClassAssignments.FinalAssign;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for the product class on the invoice system final assignment.
 *
 * @author quintin.tuck
 */
class ProductTest {

    /**
     * getPrice. Tests to make sure the getter for price returns the same value given to the constructor.
     */
    @Test
    void getPrice() {
        double price = 25.00;
        Product testProduct = new Product("something", "an item being sold", price);
        assertEquals(testProduct.getPrice(), price);
    }

    /**
     * getId. Tests to make sure the getter for is returns the same value given to the constructor.
     */
    @Test
    void getId() {
        String id = "MK22034";
        Product testProduct = new Product(id, "an item being sold", 25.00);
        assertEquals(testProduct.getId(), id);

    }

    /**
     * getDescription. Tests to make sure the getter for the description returns the same value given in the constructor.
     */
    @Test
    void getDescription() {
        String description = "This is the test description";
        Product testProduct = new Product("0000123", description, 25.00);
        assertEquals(testProduct.getDescription(), description);

    }
}
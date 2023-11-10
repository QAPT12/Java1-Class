package ca.nl.cna.quintin.java1.InClassAssignments.Assign5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    @Test
    void getId() {
        int id = 1;
        Product product = new Product(id, "a pair of socks", 3.99);
        assertEquals(id, product.getId());
    }

    @Test
    void setId() {
        int newId = 2;
        Product product = new Product(1, "a pair of socks", 3.99);
        product.setId(newId);
        assertEquals(newId, product.getId());

        int negId = -2;
        product.setId(negId);
        assertEquals(newId, product.getId());

    }

    @Test
    void getDescription() {
        String desc = "a pair of socks";
        Product product = new Product(1, desc, 3.99);
        assertEquals(desc, product.getDescription());
    }

    @Test
    void setDescription() {
        String newDesc = "definitely not a pair of socks";
        Product product = new Product(1, "a pair of socks", 3.99);
        product.setDescription(newDesc);
        assertEquals(newDesc, product.getDescription());
    }

    @Test
    void getPrice() {
        double price = 3.99;
        Product product = new Product(1, "a pair of socks", price);
        assertEquals(price, product.getPrice());
    }

    @Test
    void setPrice() {
        double newPrice = 2.99;
        Product product = new Product(1, "a pair of socks", 3.99);
        product.setPrice(newPrice);
        assertEquals(newPrice, product.getPrice());

        double negPrice = -1.99;
        product.setPrice(negPrice);
        assertEquals(newPrice, product.getPrice());

    }
}
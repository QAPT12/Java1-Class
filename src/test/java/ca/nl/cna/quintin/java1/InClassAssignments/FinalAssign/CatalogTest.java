package ca.nl.cna.quintin.java1.InClassAssignments.FinalAssign;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for the Catalog class for the invoice system final assignment.
 *
 * @author quintin.tuck
 */
class CatalogTest {

    /**
     * getKnownProduct. Tests a known product to ensure the method works properly and returns a Billable item.
     */
    @Test
    void getKnownProduct() {
        Product knownProduct = new Product("CP001", "Intel Pentium III Processor", 120);

        Catalog catalog = new Catalog();
        Billable testProduct = catalog.getProduct("CP001");

        assertEquals(knownProduct.getId(), testProduct.getId());
        assertEquals(knownProduct.getDescription(), testProduct.getDescription());
        assertEquals(knownProduct.getPrice(), testProduct.getPrice());
    }

    /**
     * getFakeProduct. Tries to get a product not in the catalog. Should return null.
     */
    @Test
    void getFakeProduct(){
        Catalog catalog = new Catalog();
        assertNull(catalog.getProduct("woeifjwoei"));
    }

}
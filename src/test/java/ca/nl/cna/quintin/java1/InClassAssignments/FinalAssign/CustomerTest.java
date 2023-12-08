package ca.nl.cna.quintin.java1.InClassAssignments.FinalAssign;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for the Customer class on the invoice system final assignment.
 *
 * @author quintin.tuck
 */
class CustomerTest {

    Address testAddress = new Address("NL", "mount pearl", "road", "12", "A1A2B2");

    /**
     * getFirstName. Test to make sure the getter for first name returns the same as the pre-defined string.
     */
    @Test
    void getFirstName() {
        String firstName = "josh";
        Customer customer = new Customer(firstName, "taylor", "joshtaylor@ed.cna.nl.ca", testAddress);
        assertEquals(customer.getFirstName(), firstName);
    }

    /**
     * getLastName. Test to make sure the getter for first last returns the same as the pre-defined string.
     */
    @Test
    void getLastName() {
        String lastName = "taylor";
        Customer customer = new Customer("josh", lastName, "joshtaylor@ed.cna.nl.ca", testAddress);
        assertEquals(customer.getLastName(), lastName);
    }

    /**
     * getEmail. Test to make sure the getter for email returns the same as the pre-defined string.
     */
    @Test
    void getEmail() {
        String email = "joshtaylor@ed.cna.nl.ca";
        Customer customer = new Customer("josh", "taylor", email, testAddress);
        assertEquals(customer.getEmail(), email);
    }

    /**
     * getAddress. Test to make sure the getter for address returns an address object with the same values as the pre-built one.
     */
    @Test
    void getAddress() {
        String province = "NS";
        String city = "city";
        String street = "street";
        String num = "12a";
        String postal = "aaaaaaa";

        testAddress = new Address(province, city, street, num, postal);
        Customer customer = new Customer("josh", "taylor", "joshtaylor@ed.cna.nl.ca", testAddress);

        assertEquals(customer.getAddress().getProvince(), province);
        assertEquals(customer.getAddress().getCity(), city);
        assertEquals(customer.getAddress().getStreet(), street);
        assertEquals(customer.getAddress().getNumber(), num);
        assertEquals(customer.getAddress().getPostal(), postal);
    }

}
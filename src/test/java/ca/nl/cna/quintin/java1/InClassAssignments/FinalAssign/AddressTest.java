package ca.nl.cna.quintin.java1.InClassAssignments.FinalAssign;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for the Address class in the invoice system final assignment.
 *
 * @author quintin.tuck
 */
class AddressTest {

    String province = "NL";
    String city = "mount pearl";
    String street = "test street";
    String num = "12 A";
    String postal = "A1A2B2";

    Address testAddress = new Address(province, city, street, num, postal);

    /**
     * getProvince. Test to make sure getter for province returns the pre-defined string for province.
     */
    @Test
    void getProvince() {
        assertEquals(testAddress.getProvince(), province);
    }

    /**
     * getCity. Test to make sure the getter for city returns the pre-defined string for city.
     */
    @Test
    void getCity() {
        assertEquals(testAddress.getCity(), city);
    }

    /**
     * getStreet. Test to make sure the getter for street returns the pre-defined string for street.
     */
    @Test
    void getStreet() {
        assertEquals(testAddress.getStreet(), street);
    }

    /**
     * getNumber. Test to make sure the getter for num returns the pre-defined string for num.
     */
    @Test
    void getNumber() {
        assertEquals(testAddress.getNumber(), num);
    }

    /**
     * getPostal. Test to make sure the getter for postal returns the pre-defined string for postal.
     */
    @Test
    void getPostal() {
        assertEquals(testAddress.getPostal(), postal);
    }
}
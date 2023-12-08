package ca.nl.cna.quintin.java1.InClassAssignments.FinalAssign;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for the service class for the invoice system final assignment.
 *
 * @author quintin.tuck
 */
class ServiceTest {

    Service service = new Service(Service.Services.ASSEMBLE);

    /**
     * getPrice. Test to make sure the getter for price for service returns the proper value.
     */
    @Test
    void getPrice() {
        assertEquals(service.getPrice(), 125.00);
    }

    /**
     * getId. Test to make sure the getter for id returns the proper value.
     */
    @Test
    void getId() {
        assertEquals(service.getId(), "ASSEMBLE");
    }

    /**
     * getDescription. Test to make sure the getter for description returns the proper value.
     */
    @Test
    void getDescription() {
        assertEquals(service.getDescription(), "Computer Assembly");
    }

}
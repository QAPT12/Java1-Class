package ca.nl.cna.quintin.java1.InClassAssignments.FinalAssign;

/**
 * Simple class for representing a customer in an invoice system.
 *
 * @author quintin.tuck
 */
public class Customer {

    private String firstName;
    private String lastName;
    private String email;
    private Address address;

    /**
     * Simple constructor for customer class. takes name information, email, and an address.
     * @param firstName first name of the customer.
     * @param lastName last name of the customer.
     * @param email email address for the customer.
     * @param address address object storing the customers address information.
     */
    public Customer(String firstName, String lastName, String email, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.address = address;
    }

    /**
     * getFirstName. Gets the first name for the customer.
     * @return first name.
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * getLastName. Get the last name of the customer.
     * @return last name.
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * getEmail. Gets the customers email.
     * @return email.
     */
    public String getEmail() {
        return email;
    }

    /**
     * getAddress. Gets the address object attached to the customer.
     * @return customers address.
     */
    public Address getAddress() {
        return address;
    }

}

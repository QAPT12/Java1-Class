package ca.nl.cna.quintin.java1.InClassAssignments.FinalAssign;

/**
 * Class representing a product for an invoice system, extends the billable class.
 *
 * @author quintin.tuck
 */
public class Product extends Billable{

    /**
     * Constructor for a Product.
     *
     * @param id String to use as an identifier for the product.
     * @param description short description explaining what the product is.
     * @param price price of the product.
     */
    public Product(String id, String description, double price) {
        super(id, description, price);
    }

}

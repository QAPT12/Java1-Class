package ca.nl.cna.quintin.java1.InClassAssignments.FinalAssign;

/**
 * Abstract class for billable item to use on invoice system.
 *
 * @author quintin.tuck
 */
public abstract class Billable {
    private final double price;
    private final String id;
    private final String description;


    /**
     * Constructor for a Billable item.
     * @param id String to use as an identifier for the item.
     * @param description short description explaining what the item is.
     * @param price price of the item.
     */
    public Billable(String id, String description, double price) {
        this.price = price;
        this.id = id;
        this.description = description;
    }

    /**
     * getPrice.
     * @return price of the billable item
     */
    public double getPrice() {
        return price;
    }

    /**
     * getId.
     * @return ID for the billable item.
     */
    public String getId() {
        return id;
    }

    /**
     * getDescription.
     * @return description for the billable
     */
    public String getDescription() {
        return description;
    }

}

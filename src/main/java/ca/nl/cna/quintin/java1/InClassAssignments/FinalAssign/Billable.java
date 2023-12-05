package ca.nl.cna.quintin.java1.InClassAssignments.FinalAssign;

/**
 * Abstract class for billable item to use on invoice system.
 *
 * @author quintin.tuck
 */
public abstract class Billable {
    private double price;
    private String id;
    private String description;

    /**
     * getPrice.
     * @return price of the billable item
     */
    public double getPrice() {
        return price;
    }

    /**
     * setPrice.
     * @param price new price for the item. Must be above 0 or price is not changed.
     */
    public void setPrice(double price) {
        if(price > 0 ) {
            this.price = price;
        }
    }

    /**
     * getId.
     * @return ID for the billable item.
     */
    public String getId() {
        return id;
    }

    /**
     * setId.
     * @param id new ID for the billable item.
     */
    public void setId(String id) {
        this.id = id;
    }

}

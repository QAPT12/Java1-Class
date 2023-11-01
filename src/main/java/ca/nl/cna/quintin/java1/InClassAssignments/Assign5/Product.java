package ca.nl.cna.quintin.java1.InClassAssignments.Assign5;

/**
 * Class representing a product for the simple invoice system.
 *
 * @author quintin.tuck
 */
public class Product {

    private int id;
    private String description;
    private double price;

    /**
     * Constructor for the product. Takes a product id, description of product, and price.
     * @param id id for product
     * @param description product description
     * @param price price of product. Takes the highest value between the given value and 0 to not allow negatives.
     */
    public Product(int id, String description, double price) {
        this.id = id;
        this.description = description;
        this.price = Math.max(price, 0);
    }

    /**
     * Get product id.
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * Set product id.
     * @param id product id. Must be greater than zero. if ont id does not change.
     *
     */
    public void setId(int id) {
        if(id >= 0) {
            this.id = id;
        }
    }

    /**
     * Get product description.
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Set description.
     * @param description products description.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Get price.
     * @return price
     */
    public double getPrice() {
        return price;
    }

    /**
     * Set price.
     * @param price price of product. Must be greater than 0 or price is not changed.
     */
    public void setPrice(double price) {
        if(price >= 0) {
            this.price = price;
        }
    }
}

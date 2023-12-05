package ca.nl.cna.quintin.java1.Project.Printing;

/**
 * a silly class for some data
 */
public class FooData {

    private String id;
    private String description;
    private int quantity;
    private double price;
    private double total;

    public FooData(String id, String description, int quantity, double price, double total) {

        this.id = id;
        this.description = description;
        this.quantity = quantity;
        this.price = price;
        this.total = total;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}


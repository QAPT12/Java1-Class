package ca.nl.cna.quintin.java1.InClassAssignments.Assign5;

public class Product {

    private int id;
    private String description;
    private double price;

    public Product(int id, String description, double price) {
        this.id = id;
        this.description = description;
        this.price = Math.max(price, 0);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if(id >= 0) {
            this.id = id;
        }
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price >= 0) {
            this.price = price;
        }
    }
}

package ca.nl.cna.quintin.java1.InClassAssignments.Assign5;

public class InvoiceItem {

    private Product product;
    private int quantity;

    public InvoiceItem(Product product, int quantity) {
        this.product = product;
        this.quantity = Math.max(quantity, 0);
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if(quantity >= 0){
            this.quantity = quantity;
        }
    }

    public double getItemTotal() {
        double price = this.product.getPrice();
        int quantity = this.quantity;
        return(price * quantity);
    }
}

package ca.nl.cna.quintin.java1.InClassAssignments.Assign5;

/**
 * Class representing a line item on an invoice for the simple invoice system.
 *
 * @author quintin.tuck
 */
public class InvoiceItem {

    private Product product;
    private int quantity;

    /**
     * Constructor for the invoice item. Takes a Product object and the quantity.
     * @param product item of type Product.
     * @param quantity amount of that product to add to the invoice.
     */
    public InvoiceItem(Product product, int quantity) {
        this.product = product;
        this.quantity = Math.max(quantity, 0);
    }

    /**
     * Get product
     * @return the product object of the invoice line item.
     */
    public Product getProduct() {
        return product;
    }

    /**
     * Set product
     * @param product item of type Product for the invoice line item.
     */
    public void setProduct(Product product) {
        this.product = product;
    }

    /**
     * Get quantity
     * @return quantity of the product being added to the invoice line item.
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Set quantity
     * @param quantity quantity of the item being added to the invoice line item.
     */
    public void setQuantity(int quantity) {
        if(quantity >= 0){
            this.quantity = quantity;
        }
    }

    /**
     * Get item total
     * @return total price for the invoice line item. Quantity * price of product.
     */
    public double getItemTotal() {
        double price = this.product.getPrice();
        int quantity = this.quantity;
        return(price * quantity);
    }
}

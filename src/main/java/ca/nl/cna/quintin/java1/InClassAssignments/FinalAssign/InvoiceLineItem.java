package ca.nl.cna.quintin.java1.InClassAssignments.FinalAssign;

/**
 * Class representing a line item on an invoice.
 *
 * @author quintin.tuck
 */
public class InvoiceLineItem {

    private final Billable item;
    private final int quantity;

    /**
     * Constructor for the InvoiceLineItem.
     * @param item Billable item (product or service).
     * @param quantity quantity of the item being sold on the invoice. Must be greater than 0 or is set to 1.
     */
    public InvoiceLineItem(Billable item, int quantity) {
        this.item = item;
        if(quantity > 0) {
            this.quantity = quantity;
        } else {
            this.quantity = 1;
        }
    }

    /**
     * getItem.
     * @return The billable item for the InvoiceItem.
     */
    public Billable getItem() {
        return item;
    }

    /**
     * getQuantity.
     * @return Quantity of the item being sold on the invoice.
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * calculatePrice. Calculates the total price for this line item.
     * @return Price. The quantity being sold multiplied by the unit price for that item.
     */
    public double calculatePrice(){
        return(this.getQuantity() * this.getItem().getPrice());
    }


}

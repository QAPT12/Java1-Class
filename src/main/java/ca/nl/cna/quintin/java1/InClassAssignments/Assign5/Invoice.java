package ca.nl.cna.quintin.java1.InClassAssignments.Assign5;

/**
 * Class representing a simple invoice system
 *
 * @author quintin.tuck
 */
public class Invoice {

    private final InvoiceItem[] invoiceLineItemsArray = new InvoiceItem[50];
    private int LineItemsCounter = 0;

    /**
     * Get invoice line items array.
     * @return invoice line items array. An array containing all line items of type InvoiceItem contained on the invoice.
     */
    public InvoiceItem[] getInvoiceLineItemsArray() {
        return invoiceLineItemsArray;
    }

    /**
     * Get line items counter
     * @return line items counter. The count of how many line items are on the invoice.
     */
    public int getLineItemsCounter() {
        return this.LineItemsCounter;
    }

    /**
     * Get invoice total
     * @return invoice total, total price of all the invoice line items on the invoice.
     */
    public double getInvoiceTotal(){
        double invoiceTotal = 0;
        for (int i = 0; i < this.LineItemsCounter; i++) {
            invoiceTotal += invoiceLineItemsArray[i].getItemTotal();
        }
        return invoiceTotal;
    }

    /**
     * Add invoice line item
     * @param invoiceItem item of type InvoiceItem to represent a line on the invoice
     */
    public void addInvoiceLineItem(InvoiceItem invoiceItem){
        this.invoiceLineItemsArray[this.LineItemsCounter] = invoiceItem;
        this.LineItemsCounter += 1;
    }

}

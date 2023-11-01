package ca.nl.cna.quintin.java1.InClassAssignments.Assign5;

public class Invoice {

    private final InvoiceItem[] invoiceLineItemsArray = new InvoiceItem[50];
    private int LineItemsCounter = 0;

    public InvoiceItem[] getInvoiceLineItemsArray() {
        return invoiceLineItemsArray;
    }

    public int getLineItemsCounter() {
        return this.LineItemsCounter;
    }

    public void addInvoiceLineItem(InvoiceItem invoiceItem){
        this.invoiceLineItemsArray[this.LineItemsCounter] = invoiceItem;
        this.LineItemsCounter += 1;
    }

    public double getInvoiceTotal(){
        double invoiceTotal = 0;
        for (int i = 0; i < this.LineItemsCounter; i++) {
            invoiceTotal += invoiceLineItemsArray[i].getItemTotal();
        }
        return invoiceTotal;
    }

}

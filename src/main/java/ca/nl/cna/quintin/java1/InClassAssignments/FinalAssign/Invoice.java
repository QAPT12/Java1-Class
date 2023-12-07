package ca.nl.cna.quintin.java1.InClassAssignments.FinalAssign;

import java.util.ArrayList;

/**
 * Class representing a simple invoice system.
 *
 * @author quintin.tuck
 */
public class Invoice {

    private ArrayList<InvoiceLineItem> InvoiceLineItemArrayList;
    private Customer customer;

    /**
     * calculateTotalPrice. Adds the prices for all the InvoiceLineItems on the invoice to get a total value.
     * @return Total price of all the line items on the invoice.
     */
    public double calculateTotalPrice(){
        return 1; //TODO: fix this so it actually calculates the total
    }

    /**
     * calculateTaxes. Calculates the taxes due on the invoice. Multiplies the Total price of the invoice by tax rate.
     * @return Total amount due in taxes.
     */
    public double calculateTaxes(){
        return(this.calculateTotalPrice() * 0.15);
    }

}

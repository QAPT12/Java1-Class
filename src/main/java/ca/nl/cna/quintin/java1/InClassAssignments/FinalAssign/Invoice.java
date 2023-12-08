package ca.nl.cna.quintin.java1.InClassAssignments.FinalAssign;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 * Class representing a simple invoice system.
 *
 * @author quintin.tuck
 */
public class Invoice {

    private ArrayList<InvoiceLineItem> invoiceLineItemArrayList;
    private final Customer customer;
    private LocalDate dueDate;
    private final String invoiceNumber;

    /**
     * Constructor for an invoice. Takes in a customer and due date for the invoice.
     * @param customer Customer on the invoice.
     * @param invoiceNumber Invoice number for the invoice.
     */
    public Invoice(Customer customer, String invoiceNumber) {
        this.customer = customer;
        this.invoiceNumber = invoiceNumber;
        this.invoiceLineItemArrayList = new ArrayList<InvoiceLineItem>();
    }

    /**
     * getInvoiceItemArrayList.
     * @return The array list containing all the line items on the invoice.
     */
    public ArrayList<InvoiceLineItem> getInvoiceLineItemArrayList() {
        return invoiceLineItemArrayList;
    }

    /**
     * getCustomer.
     * @return The customer information on the invoice.
     */
    public Customer getCustomer() {
        return customer;
    }

    /**
     * getDueDate. Gets the due date of payment for the invoice.
     * @return Payment due date.
     */
    public LocalDate getDueDate() {
        return dueDate;
    }

    /**
     * getInvoiceNumber. Returns the identifying invoice number for the invoice.
     * @return invoice Number
     */
    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    /**
     * calculateDueDate. Calculate and set the due date of the invoice based on ethe payment terms.
     */
    public void calculateDueDate(int paymentTerms) {
        this.dueDate = LocalDate.now().plusDays(paymentTerms);
    }

    /**
     * calculateTotalPrice. Adds the prices for all the InvoiceLineItems on the invoice to get a total value.
     * @return Total price of all the line items on the invoice.
     */
    public double calculateSubTotal(){
        double total = 0.0;
        for (InvoiceLineItem invoiceLineItem: this.invoiceLineItemArrayList) {
            total += invoiceLineItem.calculatePrice();
        }
        return total;
    }

    /**
     * calculateTaxes. Calculates the taxes due on the invoice. Multiplies the Total price of the invoice by tax rate.
     * @return Total amount due in taxes.
     */
    public double calculateTaxes(){
        return (this.calculateSubTotal() * 0.15);
    }

    /**
     * calculateFinalTotal. Calculates the final total for the invoice, subtotal plus taxes.
     * @return the total of all line items with taxes added.
     */
    public double calculateFinalTotal(){
        return (this.calculateSubTotal() + this.calculateTaxes());
    }

    /**
     * addInvoiceLineItem. Adds a new invoice line item to the line items array.
     * @param invoiceLineItem The invoice line item to add to the invoice
     */
    public void addInvoiceLineItem(InvoiceLineItem invoiceLineItem) {
        this.invoiceLineItemArrayList.add(invoiceLineItem);
    }

}

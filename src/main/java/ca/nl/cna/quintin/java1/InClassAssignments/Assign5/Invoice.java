package ca.nl.cna.quintin.java1.InClassAssignments.Assign5;

public class Invoice {

    private InvoiceItem invoiceItem1;
    private InvoiceItem invoiceItem2;
    private InvoiceItem invoiceItem3;

    public InvoiceItem getInvoiceItem1() {
        return invoiceItem1;
    }

    public void setInvoiceItem1(InvoiceItem invoiceItem1) {
        this.invoiceItem1 = invoiceItem1;
    }

    public InvoiceItem getInvoiceItem2() {
        return invoiceItem2;
    }

    public void setInvoiceItem2(InvoiceItem invoiceItem2) {
        this.invoiceItem2 = invoiceItem2;
    }

    public InvoiceItem getInvoiceItem3() {
        return invoiceItem3;
    }

    public void setInvoiceItem3(InvoiceItem invoiceItem3) {
        this.invoiceItem3 = invoiceItem3;
    }

    public double getInvoiceTotal() {
        double invoiceTotal = 0;
        if(this.invoiceItem1 != null){
            invoiceTotal += invoiceItem1.getItemTotal();}
        if(this.invoiceItem2 != null){
            invoiceTotal +=  invoiceItem2.getItemTotal();}
        if(this.invoiceItem3 != null){
            invoiceTotal += invoiceItem3.getItemTotal();}
        return invoiceTotal;
    }
}


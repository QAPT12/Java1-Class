package ca.nl.cna.quintin.java1.InClassAssignments.Assign5;

public class InvoiceTester {

    public static void main(String[] args) {

        Product socks = new Product(1, "a pair of socks", 3.99);
        Product mud = new Product(2, "some mud. not worth much", -2.14);

        System.out.printf("\nProduct id: %d. Description: %s. Price: %.2f",
                socks.getId(),
                socks.getDescription(),
                socks.getPrice());

        System.out.printf("\nProduct id: %d. Description: %s. Price: %.2f\n",
                mud.getId(),
                mud.getDescription(),
                mud.getPrice());

        mud.setPrice(0.99);

        System.out.printf("\nnew price of mud %.2f\n", mud.getPrice());

        InvoiceItem socksLineItem = new InvoiceItem(socks, 3);
        InvoiceItem mudLineItem = new InvoiceItem(mud, 2);

        System.out.printf("\nLine item: %d. Quantity: %d. Total: %.2f",
                socksLineItem.getProduct().getId(),
                socksLineItem.getQuantity(),
                socksLineItem.getItemTotal());

        System.out.printf("\nLine item: %d. Quantity: %d. Total: %.2f\n",
                mudLineItem.getProduct().getId(),
                mudLineItem.getQuantity(),
                mudLineItem.getItemTotal());

        Invoice invoice = new Invoice();

        invoice.setInvoiceItem1(socksLineItem);
        invoice.setInvoiceItem2(mudLineItem);

        System.out.printf("\nInvoice Total = %.2f", invoice.getInvoiceTotal());


    }

}

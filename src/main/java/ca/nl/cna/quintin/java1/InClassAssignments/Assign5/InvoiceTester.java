package ca.nl.cna.quintin.java1.InClassAssignments.Assign5;
/**
 * tester for the classes of the simple invoice system for java assignment 5.
 *
 * @author quintin.tuck
 */
public class InvoiceTester {

    public static void main(String[] args) {

        // create two products to test constructors
        Product socks = new Product(1, "a pair of socks", 3.99);
        Product mud = new Product(2, "some mud. not worth much", -2.14);

        // info for socks
        System.out.println("creating a product socks, price = 3.99");
        System.out.printf("Product id: %d. Description: %s. Price: %.2f\n",
                socks.getId(),
                socks.getDescription(),
                socks.getPrice());

        // info for mud, the price given as negative should be set to 0
        System.out.println("\ncreating a product mud, price = -2.14");
        System.out.printf("Product id: %d. Description: %s. Price: %.2f\n",
                mud.getId(),
                mud.getDescription(),
                mud.getPrice());

        // trying the setter test new price for mud using negative, should give 0.
        System.out.println("\nsetting the price of mud to -0.99");
        mud.setPrice(-0.99);

        System.out.printf("new price of mud %.2f\n", mud.getPrice());

        // trying the setter test new price for mud using positive value.
        System.out.println("\nsetting the price of mud to 0.99");
        mud.setPrice(0.99);

        System.out.printf("new price of mud %.2f\n", mud.getPrice());

        // creating invoice items using the socks and mud Products to test constructors
        InvoiceItem socksLineItem = new InvoiceItem(socks, 3);
        InvoiceItem mudLineItem = new InvoiceItem(mud, 2);

        // print out the information for the socks line item
        System.out.printf("\nLine item: %d. Quantity: %d. Total: %.2f",
                socksLineItem.getProduct().getId(),
                socksLineItem.getQuantity(),
                socksLineItem.getItemTotal());

        // print out information for the mud line item
        System.out.printf("\nLine item: %d. Quantity: %d. Total: %.2f\n",
                mudLineItem.getProduct().getId(),
                mudLineItem.getQuantity(),
                mudLineItem.getItemTotal());

        // create new Invoice item
        Invoice invoice = new Invoice();

        // add the InvoiceItems for mud and socks to the invoice object.
        invoice.addInvoiceLineItem(socksLineItem);
        invoice.addInvoiceLineItem(mudLineItem);

        // get the total price for all the InvoiceItems on the invoice
        System.out.printf("\nInvoice total: %.2f", invoice.getInvoiceTotal());


    }

}

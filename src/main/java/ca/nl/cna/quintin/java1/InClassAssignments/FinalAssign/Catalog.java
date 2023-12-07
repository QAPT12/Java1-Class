package ca.nl.cna.quintin.java1.InClassAssignments.FinalAssign;

import java.util.ArrayList;

/**
 * Simple class to use as a catalog for the invoice system.
 *
 * @author quintin.tuck
 */
public class Catalog {

    ArrayList<Billable> productsArrayList;

    public Catalog(ArrayList<Billable> productsArrayList) {
        this.productsArrayList = productsArrayList;
        this.buildProductsList();
    }

    /**
     * gertProductArrayList.
     * @return The array of Products in the catalog.
     */
    public ArrayList<Billable> getProductsArrayList() {
        return productsArrayList;
    }

    /**
     * Find a product using the product id.
     * @param id product id for the item to find.
     * @return the product if found, otherwise return null.
     */
    public Billable getProduct(String id){
        for (Billable item: productsArrayList) {
            if(item.getId() == id){
                return item;
            }
        }
        return null;
    }

    /**
     * Builds up the product list. Hardcode way to store the list of product to use in the catalog.
     */
    public void buildProductsList(){
        productsArrayList.add(new Product("CP001", "Intel Pentium III Processor", 120));
        productsArrayList.add(new Product("MB002", "ASUS P3B Motherboard", 150));
        productsArrayList.add(new Product("HD003", "Seagate Barracuda 20GB HDD", 100));
        productsArrayList.add(new Product("RM004", "Kingston ValueRAM 128MB SDRAM",30 ));
        productsArrayList.add(new Product("VC005", "ATI Rage 128 Pro Graphics Card", 70));
        productsArrayList.add(new Product("CD006", "Sony CD-RW Drive", 45));
        productsArrayList.add(new Product("PS007", "Generic 350W Power Supply", 35));
        productsArrayList.add(new Product("CS008", "Creative Sound Blaster Live! Sound Card", 50));
        productsArrayList.add(new Product("MN009", "Dell 17-inch CRT Monitor", 80));
        productsArrayList.add(new Product("KY010", "Logitech PS/2 Keyboard", 20));
        productsArrayList.add(new Product("MS011", "Microsoft Intellimouse", 15));
        productsArrayList.add(new Product("FN012", "Case Fan 80mm", 10));
        productsArrayList.add(new Product("FN013", "Large metal case", 70));
        productsArrayList.add(new Service(Service.Services.ASSEMBLE));
        productsArrayList.add(new Service(Service.Services.DEFRAG));
        productsArrayList.add(new Service(Service.Services.REPAIR));

    }

}

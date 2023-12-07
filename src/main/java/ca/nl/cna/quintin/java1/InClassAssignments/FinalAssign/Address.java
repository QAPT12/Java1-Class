package ca.nl.cna.quintin.java1.InClassAssignments.FinalAssign;

/**
 * Class to represent a customers address. For use in a simple invoice system.
 *
 * @author quintin.tuck
 */
public class Address {

    private final String province;
    private final String city;
    private final String street;
    private final String number;
    private final String postal;

    /**
     * Constructor for address. Takes province, city, street, house building num, and postal.
     * @param province Province for the address.
     * @param city City for the address.
     * @param street Street name for the address.
     * @param number Building number for the address.
     * @param postal Postal code for the address.
     */
    public Address(String province, String city, String street, String number, String postal) {
        this.province = province;
        this.city = city;
        this.street = street;
        this.number = number;
        this.postal = postal;
    }

    /**
     * getProvince. Gets the province of the address.
     * @return  Province.
     */
    public String getProvince() {
        return province;
    }

    /**
     * getCity. Gets the city for the adress.
     * @return City.
     */
    public String getCity() {
        return city;
    }

    /**
     * getStreet. Gets the street name for the address.
     * @return Street name.
     */
    public String getStreet() {
        return street;
    }

    /**
     * getNumber. Gets the building number for the address.
     * @return Building number.
     */
    public String getNumber() {
        return number;
    }

    /**
     * getPostal. Returns the postal code for the address.
     * @return Postal code.
     */
    public String getPostal() {
        return postal;
    }


}

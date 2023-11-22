package ca.nl.cna.quintin.java1.InClassAssignments.SystemsAnalysisAssign5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for Josh's Account class.
 *
 * @author quintin.tuck
 */
class AccountTest {

    /**
     * getName. Test to make sure get name method works.
     */
    @Test
    void getName() {
        String name = "Josh";

        Account account = new Account(name, 10000);

        assertEquals(name, account.getName());
    }

    /**
     * setName. Test to make sure the set name method works.
     */
    @Test
    void setName() {
        String newName = "Stacks";

        Account account = new Account("Josh", 10000);
        account.setName(newName);

        assertEquals(newName, account.getName());
    }

    /**
     * getBalance. Test to make sure the get balance method works.
     */
    @Test
    void getBalance() {
        double balance = 10000;

        Account account = new Account("josh", balance);

        assertEquals(balance, account.getBalance());
    }

    /**
     * negativeAccountCreation. Tests creating an account with a negative balance to make sure it is handled and set to 0.
     */
    @Test
    void negativeAccountCreation() {
        Account account = new Account("Josh", -12);

        assertEquals(0.0, account.getBalance());
    }

}
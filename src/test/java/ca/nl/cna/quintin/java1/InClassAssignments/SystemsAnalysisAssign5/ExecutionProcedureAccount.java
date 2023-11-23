package ca.nl.cna.quintin.java1.InClassAssignments.SystemsAnalysisAssign5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Class to test debiting and crediting Account class.
 */
public class ExecutionProcedureAccount {

    /**
     * creditNegative. Credits a negative amount to make sure the balance is not changed.
     */
    @Test
    public void creditNegative() {
        Account account = new Account("Josh Taylor", 50);
        account.credit(-10);
        assertEquals(50, account.getBalance());
    }

    /**
     * creditPositive. Credits a positive amount to make sure the balance is changed correctly.
     */
    @Test
    public void creditPositive() {
        Account account = new Account("Josh Taylor", 50);
        account.credit(10);
        assertEquals(60, account.getBalance());
    }

    /**
     * debitNegative. Debits a negative to make sure the balance is not changed.
     */
    @Test
    public void debitNegative() {
        Account account = new Account("Josh Taylor", 50);
        account.debit(-10);
        assertEquals(50, account.getBalance());
    }

    /**
     * debitMore. Debits an amount greater than the value in the account to make sure the balance isnt changed.
     */
    @Test
    public void debitMore() {
        Account account = new Account("Josh Taylor", 50);
        account.debit(100);
        assertEquals(50, account.getBalance());
    }

    /**
     * debitLess. Debits an amount from the account and make sure the balance is changed correctly.
     */
    @Test
    public void debitLess() {
        Account account = new Account("Josh Taylor", 50);
        account.debit(30);
        assertEquals(20, account.getBalance());
    }

    /**
     * correctBalance. Check to make sure the balance is set back to its original.
     */
    @Test
    public void correctBalance() {
        Account account = new Account("Josh Taylor", 50);
        assertEquals(50, account.getBalance());
    }

}
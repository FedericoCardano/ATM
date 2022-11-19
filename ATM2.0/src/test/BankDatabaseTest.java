package test;

import org.junit.Test;
import org.junit.Assert;
import org.junit.Before;
import code.Business_logic.Euro;

import code.Database.BankDatabase;

public class BankDatabaseTest {
    BankDatabase bankDatabase;
    @Before
    public void setUp() {
        bankDatabase = new BankDatabase();
    }

    @Test
    public void testAuthenticateUser() {
        Assert.assertTrue(bankDatabase.authenticateUser(12345, 54321));
    }

    @Test
    public void testCredit() {
        bankDatabase.credit(12345, new Euro(108));
        Assert.assertEquals(130800, bankDatabase.getTotalBalance(12345).getValore());
    }

    @Test
    public void testDebit() {
        bankDatabase.debit(12345, new Euro(456.78));
        Assert.assertEquals(54322, bankDatabase.getAvailableBalance(12345).getValore());
    }

    @Test
    public void testGetAvailableBalance() {
        Assert.assertEquals(20000, bankDatabase.getAvailableBalance(98765).getValore());
    }

    @Test
    public void testGetTotalBalance() {
        Assert.assertEquals(20000, bankDatabase.getTotalBalance(98765).getValore());
    }
}
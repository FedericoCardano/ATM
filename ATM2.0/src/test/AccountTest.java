package test;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import code.Business_logic.Account;
import code.Business_logic.Euro;

public class AccountTest {



    @Test
    void testCredit() {
        Account a = new Account(  25250,  05252, new Euro(1200), new Euro(1200) );
        a.credit( new Euro(1200));
        Assert.assertEquals(new Euro(2400).valore, a.getTotalBalance().valore);
    }

    @Test
    void testDebit() {
        Account a = new Account(  25250,  05252, new Euro(1200), new Euro(1200) );
        a.debit( new Euro(200));
        Assert.assertEquals(new Euro(1000).valore, a.getAvailableBalance().valore);
        Assert.assertEquals(new Euro(1000).valore, a.getTotalBalance().valore);
    }

    @Test
    void testGetAccountNumber() {
        Account a = new Account(  25250,  05252, new Euro(1200), new Euro(1200) );
        Assert.assertEquals(25250,a.getAccountNumber());
    }

    @Test
    void testGetAvailableBalance() {
        Account a = new Account(  25250,  05252, new Euro(1200), new Euro(1200) );
        Assert.assertEquals(new Euro(1200).valore,a.getAvailableBalance().valore);
    }

    @Test
    void testGetTotalBalance() {
        Account a = new Account(  25250,  05252, new Euro(1200), new Euro(1200) );
        Assert.assertEquals(new Euro(1200).valore,a.getTotalBalance().valore);
    }

    @Test
    void testValidatePIN() {
        Account a = new Account(  25250,  05252, new Euro(1200), new Euro(1200) );
        Assert.assertTrue(a.validatePIN(05252));
    }
}

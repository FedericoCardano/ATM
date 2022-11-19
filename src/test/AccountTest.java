package test;

import org.junit.jupiter.api.Test;

import code.Business_logic.Account;
import code.Business_logic.Euro;

public class AccountTest {



    @Test
    void testCredit() {
        Account a = new Account(  25250,  05252, new Euro(1200), new Euro(1200) );
    
    }

    @Test
    void testDebit() {

    }

    @Test
    void testGetAccountNumber() {

    }

    @Test
    void testGetAvailableBalance() {

    }

    @Test
    void testGetTotalBalance() {

    }

    @Test
    void testValidatePIN() {

    }
}

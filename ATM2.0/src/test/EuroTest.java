package test;

import org.junit.Assert;
import org.junit.Test;

import code.Business_logic.Euro;

public class EuroTest {
    @Test
    public void testGetValore() {
        Euro myEuro = new Euro(1, 33);
        Assert.assertEquals(133, myEuro.getValore());
    }

    @Test
    public void testMinoreDi() {
        Euro myEuro = new Euro(1, 33);
        Euro myEuro2 = new Euro(5, 38);
        Assert.assertTrue(myEuro.minoreDi(myEuro2));
    }

    @Test
    public void testSomma() {
        Euro myEuro = new Euro(9, 55);
        Euro myEuro2 = new Euro(5, 38);
        myEuro.somma(myEuro2);
        Assert.assertEquals(1493, myEuro.getValore());
        }

    @Test
    public void testSottrai() {
        Euro myEuro = new Euro(50, 00);
        Euro myEuro2 = new Euro(7, 99);
        myEuro.sottrai(myEuro2);
        Assert.assertEquals(4201, myEuro.getValore());
        }

    @Test
    public void testStampa() {
        Euro myEuro = new Euro(50, 00);
        Assert.assertEquals("50.0 euro", myEuro.stampa());
    }

    @Test
    public void testUgualeA() {
        Euro myEuro = new Euro(50, 00);
        Euro myEuro2 = new Euro(50, 00);
        Assert.assertTrue(myEuro.ugualeA(myEuro2));

    }
}
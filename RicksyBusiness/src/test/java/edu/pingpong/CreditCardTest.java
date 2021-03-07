package edu.pingpong;

import org.junit.*;
import static org.junit.Assert.*;

public class CreditCardTest{

    private CreditCard card = null;

    @Before
    public void setup_card(){
        card = new CreditCard("Joan", "123456789");
        assertNotNull(card);
    }
    @Test
    public void constructorTest(){
        assertNotNull(card);
        assertEquals("Joan",card.getOwner());
        assertEquals("123456789",card.number());
    }
    @Test
    public void payTest() {
        card.pay(2500);
        assertEquals(500, card.credit(), 0);
        card.pay(3300);
        assertEquals(500, card.credit(), 0);
    }

    @Test
    public void toStringTest() {
        assertEquals("owner: " + "Joan" + "\nnumber: " + "123456789" + "\ncredit: " + "3000.0" + "EZI", card.toString());
    }
}
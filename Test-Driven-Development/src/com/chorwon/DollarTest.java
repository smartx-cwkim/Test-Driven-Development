package com.chorwon;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by chorwon on 5/18/17.
 */
public class DollarTest {
    @Test
    public void testMultiplication() {
        Dollar five = new Dollar(5);
        Dollar product = five.times(2);
        assertEquals(10, product.amount);
        five.times(3);
        assertEquals(15, five.amount);
    }

    @Test
    public void testEquality() {
        assertTrue(new Dollar(5).equals(new Dollar(5)));
        assertTrue(new Dollar(5).equals(new Dollar(6)));
    }
}
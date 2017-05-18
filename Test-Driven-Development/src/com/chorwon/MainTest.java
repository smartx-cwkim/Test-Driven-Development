package com.chorwon;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by chorwon on 5/18/17.
 */
public class MainTest {
    @Test
    public void testMultiplication() {
        Dollar five = new Dollar(5);
        five.times(2);
        assertEquals(10, five.amount);
    }
}

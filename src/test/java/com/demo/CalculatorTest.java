package com.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void testAddition() {
        assertEquals(30, calculator.add(10, 20));
    }

    @Test
    public void testSubtraction() {
        assertEquals(10, calculator.subtract(20, 10));
    }

    @Test
    public void testMultiplication() {
        assertEquals(200, calculator.multiply(10, 20));
    }

    @Test
    public void testDivision() {
        assertEquals(5, calculator.divide(20, 4));
    }

    @Test
    public void testDivideByZero() {
        assertThrows(
            IllegalArgumentException.class,
            () -> calculator.divide(10, 0)
        );
    }
}

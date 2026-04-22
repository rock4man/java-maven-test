package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

	 Calculator cal=new Calculator();
    @Test
    public void testAdd() {
        int result = cal.add(2, 3);
        assertEquals(5, result);
    }
    @Test
    public void testSubtract() {
        int result = cal.subtract(5, 2);
        assertEquals(3, result);
    }
    @Test
    public void testMultiply() {
        int result = cal.multiply(4, 5);
        assertEquals(20, result);
    }
    @Test
    public void testDivide() {
        int result = cal.divide(10, 2);
        assertEquals(5, result);
    }
    @Test
    void testDivisionByZero() {
        assertThrows(ArithmeticException.class, () -> {
            cal.divide(10, 0);
        });
}
}

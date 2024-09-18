package dev.silversurge.calculator;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    private static Calculator calculator;

    @BeforeEach
    public static void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testAddition() {
        assertEquals(5.0, calculator.add(2.0, 3.0));
        assertEquals(-1.0, calculator.add(-2.0, 1.0));
    }

    @Test
    public void testSubtraction() {
        assertEquals(1.0, calculator.subtract(3.0, 2.0));
        assertEquals(-3.0, calculator.subtract(-2.0, 1.0));
    }

    @Test
    public void testMultiplication() {
        assertEquals(6.0, calculator.multiply(2.0, 3.0));
        assertEquals(-2.0, calculator.multiply(-2.0, 1.0));
    }

    @Test
    public void testDivision() {
        assertEquals(2.0, calculator.divide(6.0, 3.0));
        assertThrows(ArithmeticException.class, () -> calculator.divide(5.0, 0.0));
    }

    @Test
    public void testSquareRoot() {
        assertEquals(4.0, calculator.squareRoot(16.0));
        assertThrows(ArithmeticException.class, () -> calculator.squareRoot(-1.0));
    }

    @Test
    public void testFactorial() {
        assertEquals(120L, calculator.factorial(5));
        assertEquals(1L, calculator.factorial(0));
        assertThrows(ArithmeticException.class, () -> calculator.factorial(-1));
    }

    @Test
    public void testNaturalLog() {
        assertEquals(Math.log(10), calculator.naturalLog(10.0));
        assertThrows(ArithmeticException.class, () -> calculator.naturalLog(-1.0));
    }

    @Test
    public void testPower() {
        assertEquals(8.0, calculator.power(2.0, 3.0));
        assertEquals(1.0, calculator.power(5.0, 0.0));
    }
}

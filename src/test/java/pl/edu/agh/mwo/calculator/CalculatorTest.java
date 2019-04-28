package pl.edu.agh.mwo.calculator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class CalculatorTest {
    /**
     * Rigorous Test :-)
     */

    @Test
    public void createNewCalc() {
        Calculator calculator = new Calculator();
    }

    @Test
    public void additionTest() {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.addition(2, 3));
    }

    @Test
    public void subtractTest() {
        Calculator calculator = new Calculator();
        assertEquals(4, calculator.subtract(6, 2));
    }

    @Test
    public void multiplyTest() {
        Calculator calculator = new Calculator();
        assertEquals(4, calculator.multiply(2, 2));
    }

    @Test
    public void divideTest() {
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.divide(4, 2));
    }

    @Test
    public void avgTest() {
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.avg(2, 2));
    }

}

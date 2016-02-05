import static org.junit.Assert.*;

import org.junit.Test;

/**
 * This is a test class that tests the methods in ComplexNumber.java
 *
 * @author Astrid Manuel
 * @see ComplexNumber.java
 */
public class ComplexNumberTest {

    @Test
    public void add_ValidComplexNumbers_ResultIsValid() {
        ComplexNumber a = new ComplexNumber(1, 1);
        ComplexNumber b = new ComplexNumber(1, 1);
        ComplexNumber result = a.add(b);
        assertTrue(result.getA() == 2 && result.getB() == 2);
    }

    @Test
    public void subtract_ValidComplexNumbers_ResultIsValid() {
        ComplexNumber a = new ComplexNumber(1, 1);
        ComplexNumber b = new ComplexNumber(1, 1);
        ComplexNumber result = a.subtract(b);
        assertTrue(result.getA() == 0 && result.getB() == 0);
    }

    @Test
    public void multiply_ValidComplexNumbers_ResultIsValid() {
        ComplexNumber a = new ComplexNumber(1, 1);
        ComplexNumber b = new ComplexNumber(1, 1);
        ComplexNumber result = a.multiply(b);
        assertTrue(result.getA() == 0 && result.getB() == 2);
    }

    @Test
    public void divide_ValidComplexNumbers_ResultIsValid() {
        ComplexNumber a = new ComplexNumber(1, 1);
        ComplexNumber b = new ComplexNumber(1, 1);
        ComplexNumber result = a.divide(b);
        assertTrue(result.getA() == 0 && result.getB() == 2);
    }

    @Test
    public void equals_ValidComplexNumbers_ResultIsValid() {
        ComplexNumber a = new ComplexNumber(1, 1);
        ComplexNumber b = new ComplexNumber(1, 1);
        boolean result = a.equals(b);
        assertTrue(result);
    }

    @Test
    public void toString_ValidComplexNumbers_ResultIsValid() {
        ComplexNumber a = new ComplexNumber(1, 2);
        String result = a.toString();
        assertTrue(result.equals("1 + 2i"));
    }
}
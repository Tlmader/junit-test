import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

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
		
		float actualA = result.getA();
		float actualB = result.getB();
		float expectedA = 2;
		float expectedB = 2;
		
        assertEquals(actualA, expectedA, 0);
        assertEquals(actualB, expectedB, 0);
    }

    @Test
    public void subtract_ValidComplexNumbers_ResultIsValid() {
		
        ComplexNumber a = new ComplexNumber(1, 1);
        ComplexNumber b = new ComplexNumber(1, 1);
        ComplexNumber result = a.subtract(b);
		
		float actualA = result.getA();
		float actualB = result.getB();
		float expectedA = 0;
		float expectedB = 0;
		
        assertEquals(actualA, expectedA, 0);
        assertEquals(actualB, expectedB, 0);
    }

    @Test
    public void multiply_ValidComplexNumbers_ResultIsValid() {
		
        ComplexNumber a = new ComplexNumber(1, 1);
        ComplexNumber b = new ComplexNumber(1, 1);
        ComplexNumber result = a.multiply(b);
		
		float actualA = result.getA();
		float actualB = result.getB();
		float expectedA = 0;
		float expectedB = 2;
		
        assertEquals(actualA, expectedA, 0);
        assertEquals(actualB, expectedB, 0);
    }

    @Test
    public void divide_ValidComplexNumbers_ResultIsValid() {
		
        ComplexNumber a = new ComplexNumber(1, 1);
        ComplexNumber b = new ComplexNumber(1, 1);
        ComplexNumber result = a.divide(b);
		
		float actualA = result.getA();
		float actualB = result.getB();
		float expectedA = 1;
		float expectedB = 0;
		
        assertEquals(actualA, expectedA, 0);
        assertEquals(actualB, expectedB, 0);
    }

    @Test
    public void equals_ValidComplexNumbers_ResultIsValid() {
		
        ComplexNumber a = new ComplexNumber(1, 1);
        ComplexNumber b = new ComplexNumber(1, 1);
		
        boolean condition = a.equals(b);
		
        assertTrue(condition);
    }

    @Test
    public void toString_ValidComplexNumbers_ResultIsValid() {
		
        ComplexNumber a = new ComplexNumber(1, 2);
		
        String actual = a.toString();
		String expected = "1 + 2i";
		
        assertEquals	(actual, expected);
    }
}
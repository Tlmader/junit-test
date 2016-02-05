import java.lang.Math;

/**
 * This class creates a complex number object and contains methods for adding, subtracting,
 * multiplying, and dividing complex numbers. It also contains an equals method for the
 * comparison of complex numbers and a toString method to present the complex number in the
 * appropriate a + bi form.
 *
 * @author Astrid Manuel
 * @see ComplexNumberTest.java, Main.java
 */
public class ComplexNumber {

    //Decleration of a and b -- the real parts of a complex numbers
    private float a;
    private float b;

    //get methods for a and b
    public float getA() {
        return a;
    }

    public float getB() {
        return b;
    }

    //Constructor for the complex number object
    public ComplexNumber(float _a, float _b) {
        this.a = _a;
        this.b = _b;
    }

    /**
     * This method adds two complex numbers together.
     *
     * @param otherNumber the second complex number
     * @return the calculated complex number after the addition of both complex numbers
     */
    public ComplexNumber add(ComplexNumber otherNumber) {
        ComplexNumber newComplex;
        float newA = a + otherNumber.getA();
        float newB = b + otherNumber.getB();
        newComplex = new ComplexNumber(newA, newB);
        return newComplex;
    }

    /**
     * This method subtracts two complex numbers.
     *
     * @param otherNumber the second complex number, which is going to be subtracted from the first complex number
     * @return the calculated complex number after the subtraction of both complex numbers
     */
    public ComplexNumber subtract(ComplexNumber otherNumber) {
        ComplexNumber newComplex;
        float newA = a - otherNumber.getA();
        float newB = b - otherNumber.getB();
        newComplex = new ComplexNumber(newA, newB);
        return newComplex;
    }

    /**
     * This method multiplies two complex numbers together.
     *
     * @param otherNumber the second complex number, which is going to be multiplied with the first complex number
     * @return the calculated complex number after the multiplication of both complex numbers
     */
    public ComplexNumber multiply(ComplexNumber otherNumber) {
        ComplexNumber newComplex;
        float newA = (a * otherNumber.getA()) - (b * otherNumber.getB());
        float newB = (b * otherNumber.getA()) + (a * otherNumber.getB());
        newComplex = new ComplexNumber(newA, newB);
        return newComplex;
    }

    /**
     * This method divides two complex numbers.
     *
     * @param otherNumber the second complex number, which is going to be divided from the first complex number
     * @return the calculated complex number after the division of both complex numbers
     */
    public ComplexNumber divide(ComplexNumber otherNumber) {
        ComplexNumber newComplex;
        double d1 = (((a * otherNumber.getA()) + (b * otherNumber.getB())) / ((Math.pow(otherNumber.getA(), 2)) + (Math.pow(otherNumber.getB(), 2))));
        double d2 = (((b * otherNumber.getA()) - (a * otherNumber.getB())) / ((Math.pow(otherNumber.getA(), 2)) + (Math.pow(otherNumber.getB(), 2))));
        float newA = (float) d1;
        float newB = (float) d2;
        newComplex = new ComplexNumber(newA, newB);
        return newComplex;
    }

    /**
     * This method checks if two complex numbers are equal to each otherNumber
     *
     * @param otherNumber the second complex number that is being compared against the first complex number
     * @return a boolean that tells you whether or not the complex numbers are equal to each other.
     */
    public boolean equals(ComplexNumber otherNumber) {
        boolean isEqual = false;
        if (a == otherNumber.getA() && b == otherNumber.getB())
            isEqual = true;
        return isEqual;
    }


    /**
     * This method creates a String for the complex number that shows it in the form of a + bi
     *
     * @param none
     * @return a String that shows the complex number in the form of a + bi
     */
    public String toString() {
        return format(a) + " + " + format(b) + "i";
    }
	
	private String format(float d) {
		if (d == (long) d)
			return String.format("%d",(long)d);
		else
			return String.format("%s",d);
	}
}
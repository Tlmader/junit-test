import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        float a1 = 1;
        float a2 = 1;
        float b1 = 1;
        float b2 = 1;
        boolean calculatorOn = true;

        System.out.println("Hello! This is a complex number calculator. \nComplex numbers are written in the form a + bi, where i is the square root of -1. \nThis calculator can add, subtract, multiply or divide complex numbers for you.");
        System.out.println("What would you like to do?");
        System.out.println("1) add \n 2) subtract \n 3) multiply \n 4) substract\n 5) exit");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        System.out.println("Input complex number 1, a: ");
        Scanner scanner1 = new Scanner(System.in);
        a1 = scanner1.nextFloat();

        System.out.println("Input complex number 1, b: ");
        Scanner scanner2 = new Scanner(System.in);
        b1 = scanner2.nextFloat();

        System.out.println("Input complex number 2, a: ");
        Scanner scanner3 = new Scanner(System.in);
        a2 = scanner3.nextFloat();

        System.out.println("Input complex number 2, b: ");
        Scanner scanner4 = new Scanner(System.in);
        b2 = scanner4.nextFloat();

        ComplexNumber complexNumber1 = new ComplexNumber(a1, b1);
        ComplexNumber complexNumber2 = new ComplexNumber(a2, b2);
        ComplexNumber result = new ComplexNumber(0, 0);

        if (choice == 1) {
            result = complexNumber1.add(complexNumber2);
            System.out.printf("\nAnswer: " + result);
        } else if (choice == 2) {
            result = complexNumber1.subtract(complexNumber2);
            System.out.println("\nAnswer: " + result);
        } else if (choice == 3) {
            result = complexNumber1.multiply(complexNumber2);
            System.out.println("\nAnswer: " + result);
        } else if (choice == 4) {
            result = complexNumber1.divide(complexNumber2);
            System.out.println("\nAnswer: " + result);
        } else if (choice == 5) {
            calculatorOn = false;
            System.exit(0);
        } else {
            System.out.println("I am sorry, that is not a valid choice.");
        }
    }
}
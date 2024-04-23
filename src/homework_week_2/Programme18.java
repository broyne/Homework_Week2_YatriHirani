package homework_week_2;

import java.util.Scanner;

public class Programme18 {
    /**
     * Write a Java program to print the sum (addition), multiply, subtract, divide and
     * remainder of two numbers.
     * Test Data:
     * Input first number: 125
     * Input second number: 24
     * Expected Output :
     * 125 + 24 = 149
     * 125 - 24 = 101
     * 125 x 24 = 3000
     * 125 / 24 = 5
     * 125 mod 24 = 5
     */

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter first digit 125 and press enter:");
        int a = obj.nextInt();
        System.out.println("Enter Secong digit 24 and press enter:");
        int b = obj.nextInt();
        tonum(a, b);
    }

    public static void tonum(int a, int b) {
        int addition = a + b;
        int subtraction = a - b;
        int division = a / b;
        int multiplication = a * b;
        int mod = a % b;

        System.out.println("The Addition of 125 and 24 is: " + addition);
        System.out.println("The Subtraction of 125 and 24 is: " + subtraction);
        System.out.println("The Division of 125 and 24 is: " + division);
        System.out.println("The multiplication of 125 and 24 is: " + multiplication);
        System.out.println("The Addition of 125 and 24 is: " + mod);

    }


}

package homework_week_2;

import java.util.Scanner;

public class Programme17 {
    /**
     * Write a Java program to convert a decimal number to binary number.
     * Input Data:
     * Input a Decimal Number : 5
     * Expected Output
     * Binary number is: 101
     */
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter deciaml value and press Enter");
        int a = obj.nextInt();
        decimal(a);
    }

    public static void decimal(int a) {
        int decimalNumber = a;
        String binary = Integer.toBinaryString(decimalNumber);
        System.out.println("The result of convert a decimal number to binary number is: " + binary);
    }
}

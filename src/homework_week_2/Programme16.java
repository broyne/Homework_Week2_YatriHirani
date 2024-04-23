package homework_week_2;

import java.util.Scanner;

public class Programme16 {
    /**
     * Write a Java program to add two binary numbers.
     * Input Data:
     * Input first binary number: 10
     * Input second binary number: 11
     * Expected Output:
     * Sum of two binary numbers: 101
     */
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter first input and press enter:");
        String x = obj.nextLine();
        System.out.println("Enter Second input and press enter:");
        String y = obj.nextLine();
        binary(x, y);
    }

    public static void binary(String x, String y) {
        int num1 = Integer.parseInt(x, 2); //Converting  binary String into integer (Decimal number)
        int num2 = Integer.parseInt(y, 2); //Converting  binary String into integer (Decimal number)
        int sum = num1 + num2;
        String result = Integer.toBinaryString(sum); //Converting that result decimal into binary value
        System.out.println("Sum of two binary number is:" + result);
    }
}

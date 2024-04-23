package homework_week_2;

import java.util.Scanner;

public class Programme13 {
    /**
     * Write a Java program that takes three numbers as input to calculate and
     * print the average of the numbers.
     */
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter first digit and enter");
        double a = obj.nextInt();
        System.out.println("Enter second digit and enter");
        double b = obj.nextInt();
        System.out.println("Enter third digit and enter");
        double c = obj.nextInt();
        average(a, b, c);
    }

    public static void average(double a, double b, double c) {
        double ans = a + b + c;
        System.out.println("Average is:" + ans / 3);
    }
}

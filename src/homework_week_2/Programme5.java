package homework_week_2;

import java.util.Scanner;

public class Programme5 {
    /**
     * Write a program for a calculator with addition, subtraction, multiplication and division methods all with parameters and use string concatenation
     * methods.(Note: Two static and Two instance methods.)
     */

    public static void main(String[] args) {
        Programme5 object = new Programme5();
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter value of A");
        int a = obj.nextInt();
        System.out.println("Enter value of B");
        int b = obj.nextInt();
        object.addition(a, b);
        object.substraction(a, b);
        multipication(a, b);
        division(a, b);
        System.out.println();
    }

    public void addition(int a, int b) {
        int add = a + b;
        System.out.println("Sum of " + a + " and " + b + " is: " + add);
    }

    public void substraction(int a, int b) {
        int sub = a - b;
        System.out.println("Substraction of " + a + " and " + b + " is: " + sub);
    }


    public static void multipication(int a, int b) {
        int multi = a * b;
        System.out.println("Multipication of " + a + " and " + b + " is: " + multi);
    }

    public static void division(int a, int b) {
        int div = a / b;
        System.out.println("Division of " + a + " and " + b + " is: " + div);
    }


}

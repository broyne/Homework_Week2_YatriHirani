package homework_week_2;

import java.util.Scanner;

public class Programme15 {
    /**
     * Write a Java program to swap two variables.
     */
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the first value: ");
        int a = obj.nextInt();
        System.out.println("Enter the Second value: ");
        int b = obj.nextInt();
        swap(a, b);
    }

    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping the result is: " + a);
        System.out.println("After swapping the result is: " + b);
    }
}

package homework_week_2;

import java.util.Scanner;

public class Programme7 {

    /**
     * Write a program to insert any temperature value in degree Fahrenheit and convert to degree Celsius ((F − 32) × 5/9 = 0°C).
     */

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter Temperature value");
        double t = obj.nextDouble();
        temperature(t);
    }

    public static void temperature(double value) {

        double answer = ((value - 32) * 5 / 9);
        System.out.println("value is:" + answer);
    }

}

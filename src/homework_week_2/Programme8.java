package homework_week_2;

import java.util.Scanner;

/**
 * Write a program to calculate the area of a triangle.
 * Area = (b * h) / 2
 */
public class Programme8 {
    /**
     * Write a program to calculate the area of a triangle
     */
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter value of Base: ");
        double base = obj.nextDouble();
        System.out.println("Enter value of Height: ");
        double height = obj.nextDouble();
        areaofTriangle(base, height);
    }

    public static void areaofTriangle(double base, double height) {
        double area = base * height / 2;
        System.out.println("Area of triangle is: " + area);
    }


}

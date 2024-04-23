package homework_week_2;

import java.util.Scanner;

public class Programme14 {
    /**
     * Write a Java program to print the area and perimeter of a rectangle.
     * Test Data:
     * Width = 5.6 Height = 8.5
     * Expected Output:
     * Area is 5.6 * 8.5 = 47.60
     * Perimeter is 2 * (5.6 + 8.5) = 28.20
     */
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter First value 5.6 and press enter: ");
        float area = obj.nextFloat();
        System.out.println("Enter First value 8.5 and press enter: ");
        float perimeter = obj.nextFloat();
        perimeter(area, perimeter);
    }

    public static void perimeter(float a, float b) {
        float area = a * b;
        float perimeter = 2 * (a + b);
        System.out.println("Area of rectangle is: " + area);
        System.out.println("Perimeter of rectangle is: " + perimeter);
    }

}

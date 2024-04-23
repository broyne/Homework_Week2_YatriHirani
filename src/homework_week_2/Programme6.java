package homework_week_2;

import java.util.Scanner;

public class Programme6 {
    /**
     * Write a program to enter any radius value of the circle and find out the area.(Formula of Area A=PI*r*r).
     */

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        System.out.println("enter value of radius = ");
        double r = obj.nextDouble();
        findarea(r);
    }

    public static void findarea(double r) {
        double pi = 3.14;
        double area = r * r * pi;
        System.out.println("The ans is:" + area);


    }
}

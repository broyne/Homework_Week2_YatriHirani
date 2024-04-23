package homework_week_2;

import java.util.Scanner;

public class Programme9 {
    /**
     * Write a program to convert the upper case to lower case.
     */
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the uppercase value");
        String name = obj.nextLine();
        lowercase(name);

    }

    public static void lowercase(String name) {
        String strLowercase = name.toLowerCase();
        System.out.println("Result is in uppercase:" + name.toLowerCase());
    }
}

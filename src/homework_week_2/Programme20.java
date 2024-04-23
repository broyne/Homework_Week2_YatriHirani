package homework_week_2;

import java.util.Scanner;

public class Programme20 {
    /**
     * Write a Java Program to print as below.
     * "+------------------------+"
     * "|                        |"
     * "| CORNER STORE           |"
     * "|                        |"
     * "| 2015-03-29 04:38PM     |"
     * "|                        |"
     * "| Gallons: 10.870 |"
     * "| Price/gallon: $ 2.089 |"
     * "|                        |"
     * "| Fuel total: $ 22.71 |"
     * "| |"
     * "+------------------------+"
     */
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        System.out.println("Enter Store name");
        String storename = obj.nextLine();
        System.out.println("Enter Gallons 10.870:");
        double gallons = obj.nextDouble();
        System.out.println("Enter Price/gallon $2.089:");
        double pgallon = obj.nextDouble();

        print(storename, gallons,pgallon);


    }

    public static void print(String storename, double gallons, double pgallon) {
        double fuel = gallons * pgallon;
        System.out.println("+------------------------+");
        System.out.println("|                        |");
        System.out.println("| " + storename + "           |");
        System.out.println("|                        |");
        System.out.println("| 2015-03-29 04:38PM     |");
        System.out.println("|                        |");
        System.out.println("| Gallons: " + gallons + "         |");
        System.out.println("|                        |");
        System.out.println("| Price/gallon " + pgallon + "     |");
        System.out.println("|                        |");
        System.out.println("| Fuel total: $" + fuel + "  |");
        System.out.println("|                        |");
        System.out.println("+------------------------+");


    }
}

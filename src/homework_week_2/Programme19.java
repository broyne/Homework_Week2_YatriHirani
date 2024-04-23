package homework_week_2;

import java.util.Scanner;

public class Programme19 {
    /**
     * Write a Java program to convert a given string into lowercase.
     * Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
     * Output: the quick brown fox jumps over the lazy dog
     */

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the uppercase value");
        String name = obj.nextLine();
        lowercase1(name);

    }

    public static void lowercase1(String sentence) {
        String x = sentence.toLowerCase();
        System.out.println("Result is in uppercase:" + sentence.toLowerCase());
    }


}

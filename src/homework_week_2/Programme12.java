package homework_week_2;

public class Programme12 {
    /**
     * Write a Java program to compute the specified expressions and print the
     * output.
     * Test Data:
     * ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
     * Expected Output : 2.138888888888889
     */
    public static void main(String[] args) {
        expression(25.5, 3.5, 40.5, 4.5);

    }

    public static void expression(double a, double b, double c, double d) {
        double ans = ((a * b - b * b) / (c - d));
        System.out.println("value is:" + ans);
    }
}

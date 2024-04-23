package homework_week_2;

public class Programme2 {

    /**
     * 2.1 Declare two static variables
     * 2.2 Declare one static method
     * 2.3 Call both static variables into the static method inside the print statement.
     * 2.4 Declare the Main method.
     * 2.5 Call the static method into the Main method and Run the programme.
     */

    static int y = 20;
    static String name = "Yatri Hirani";

    public static void main(String[] args) {
        new Programme2().staticmethod();
    }

    public static void staticmethod() {
        System.out.println(y);
        System.out.println(name);
    }
}

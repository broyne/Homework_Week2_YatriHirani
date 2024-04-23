package homework_week_2;

public class Programme4 {
    /**
     * 4.1 Declare two instance and two static variables.
     * 4.2 Declare one instance method.
     * 4.3 Declare one static method.
     * 4.4 Call all four instance and static variables into both instance and static methods inside the  print statement.
     * 4.5 Declare the Main method.
     * 4.6 Call both instance and static methods into the Main method and run the programme.
     */

    int i = 5;
    String surname = "Hirani";

    static int e = 10;
    static String lastname = "Patel";

    public static void main(String[] args) {
        new Programme4().in_method();
        st_method();
    }

    public void in_method() {
        System.out.println("------------- Below are using Instance Method -----------");
        System.out.println(i);
        System.out.println(surname);
        System.out.println(e);
        System.out.println(lastname);

    }


    public static void st_method() {
        System.out.println("------------- Below are using Static Method -----------");
        Programme4 obj1 = new Programme4();
        System.out.println(obj1.i);
        System.out.println(obj1.surname);
        System.out.println(e);
        System.out.println(lastname);

    }

}

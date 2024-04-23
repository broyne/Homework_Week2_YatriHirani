package homework_week_2;

public class Programme3 {

    /**
     * 3.1 Declare one instance and one static variable.
     * 3.2 Declare one instance method.
     * 3.3 Declare one static method.
     * 3.4 Call both instance and static variables into both instance and static methods inside the print statement.
     * 3.5 Declare the Main method.
     * 3.6 Call both instance and static methods into the Main method and run the program
     */

    int a = 20;
    static int b = 30;

    public static void main(String[] args) {
        new Programme3().imethod();
        smethod();
    }


    public void imethod() {
        System.out.println("------------- Below are using Instance Method -----------");

        System.out.println(a);
        System.out.println(b);
    }

    public static void smethod() {
        System.out.println("------------- Below are using Static Method -----------");
        Programme3 obj = new Programme3();
        System.out.println(obj.a);
        System.out.println(b);
    }


}

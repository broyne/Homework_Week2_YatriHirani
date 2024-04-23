package homework_week_2;

public class Programme1 {

    /**
     * 1.1 Declare two instance variables.
     * 1.2 Declare one instance method.
     * 1.3 Call both instance variables into the instance method inside the print statement.
     * 1.4 Declare the Main method.
     * 1.5 Call the above instance method into the Main method and Run the programme.
     */

    int y = 20;
    String name = "Yatri Hirani";


    public static void main(String[] args) {
        new Programme1().instancemethod();

    }

    public void instancemethod() {
        Programme1 obj1 = new Programme1();
        System.out.println(obj1.y);
        //System.out.println(y);
        System.out.println(name);

    }


}



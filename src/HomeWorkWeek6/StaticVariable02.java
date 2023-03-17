package HomeWorkWeek6;

/**
 * 2.1 Declare two static variables
 * 2.2 Declare one static method
 * 2.3 Call both static variables into the static method inside the print statement.
 * 2.4 Declare the Main method.
 * 2.5 Call the static method into the Main method and Run the programme.
 */
//2.1 Declare two static variables
public class StaticVariable02 {
    static  int a =11;
    static int b =23;

    //2.4 Declare the Main method.
    public static void main(String[] args){
    myMethod();

    }

    public static void myMethod() { //2.3 Call both static variables into the static method inside the print statement.

        System.out.println(StaticVariable02.a);
        System.out.println(StaticVariable02.b); //2.5 Call the static method into the Main method and Run the programme.
    }


}

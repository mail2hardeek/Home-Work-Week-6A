package HomeWorkWeek6;

/**
 * 1.1 Declare two instance variables.
 * 1.2 Declare one instance method.
 * 1.3 Call both instance variables into the instance method inside the print statement.
 * 1.4 Declare the Main method.
 * 1.5 Call the above instance method into the Main method and Run the programme.
 */

public class InstanceVariable01 {
    int a = 5; //1.1 Declare two instance variables.
    int b = 10;

    //1.4 Declare the Main method.
    public static void main(String[] args) {
        InstanceVariable01 obj = new InstanceVariable01();
        obj.myMethod(); //1.5 Call the above instance method into the Main method and Run the programme.

    }
//
    public void myMethod() { //1.2 Declare one instance method.
        InstanceVariable01 t = new InstanceVariable01();
        System.out.println(t.a); //1.3 Call both instance variables into the instance method inside the print statement.
        System.out.println(t.b);

    }
}
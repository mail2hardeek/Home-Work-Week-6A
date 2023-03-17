package HomeWorkWeek6;

/**
 * 3.1 Declare one instance and one static variable.
 * 3.2 Declare one instance method.
 * 3.3 Declare one static method.
 * 3.4 Call both instance and static variables into both instance and static methods inside the
 * print statement.
 * 3.5 Declare the Main method.
 * 3.6 Call both instance and static methods into the Main method and run the programme.
 */

public class OneStaticInstanceOneStaticvariable03 {
    int a = 11; //3.1 Declare one instance and one static variable.
    static int b = 23;

    public static void main(String[] args) {
        OneStaticInstanceOneStaticvariable03 obj = new OneStaticInstanceOneStaticvariable03();
        obj.myResult();
        myMethod();
    }


    public void myResult() { //3.2 Declare one instance method.
        OneStaticInstanceOneStaticvariable03 h = new OneStaticInstanceOneStaticvariable03();
        System.out.println(h.a);

    }

    public static void myMethod() { //3.3 Declare one static method.
        System.out.println(StaticVariable02.b);

    }


}


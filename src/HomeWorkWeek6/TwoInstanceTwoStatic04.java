package HomeWorkWeek6;

/**
 * 4.1 Declare two instance and two static variables.
 * 4.2 Declare one instance method.
 * 4.3 Declare one static method.
 * 4.4 Call all four instance and static variables into both instance and static methods inside the
 * print statement.
 * 4.5 Declare the Main method.
 * 4.6 Call both instance and static methods into the Main method and run the programme.
 */

//4.1 Declare two instance and two static variables.
public class TwoInstanceTwoStatic04 {
    int h = 25;
    int r = 29;
    static int v=27;
    static int x=23;

//4.5 Declare the Main method.
    public static void main(String[] args) {
    TwoInstanceTwoStatic04 obj = new TwoInstanceTwoStatic04();
    obj.myWork();
    myHome();

    } //4.6 Call both instance and static methods into the Main method and run the programme.

 public void myWork() { //4.2 Declare one instance method.
     TwoInstanceTwoStatic04 z = new TwoInstanceTwoStatic04();
     System.out.println(z.h);
     System.out.println(z.r);
     System.out.println(TwoInstanceTwoStatic04.v);
     System.out.println(TwoInstanceTwoStatic04.x); //4.4 Call all four instance and static variables into both instance and static methods inside the
             //print statement.
 }

     static public void myHome(){ //4.3 Declare one static method.
         System.out.println(TwoInstanceTwoStatic04.v);
         System.out.println(TwoInstanceTwoStatic04.x);
         TwoInstanceTwoStatic04 z = new TwoInstanceTwoStatic04();
         System.out.println(z.h);
         System.out.println(z.r); //

     }

}

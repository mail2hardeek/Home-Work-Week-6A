/**
 * Write a Java program to swap two variables
 */

package HomeWorkWeek6;

public class SwapVariable15 {
    public static void main(String[] args) {

        int a =10;
        int b =15;
        System.out.println("Before swapping: a = " + a +"; b = "+b);

        int temp =a;
        a = b;
        b =temp;

        System.out.println("After swapping: a = " + a + ", b = " +b);

    }

}

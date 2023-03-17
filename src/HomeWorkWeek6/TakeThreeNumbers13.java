/**
 * Write a Java program that takes three numbers as input to calculate and
 * print the average of the numbers.
 */

package HomeWorkWeek6;

import java.util.Scanner;


public class TakeThreeNumbers13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input first number:");
        int fig1 = in.nextInt();
        System.out.println("Input second number");
        int fig2 = in.nextInt();
        System.out.println("Input third number");
        int fig3 = in.nextInt();
        System.out.println("Input fourth number");
        int fig4 = in.nextInt();
        System.out.println("Input fifth number");
        int fig5 = in.nextInt();
        System.out.println("Average of five number is:" +
                (fig1 + fig2 + fig3 + fig4 + fig5) / 5);

    }

}



/**
 * Write a Java program to convert a decimal number to binary number.
 *
 * Input Data:
 * Input a Decimal Number : 5
 * Expected Output
 *
 * Binary number is: 101
 */


package HomeWorkWeek6;

import java.util.Scanner;

public class Decimal17 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println( "Enter a decimal number: ");
        int decimal = sc.nextInt();

        //convert decimal to binary
        String binary = Integer.toBinaryString(decimal);
        System.out.println("Binary number is: "+ binary);
    }
}

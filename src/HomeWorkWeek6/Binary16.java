/**
 * 16. Write a Java program to add two binary numbers.
 *
 * Input Data:
 * Input first binary number: 10
 * Input second binary number: 11
 * Expected Output:
 *
 * Sum of two binary numbers: 101
 */

package HomeWorkWeek6;
import java.util.Scanner;
public class Binary16 {


             public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter first binary number: ");
            int num1 = sc.nextInt(2); // read binary number as int
            System.out.print("Enter second binary number: ");
            int num2 = sc.nextInt(2); // read binary number as int

            // add the binary numbers
            int sum = num1 + num2;

            // convert the sum to binary and print it
            System.out.println("Sum of two binary numbers: " + Integer.toBinaryString(sum));
        }
    }


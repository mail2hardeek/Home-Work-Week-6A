/**
 * Write a program to calculate the area of a triangle.
 */

package HomeWorkWeek6;

import java.util.Scanner;

public class AreaOfTriangle8 {
        public static void main(String[] args) {
            int a,b,c,per; double area;
            System.out.println("Enter value for sides of Triangle: ");
            Scanner h = new Scanner(System.in);
            a = h.nextInt();
            b = h.nextInt();
            c = h.nextInt();
            per = (a+b+c)/2;
            area=Math.sqrt(per *(per-a)*(per-b)*(per-c));
            System.out.println("Area of Triangle " + area);

        }
    }


/**
 * Write a program for a calculator with addition, subtraction, multiplication
 * and division methods all with parameters and use string concatenation
 * methods.(Note: Two static and Two instance methods.)
 */

package HomeWorkWeek6;

import java.util.Scanner;

public class ProgrammeCalculator5 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in); //to import the scanner
        System.out.println("First number: ");
        int a =scanner.nextInt();
        System.out.println("Second number: ");
        int b =scanner.nextInt();
        System.out.println("Third number: ");
        int c =scanner.nextInt();
        System.out.println("Fourth number: ");
        int d =scanner.nextInt();

        ProgrammeCalculator5 obj =new ProgrammeCalculator5();
        obj.mouse();
        obj.rat();
        cat();
        dog();
        int answer= (a+b+c+d); //addition
        int answer1= (a-b-c-d); //subtraction
        int answer2= (a*b*c*d); //multiplication
        int answer3= (a/b/c/d); //division
        System.out.println("addition : "+ answer);
        System.out.println("sub: "+ answer1);
        System.out.println("multi"+ answer2 );
        System.out.println("div"+ answer3);
    }

    public static void cat() {int a;} //static method
    public static void dog() {int b;}
    public void mouse() {int c;} //instance method
    public void rat() {int d;}
}

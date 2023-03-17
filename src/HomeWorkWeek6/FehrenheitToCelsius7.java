package HomeWorkWeek6;

import java.util.Scanner;
public class FehrenheitToCelsius7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Farenheit to Celsuis");
        //int result = scan.nextInt();
        {
            System.out.println("Enter Fahrenheit Value: ");
            double value = scan.nextDouble();
            double valueFinal = (value -32) * 5/9;
            System.out.print("Celsius is: ");
            System.out.println(Math.round(valueFinal*10.0/10.0));

        }

    }
}

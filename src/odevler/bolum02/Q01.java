package odevler.bolum02;

import java.util.Scanner;

public class Q01 { /*
    (Convert Celsius to Fahrenheit)
    Write a program that reads a Celsius degree in a double value from the console,
    then converts it to Fahrenheit and displays the result.
    The formula for the conversion is as follows:
   * fahrenheit = (9 / 5) * celsius + 32
    Hint: In Java, 9 / 5 is 1, but 9.0 / 5 is 1.8.
     */
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a degree in celcius: ");
            double celcius = input.nextDouble();
            double fahreneit = (9.0 / 5) * celcius + 32 ;
            System.out.printf(celcius + " is " + fahreneit + " fahreneit. ");

    }
    }

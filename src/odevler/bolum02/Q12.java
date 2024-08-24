package odevler.bolum02;
import java.util.Scanner;
public class Q12 {
    /*
    2.12 (Physics: finding runway length)
Given an airplane’s acceleration a and take-off
speed v, you can compute the minimum runway length needed for an airplane to
take off using the following formula:
length = v**2 / 2*a
Write a program that prompts the user to enter v in meters/second (m/s) and the
acceleration a in meters/second squared (m/s2), and displays the minimum runway length.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter speed and acceleration:  ");
        double speed = sc.nextDouble();
        double acceleration = sc.nextDouble();
        double length = Math.pow(speed, 2) / (2 * acceleration);
        System.out.println("The minimum runway length for this airplane is " + length);



    }
}

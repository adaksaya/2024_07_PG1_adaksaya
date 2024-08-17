package odevler.bolum02;

import java.util.Scanner;

public class Q03 {
    /*
    2.3 (Convert feet into meters)
     Write a program that reads a number in feet, converts it to meters, and displays the result.

     ====>   One foot is 0.305 meter.  <===
     $$$$$$$

     :)  :)  :)

     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value for feet: ");
        double feet = sc.nextDouble();
        double meters = feet * 0.305 ;
        System.out.println(feet + " feet is " + meters + " meters <3 ");

    }


}

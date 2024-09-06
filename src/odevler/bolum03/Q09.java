package odevler.bolum03;
import java.util.Scanner;
public class Q09 {
    /*
    3.9 (Business: check ISBN-10) An ISBN-10 (International Standard Book Number)
consists of 10 digits: d1d2d3d4d5d6d7d8d9d10. The last digit, d10, is a checksum,
which is calculated from the other nine digits using the following formula:

(d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11

If the checksum is 10, the last digit is denoted as X according to the ISBN-10
convention. Write a program that prompts the user to enter the first 9 digits and
displays the 10-digit ISBN (including leading zeros). Your program should read
the input as an integer.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first 9 digits of an ISBN as integer: ");
        int a = sc.nextInt();
        int d9 = a % 10;
        int d8 = (a / 10) % 10;
        int d7 = (a / 100) % 10;
        int d6 = (a / 1000) % 10;
        int d5 = (a / 10000) % 10;
        int d4 = (a / 100000) % 10;
        int d3 = (a / 1000000) % 10;
        int d2 = (a / 10000000) % 10;
        int d1 = (a / 100000000) % 10;

        double d10 = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11 ;

        if(d10 == 10){
            System.out.println("The ISBN-10 number is " + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + "X");
        } else {
            System.out.println("The ISBN-10 number is " + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + d10);
        }

    }
}

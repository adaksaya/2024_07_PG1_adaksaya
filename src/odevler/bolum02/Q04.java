package odevler.bolum02;

import java.util.Scanner;

public class Q04 {
    /*

    2.4 (Convert pounds into kilograms)
    Write a program that converts pounds into kilograms.
    The program prompts the user to enter a number in pounds, converts it
  to kilograms, and displays the result. One pound is 0.454 kilograms.

  $$$$$$$ NOT: inputu double olarak girdiğimde InputMismatchException hatası alıyorum orayı düzeltemedim, öncekilerde sorunsuz çalışıyordu oysa... :D help
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number of pounds: ");
        double pounds = sc.nextDouble();
        double kilograms = pounds * 0.454D ;
        System.out.println( pounds + " pounds is " + kilograms + " kilograms ") ;

    }

}

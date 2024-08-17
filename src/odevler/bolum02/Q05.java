package odevler.bolum02;
import java.util.Scanner;

public class Q05 {
    /*
    2.5 (Financial application: calculate tips)
     Write a program that reads the subtotal and the gratuity rate, then computes the gratuity and total. For example,
    if the user enters 10 for subtotal and 15% for gratuity rate, the program displays $1.5 as gratuity and $11.5 as total.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the subtotal rate: ");
        double subtotal = sc.nextDouble();
        System.out.print("Enter the gratuity rate: ");
        double gratuity = sc.nextDouble();
        double displayAsGratuity = subtotal * gratuity / 100D;
        double total = subtotal + displayAsGratuity;
        System.out.println("Gratuity is: " + displayAsGratuity + "\nTotal is: " + total);


    }

}

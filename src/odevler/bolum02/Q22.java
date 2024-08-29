package odevler.bolum02;
import java.util.Scanner;
public class Q22 {
    /*
2.22 (Financial application: monetary units)
Rewrite Listing 2.10, ComputeChange.java, to fix the possible loss of accuracy when converting a double value to an
int value. Enter the input as an integer whose last two digits represent the cents.
For example, the input 1156 represents 11 dollars and 56 cents.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount as an integer whose last two digits represent the cents: ");
        int amount = sc.nextInt();
        int numbOfOneDollars = amount / 100;
        int numbOfCents = amount % 100;

        int numbOfQuarterCents = numbOfCents / 25;
        numbOfCents = numbOfCents % 25;
        int numbOfDimeCents = numbOfCents / 10;
        numbOfCents = numbOfCents % 10;
        int numbOfNickelCents = numbOfCents / 5;
        numbOfCents = numbOfCents % 5;
        int numbOfPennies = numbOfCents;

        System.out.println("Your amount is : " + numbOfOneDollars + " dollars, " + numbOfQuarterCents + " quartercents, " + numbOfDimeCents + " dimecents, " + numbOfNickelCents + " nickelcents, " + numbOfPennies + " cents. ");



    }
}

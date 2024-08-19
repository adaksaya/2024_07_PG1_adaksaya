package odevler.bolum02;
import java.util.Scanner;

public class Q07 {
    /*
    2.7 (Find the number of years)
    Write a program that prompts the user to enter the minutes (e.g., 1 billion),
    and displays the number of years and days for the minutes. For simplicity, assume a year has 365 days
    Here is a sample run:
    Enter the number of minutes: 1000000000
    1000000000 minutes is approximately 1902 years and 214 days
     */
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of minutes: ");
        int minutes = sc.nextInt();
        int dayTominutes = 24 * 60 ;
        int yearTominutes = 365 * dayTominutes;
        int years = minutes / yearTominutes;
        int days = (minutes % yearTominutes) / dayTominutes;
        System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days");

    }
}

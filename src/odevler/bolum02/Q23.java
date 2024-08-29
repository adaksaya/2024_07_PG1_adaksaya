package odevler.bolum02;
import java.util.Scanner;
public class Q23 {
    /*
    2.23 (Cost of driving) Write a program that prompts the user to enter the distance to
drive, the fuel efficiency of the car in miles per gallon, and the price per gallon,
and displays the cost of the trip.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the driving distance: ");
        double drivingDistance = sc.nextDouble();
        System.out.print("Enter miles per gallon: ");
        double milesPerGallon = sc.nextDouble();
        System.out.print("Enter price per gallon: ");
        double pricePerGallon = sc.nextDouble();

        double totalGallon = drivingDistance / milesPerGallon ;
        double price = totalGallon * pricePerGallon;
        System.out.println("The cost of driving is $" + price);



    }
}

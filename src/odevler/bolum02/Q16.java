package odevler.bolum02;
import java.util.Scanner;
public class Q16 {
    /*
    2.16 (Geometry: area of a hexagon)
Write a program that prompts the user to enter the side of a hexagon and displays its area.
he formula for computing the area of a hexagon is

Area: (3√3/2) * s^2
where s is the length of a side.

     */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double s , area ;
        System.out.print("Enter the side: ");
        s = sc.nextDouble();

        area = ( 3 * Math.sqrt(3) / 2 ) * Math.pow(s , 2);
        System.out.println("The area is " + area);

    }
}

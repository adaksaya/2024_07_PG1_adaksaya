package odevler.bolum02;
import java.util.Scanner;
public class Q15 {
    /*
   2.15 (Geometry: distance of two points) Write a program that prompts the user to enter
two points (x1, y1) and (x2, y2) and displays their distance between them.
The formula for computing the distance is
√((x2 - x1)^2 + (y2 - y1)^2)
Note that you can use Math.pow(a, 0.5) to compute √a.
     */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double x1 , x2 , y1 , y2 , distance;
        System.out.print("Enter x1 and y1: ");
        x1 = sc.nextDouble();
        y1 = sc.nextDouble();
        System.out.print("Enter x2 and y2: ");
        x2 = sc.nextDouble();
        y2 = sc.nextDouble();

        distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("The distance between the two points is: " + distance);





    }
}

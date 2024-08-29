package odevler.bolum03;

import java.util.Scanner;

public class Q01 {
    /*
3.1 (Algebra: solve quadratic equations) The two roots of a quadratic equation
ax^2 + bx + c = 0 can be obtained using the following formula:
r1 = (-b + √(b^2 - 4ac)) / 2a
and
r2 = (-b - √(b^2 - 4ac))/ 2a

b^2 - 4ac is called the discriminant of the quadratic equation. If it is positive, the
equation has two real roots. If it is zero, the equation has one root. If it is negative,
the equation has no real roots.
Write a program that prompts the user to enter values for a, b, and c and displays
the result based on the discriminant. If the discriminant is positive, display two
roots. If the discriminant is 0, display one root. Otherwise, display “The equation
has no real roots”.
Note that you can use Math.pow(x, 0.5) to compute  √x.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a, b, c: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        if ((Math.pow(b, 2) - 4 * a * c) > 0) {
            double r1 = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / 2 * a;
            double r2 = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / 2 * a;
            System.out.printf("The equation has two roots " + r1 + "and " + r2 + ".");
        }
        else if ((Math.pow(b, 2) - 4 * a * c) == 0){
            double r3 = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / 2 * a;
            System.out.printf("The equation has one root " + r3 + ".");
        }
        else
            System.out.println("The equation has no real roots.");


    }
}

package odevler.bolum03;
import java.util.Scanner;
public class Q03 {
    /*
    3.3 (Algebra: solve 2 * 2 linear equations) A linear equation can be solved using
Cramer’s rule given in Programming Exercise 1.13. Write a program that prompts
the user to enter a, b, c, d, e, and f and displays the result. If ad - bc is 0, report
that “The equation has no solution.”

    You can use Cramer’s rule to solve the following 2 * 2 system of linear equation:
    ax + by = e
    cx + dy = f
    x = (ed - bf) / (ad - bc)
    y = (af - ec) / (ad - bc)
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a, b, c, d, e, f: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double d = sc.nextDouble();
        double e = sc.nextDouble();
        double f = sc.nextDouble();

    double commonPart = (a * d) - (b * c);

    if (commonPart == 0 ) {
        System.out.println("The equation has no solution.");
    }
    else {
       double x = (e*d - b*f) / commonPart ;
       double y = (a*f - e*c) / commonPart ;
       System.out.println("x is " + x + " and y is " + y + ".");
    }

    }
}

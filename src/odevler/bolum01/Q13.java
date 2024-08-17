package odevler.bolum01;

public class Q13 {
 /*
  1.13 (Algebra: solve 2 * 2 linear equations)
  You can use Cramer’s rule to solve the following 2 * 2 system of linear equation:
    ax + by = e
    cx + dy = f
    x = (ed - bf) / (ad - bc)
    y = (af - ec) / (ad - bc)
  Write a program that solves the following equation and displays the value for x and y:
    3.4x + 50.2y = 44.5
    2.1x + .55y = 5.9
  */
    public static void main(String[] args) {
        System.out.println("3.4x + 50.2y = 44.5\n" +
                "2.1x + .55y = 5.9");
        System.out.println(" Cramer’s rule to solve 2 * 2 system of linear equation:");
        double a = 3.4 ;
        double b = 50.2 ;
        double c = 2.1 ;
        double d = 0.55 ;
        double e = 44.5 ;
        double f = 5.9 ;
        double common_part = 1.0 / (a*d - b*c) ;
        double x = (e*d - b*f) / common_part ;
        double y = (a*f - e*c) / common_part ;
        System.out.println(" Value for x = " + x + "\n & " + "\n Value for y = " + y);
    }
}

package odevler.bolum02;

public class Q18 {
    /*
2.18 (Print a table)
Write a program that displays the following table. Cast floating point numbers into integers.
a b pow(a, b)
1 2 1
2 3 8
3 4 81
4 5 1024
5 6 15625
     */
    public static void main(String[] args) {
        System.out.println("a \t b \t pow(a,b)");
        int a1 = 1, a2 = 2, a3 = 3, a4 = 4, a5 = 5;
        int b1 = 2, b2 = 3, b3 = 4, b4 = 5, b5 = 6;

        System.out.println(a1 + "\t " + b1 + "\t   " + (int)Math.pow(a1, b1));
        System.out.println(a2 + "\t " + b2 + "\t   " + (int)Math.pow(a2, b2));
        System.out.println(a3 + "\t " + b3 + "\t   " + (int)Math.pow(a3, b3));
        System.out.println(a4 + "\t " + b4 + "\t   " + (int)Math.pow(a4, b4));
        System.out.println(a5 + "\t " + b5 + "\t   " + (int)Math.pow(a5, b5));



    }
}

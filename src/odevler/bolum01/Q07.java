package odevler.bolum01;

public class Q07 {
    /*
    1.7 (Approximate) p can be computed using the following formula:
        π = 4 × ( 1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + ... )
     Write a program that displays the result of
        4 × ( 1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 )
        4 × ( 1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + 1/13 )
      Use 1.0 instead of 1 in your program.
     */
    public static void main(String[] args) {
        System.out.println("4 × ( 1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 ) =  " + (4 * ( 1f - 1f/3 + 1f/5 - 1f/7 + 1f/9 - 1f/11 ))) ;
        System.out.println("4 × ( 1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + 1/13  ) =  " + (4 * ( 1f - 1f/3 + 1f/5 - 1f/7 + 1f/9 - 1f/11 + 1f/13 ))) ;



    }
}

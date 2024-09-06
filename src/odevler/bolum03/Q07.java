package odevler.bolum03;
import java.util.Scanner;
public class Q07 {
    /*
    3.7 (Financial application: monetary units)
Modify Listing 2.10, ComputeChange.java, to display the nonzero denominations only, using singular words for single
units such as 1 dollar and 1 penny, and plural words for more than one unit such
as 2 dollars and 3 pennies.
__________________________________
3.14 CONDİTİONAL EXPRESSİONS (p.126)
********************  (boolean-expression ? expression1 : expression2);  *******************
The result of this conditional expression is expression1 if boolean-expression is true;
otherwise the result is expression2.
----------------------------------
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

        if(numbOfOneDollars > 0){
            System.out.println(numbOfOneDollars + (numbOfOneDollars == 1 ? " dollar" : " dollars"));
        }
        if(numbOfQuarterCents > 0){
            System.out.println(numbOfQuarterCents + (numbOfQuarterCents == 1 ? " quarter" : " quarters"));
        }
        if(numbOfDimeCents > 0){
            System.out.println(numbOfDimeCents + (numbOfDimeCents == 1 ? " dime" : " dimes"));
        }
        if(numbOfPennies > 0){
            System.out.println(numbOfPennies + (numbOfPennies == 1 ? " penny" : " pennies"));
        }


    }
}

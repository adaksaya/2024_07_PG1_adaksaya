package odevler.bolum03;
import java.util.Scanner;
public class Q08 {
    /*
 3.8 (Sort three integers)
 Write a program that prompts the user to enter three integers and display the integers in non-decreasing order.
    */
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter int number1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter int number2: ");
        int num2 = sc.nextInt();
        System.out.print("Enter int number3: ");
        int num3 = sc.nextInt();

        if (num1 > num2 && num2 > num3) {
            System.out.print( num1 + ">" + num2 + ">" + num3);
        }
        else if (num2 > num1 && num2 < num3) {
            System.out.print( num3 + ">" + num2 + ">" + num1);
        }
        else if (num3 > num1 && num3 < num2) {
            System.out.print( num1 + ">" + num3 + ">" + num2);
        }
        else if (num1 > num3 && num3 > num2) {
            System.out.print( num2 + ">" + num3 + ">" + num1);
        }
        else if (num2 > num3 && num3 > num1) {
            System.out.print( num3 + ">" + num1 + ">" + num2);
        }
        else if (num2 > num1 && num3 < num1) {
            System.out.print( num2 + ">" + num1 + ">" + num3);
        }

    }
}

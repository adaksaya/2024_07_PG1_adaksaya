package odevler.bolum02;

import java.util.Scanner;

public class Q20 {
    /*
2.20 (Financial application: calculate interest)
If you know the balance and the annual percentage interest rate,
 you can compute the interest on the next monthly payment using the following formula:
interest = balance * (annualInterestRate/1200)

Write a program that reads the balance and the annual percentage interest rate and
displays the interest for the next month.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter balance and interest rate (e.g., 3 for 3%): ");
        double balance, interestRate , interest;
        balance = sc.nextDouble();
        interestRate = sc.nextDouble();
        interest = balance * (interestRate/1200);
        System.out.print("The interest is " + interest);



    }
}

package odevler.bolum02;
import java.util.Scanner;
public class Q21 {
    /*
2.21 (Financial application: calculate future investment value)
Write a program that reads in investment amount, annual interest rate, and number of years,
and displays the future investment value using the following formula:

futureInvestmentValue =investmentAmount * (1 + monthlyInterestRate)^(numberOfYears*12)

For example, if you enter amount 1000, annual interest rate 3.25%, and number
of years 1, the future investment value is 1032.98

     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double investmentAmount , annualInterestRate , monthlyInterestRate, futureInvestmentValue;
        System.out.print("Enter the amount to invest: ");
        investmentAmount = sc.nextDouble();
        System.out.print("Enter the annual interest rate: ");
        annualInterestRate = sc.nextDouble();
        System.out.print("Enter the number of years: ");
        int numberOfYears = sc.nextInt();

        monthlyInterestRate = annualInterestRate / 12 / 100;
        futureInvestmentValue = investmentAmount * Math.pow((1 + monthlyInterestRate), numberOfYears * 12);

        System.out.println("Accumulated value is $" + futureInvestmentValue);





    }
}

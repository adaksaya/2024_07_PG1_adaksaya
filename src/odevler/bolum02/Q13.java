package odevler.bolum02;

import java.util.Scanner;
public class Q13 {
    /*
    (Financial application: compound value)
    Suppose you save $100 each month
into a savings account with the annual interest rate 5%. Thus, the monthly interest rate is 0.05/12 = 0.00417.
After the first month, the value in the account becomes
    100 * (1 + 0.00417) = 100.417
    After the second month, the value in the account becomes
            (100 + 100.417) * (1 + 0.00417) = 201.252
    After the third month, the value in the account becomes
            (100 + 201.252) * (1 + 0.00417) = 302.507
    and so on.
    Write a program that prompts the user to enter a monthly saving amount and
    displays the account value after the sixth month. (In Exercise 5.30, you will use a
    loop to simplify the code and display the account value for any month.
            */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double monthlySave , annualRate , monthlyRate , month1 , month2 ,  month3 , month4 , month5 , month6;

        System.out.print("Enter the monthly saving amount:  ");
        monthlySave = sc.nextDouble();

        annualRate = 0.05;
        monthlyRate = annualRate / 12;

        month1 = monthlySave * (1 + monthlyRate);
        month2 = (monthlySave+ month1) * (1 + monthlyRate);
        month3 = (monthlySave + month2) * (1 + monthlyRate);
        month4 = (monthlySave + month3) * (1 + monthlyRate);
        month5 = (monthlySave + month4) * (1 + monthlyRate);
        month6 = (monthlySave + month5) * (1 + monthlyRate);

        System.out.print("After the sixth month, the account value is $" + month6);




    }
}


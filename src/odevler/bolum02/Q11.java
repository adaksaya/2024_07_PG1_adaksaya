package odevler.bolum02;
import java.util.Scanner;
public class Q11 {
    /*
    2.11 (Population projection)
Rewrite Programming Exercise 1.11 to prompt the user
to enter the number of years and displays the population after the number of years.
Use the hint in Programming Exercise 1.11 for this program. The population
should be cast into an integer
____________________________________________
 ■ One birth every 7 seconds
 ■ One death every 13 seconds
 ■ One new immigrant every 45 seconds
 Write a program to display the population for each of the next five years. Assume the
current population is 312,032,486 and one year has 365 days.
     */
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of years: ");
        double years = sc.nextDouble();
        int current_population = 312032486 ;
        int YearsToSecond = 365*24*3600 ;
        double birthNumbInYears = YearsToSecond / 7D ;
        double deathNumbInYears = YearsToSecond / 13D ;
        double immigrantNumbInYears = YearsToSecond / 45D ;
        double population = (birthNumbInYears + immigrantNumbInYears - deathNumbInYears) * years + current_population ;
        System.out.println("The population of " + years + "  years is  " + (int) population);

    }
}

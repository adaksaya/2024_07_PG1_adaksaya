package odevler.bolum03;
import java.util.Scanner;
public class Q05 {
    /*
    *3.5 (Find future dates)
Write a program that prompts the user to enter an integer for today’s day of the week
(Sunday is 0, Monday is 1, …, and Saturday is 6).
Also prompt the user to enter the number of days after today for a future day and display the future day of the week.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter today's day: ");
        int day = sc.nextInt();
        System.out.println("Enter the number of days elapsed since today: ");
        int elapsed = sc.nextInt();
        String today = "";

        switch (day) {
            case 0: today = "Sunday"; break;
            case 1: today = "Monday"; break;
            case 2: today = "Tuesday"; break;
            case 3: today = "Wednesday"; break;
            case 4: today = "Thursday"; break;
            case 5: today = "Friday"; break;
            case 6: today = "Saturday"; break;

        }
        int future = (day + elapsed) % 7 ;
        String futureday = "";

        switch (future) {
            case 0: futureday = "Sunday"; break;
            case 1: futureday = "Monday"; break;
            case 2: futureday = "Tuesday"; break;
            case 3: futureday = "Wednesday"; break;
            case 4: futureday = "Thursday"; break;
            case 5: futureday = "Friday"; break;
            case 6: futureday = "Saturday"; break;

        }
        System.out.println("Today is " + today + " and the future day is " + futureday ) ;
    }
}

package odevler.bolum03;
import java.util.Scanner;
public class Q11 {

    /*
     *3.11 (Find the number of days in a month) Write a program that prompts the user to enter the month and year
     *  and displays the number of days in the month.
     * For example, if the user entered month 2 and year 2012, the program should display that February 2012 had 29 days.
     * If the user entered month 3 and year 2015, the program should display that March 2015 had 31 days.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the month: ");
        int month= sc.nextInt();
        System.out.print("Enter the year: ");
        int year= sc.nextInt();

        String monthname;
        switch (month) {
            case 1: monthname = "January"; break;
            case 2:monthname = "February"; break;
            case 3:monthname = "March"; break;
            case 4:monthname = "April"; break;
            case 5:monthname = "May"; break;
            case 6:monthname = "June"; break;
            case 7:monthname = "July"; break;
            case 8:monthname = "August"; break;
            case 9:monthname = "September"; break;
            case 10:monthname = "October"; break;
            case 11:monthname = "November"; break;
            case 12:monthname = "December"; break;

            default:
                System.out.println("Invalid month");
                return;
        }
        int daysInMonth;
        if(month == 2){
            if(year % 4 == 0) {
                daysInMonth = 29;
            } else {
                daysInMonth = 28;
            }
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            daysInMonth = 30;
        } else {
            daysInMonth = 31;
        }
        System.out.println(monthname + " " + year + ", " + daysInMonth + " days");


        }




    }



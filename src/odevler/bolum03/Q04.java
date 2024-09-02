package odevler.bolum03;

public class Q04 {
    /*
    *3.4 (Random month) Write a program that randomly generates an integer between 1
and 12 and displays the English month name January, February, …, December for
the number 1, 2, …, 12, accordingly.
-----------------------------------------------------------------------------
* Overuse of nested IF statements makes a program difficult to read.
 Java provides a SWITCH statement to simplify coding for multiple condition.  :-)
     */
    public static void main(String[] args) {
        int monthNumber = (int) (Math.random() * 12) + 1;
        String month = "";
        switch (monthNumber) {
            case 1: month = "January";break;
            case 2: month = "February";break;
            case 3: month = "March";break;
            case 4: month = "April";break;
            case 5: month = "May";break;
            case 6: month = "June";break;
            case 7: month = "July";break;
            case 8: month = "August";break;
            case 9: month = "September";break;
            case 10: month = "October";break;
            case 11: month = "November";break;
            case 12: month = "December";
        }
        System.out.println("Random month is " + month);

    }
}
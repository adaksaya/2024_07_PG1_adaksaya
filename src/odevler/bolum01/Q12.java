package odevler.bolum01;

public class Q12 {
    /*
      (Average speed in kilometers)
      Assume a runner runs 24 miles in 1 hour, 40  minutes, and 35 seconds.
      Write a program that displays the average speed in kilometers per hour.
      (Note that 1 mile is 1.6 kilometers.)
     */
    public static void main(String[] args) {
        double milesToKm = 1.6 ;
        int minToHour = 60 ;
        int secToHour = 3600 ;
        double runTimeHours = 1.0 + 40.0/minToHour + 35.0/secToHour ;
        double distance = 24 * milesToKm ;
        double average_speed = distance / runTimeHours ;
        System.out.println("Average speed in kilometers: " + average_speed);


    }
}

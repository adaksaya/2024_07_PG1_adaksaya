package odevler.bolum01;

public class Q10 {

    // 1.10 (Average speed in miles)
    // Assume a runner runs 14 kilometers in 45 minutes and 30 seconds.
    // Write a program that displays the average speed in miles per hour. (Note that 1 mile is 1.6 kilometers.)

    public static void main(String[] args) {

        double distanceKm = 14.0 ;
        int minutes = 45 ;
        int seconds = 30 ;
        double kmToMiles = 1.6 ;

        double distanceMiles = distanceKm / kmToMiles ;
        double timeInHours = (minutes / 60D) + (seconds / 3600D);

        double averageSpeed = distanceMiles / timeInHours;
        System.out.println("Average speed in miles: " + averageSpeed) ;

    }



}

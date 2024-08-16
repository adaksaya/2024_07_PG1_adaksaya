package odevler.bolum01;

public class Q11 {
    /* (Population projection)
The U.S. Census Bureau projects population based on the
following assumptions:
 ■ One birth every 7 seconds
 ■ One death every 13 seconds
 ■ One new immigrant every 45 seconds
 Write a program to display the population for each of the next five years. Assume the
current population is 312,032,486 and one year has 365 days. Hint: In Java, if two
integers perform division, the result is an integer. The fractional part is truncated. For
example, 5 / 4 is 1 (not 1.25) and 10 / 4 is 2 (not 2.5). To get an accurate result with
the fractional part, one of the values involved in the division must be a number with a
decimal point. For example, 5.0 / 4 is 1.25 and 10 / 4.0 is 2.5.
     */

    public static void main(String[] args) {
        double current_population = 312032486 ;
        int YearsToSecond = 365*24*3600 ;
        int oneBirthSec = 7 ;
        int oneDeathSec = 13 ;
        int oneImmigrantSec = 45 ;
        double birthNumbInYears = YearsToSecond / oneBirthSec ;
        double deathNumbInYears = YearsToSecond / oneDeathSec ;
        double immigrantNumbInYears = YearsToSecond / oneImmigrantSec ;
        double changes = birthNumbInYears + immigrantNumbInYears - deathNumbInYears ;
        System.out.println("Current population: " + current_population);
        System.out.println("New population after 1 year: " + changes + current_population);
        System.out.println("New population after 2 year: " + changes*2 + current_population);
        System.out.println("New population after 3 year: " + changes*3 + current_population);
        System.out.println("New population after 4 year: " + changes*4 + current_population);
        System.out.println("New population after 5 year: " + changes*5 + current_population);





    }
}


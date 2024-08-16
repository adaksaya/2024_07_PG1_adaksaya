package odevler.bolum01;

public class Q08 {
    /*
    1.8 (Area and perimeter of a circle)
 Write a program that displays the area and perimeter of a circle that has a radius of 5.5 using the following formula:

   perimeter = 2 * radius * p
   area = radius * radius * p
    */
    public static void main(String[] args) {
        double radius = 5.5 ;
        double p = Math.PI ;

        double perimeter = 2 * radius * p ;
        double area = radius * radius * p ;
        System.out.println("Perimeter of a circle that has a radius of 5.5 : " + perimeter);
        System.out.println("Area of a circle that has a radius of 5.5 : " + area);

    }
}

package odevler.bolum01;

public class Q09 {
       /*
    1.9 (Area and perimeter of a rectangle)
    Write a program that displays the area and perimeter of a rectangle with the
    width of 4.5 and height of 7.9 using the following formula:

    area = width * height
     */
public static void main(String[] args) {

    double width = 4.5 ;
    double height = 7.9 ;
    double area = width * height ;
    double perimeter = 2 * (width + height) ;

    System.out.println("Area of a rectangle with the width of 4.5 and height of 7.9 : " + area);
    System.out.println("Perimeter of a rectangle with the width of 4.5 and height of 7.9 : " + perimeter);
}
}

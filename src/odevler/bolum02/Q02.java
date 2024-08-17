package odevler.bolum02;

import java.util.Scanner;

public class Q02 {
    /*
    2.2 (Compute the volume of a cylinder)
    Write a program that reads in the radius and length of a cylinder and computes
    the area and volume using the following formulas:
    area = radius * radius * p
    volume = area * lengt
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of a cylinder: ");
        double radius = sc.nextDouble();
        System.out.print("Enter the length of a cylinder: ");
        double length = sc.nextDouble();
        double area = Math.PI * radius * radius;
        double volume = length * area;
        System.out.println("The area is: " + area + "\nThe volume is: " + volume);

    }






}

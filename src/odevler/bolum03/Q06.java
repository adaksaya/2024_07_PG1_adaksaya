package odevler.bolum03;
import java.util.Scanner;
public class Q06 {
    /*
    3.6 (Health application: BMI) Revise Listing 3.4, ComputeAndInterpretBMI.java, to
let the user enter weight, feet, and inches. For example, if a person is 5 feet and 10
inches, you will enter 5 for feet and 10 for inches.
     */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter weight in pounds: ");
        double weight = sc.nextDouble();
        System.out.print("Enter inches: ");
        double height = sc.nextDouble();
        System.out.print("Enter feet: ");
        double feet = sc.nextDouble();

        final double kgPerPound = 0.45359237;
        final double meterPerInches = 0.0254;
        final double meterPerFeet = 0.3048;

        double weightInKg = weight * kgPerPound;
        double heightInMeters = (height * meterPerInches) + (feet * meterPerFeet);
        double bmi = weightInKg / Math.pow(heightInMeters, 2);

        System.out.println("BMI is " + bmi);
        if (bmi < 18.5)
            System.out.print("You are underweight");
        else if (bmi >= 18.5 && bmi < 25)
            System.out.print("You are normal");
        else if (bmi >= 25 && bmi < 30)
            System.out.print("You are overweight");
        else
            System.out.print("You are obese");





    }



}

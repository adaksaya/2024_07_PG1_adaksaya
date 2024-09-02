package odevler.bolum03;
import java .util.Random;
import java.util.Scanner;
public class Q02 {
    /*
    3.2 (Game: add three numbers)
The program in Listing 3.1, AdditionQuiz.java, generates two integers
and prompts the user to enter the sum of these two integers.
Revise the program to generate three single-digit integers and prompt the user to
enter the sum of these three integers.
     */
    public static void main(String[] args) {
        Random numb1 = new Random();
        Random numb2 = new Random();
        Random numb3 = new Random();
    int number1 = numb1.nextInt(101);
    int number2 = numb2.nextInt(101);  // 0-100 aralığında random sayılar
    int number3 = numb3.nextInt(101);
    Scanner input = new Scanner(System.in);
    System.out.println("What is " + number1 + " + " + number2 + " + " + number3 + " ? ");
    int answer = input.nextInt();
    if (answer == number1 + number2 + number3) {
        System.out.print(number1 + " + " + number2 + " + " + number3 + " = " + answer + " is " + (number1 + number2 + number3 == answer));
    }
    else {
        int trueanswer = number1 + number2 + number3;
        System.out.print(number1 + " + " + number2 + " + " + number3 + " = " + answer + " is " + (number1 + number2 + number3 == answer) + "\ntrue answer is " + trueanswer);
    }






    }
}

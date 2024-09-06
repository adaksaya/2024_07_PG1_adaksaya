package odevler.bolum03;
import java.util.Scanner;
public class Q10 {
    /*
    3.10 (Game: addition quiz) Listing 3.3, SubtractionQuiz.java, randomly generates a subtraction question.
     Revise the program to randomly generate an addition question with two integers less than 100.
     */
    public static void main(String[] args) {
        int num1 = (int) (Math.random()*100);
        int num2 = (int) (Math.random()*100);

        System.out.print(num1 + " + " + num2 + " = ? ");
        Scanner sc = new Scanner(System.in);
        int answer = sc.nextInt();

        if (answer == num1 + num2) {
            System.out.println(num1 + " + " + num2 + " = " + answer + " is " + (num1 + num2 == answer));
        }
        else {
            System.out.print((num1+num2==answer) + " " + num1 + " + " + num2 + " = " + (num1+num2));

        }

    }
}

package odevler.bolum03;
import java.util.Scanner;
public class Q12 {
    /*
    3.12 (Palindrome number) Write a program that prompts the user to enter a three-digit integer
     and determines whether it is a palindrome number.
     A number is palindrome if it reads the same from right to left and from left to right.
     */
    public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter enter a three-digit integer: ");
    int number = sc.nextInt();
while(true){
    int firstDigit = number / 100;
    int lastDigit = number % 10;
if (99<number & number<1000){
    if (firstDigit == lastDigit) {
        System.out.println("The number is a palindrome. ");
    }
    else {
        System.out.println("The number is not a palindrome. ");
    }
    number = sc.nextInt();
}
else{
    System.out.println("The number should be three digits. ");
    return;
}

}



    }
}

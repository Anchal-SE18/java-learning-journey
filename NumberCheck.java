// Program to determine if a Number is Positive, Negative and Zero.

import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Number Checker");
        System.out.print("Enter Your Number: ");

        int num = input.nextInt();

        if (num > 0) {
            System.out.println("Your number is Positive!");
        } 
        else if (num == 0) {
            System.out.println("Your number is Zero!");
        } 
        else {
            System.out.println("Your number is negative!");
        }

        input.close();
    }
}

// Program to find the greatest of Three Numbers.

import java.util.Scanner;

public class GreatestOfThree {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Greatest of Three Numbers Calculator");

        System.out.print("Enter first Number: ");
        int firstNum = input.nextInt();

        System.out.print("Enter second Number: ");
        int secondNum = input.nextInt();

        System.out.print("Enter third Number: ");
        int thirdNum = input.nextInt();

        if (firstNum >= secondNum && firstNum >= thirdNum) {
            System.out.println("The Greatest Number is: " + firstNum);
        } 
        else if (secondNum >= thirdNum) {
            System.out.println("The Greatest Number is: " + secondNum);
        } 
        else {
            System.out.println("The Greatest Number is: " + thirdNum);
        }
        input.close();

    }
}

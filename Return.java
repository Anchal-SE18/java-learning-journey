// Program to input two numbers using methods and display their sum.

import java.util.Scanner;

public class Return {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        greet();

        int first = readNumber(input); // +1:
        int second = readNumber(input); // +2;

        int sum = first + second;
        System.out.println("Sum of the Number is: " + sum);

        input.close();
    }

    public static int readNumber(Scanner input) {
        System.out.print("Enter the Number: ");

        int number = input.nextInt();
        return number;
    }

    public static void greet() {
        System.out.println("--Welcome to Sum Calculator--");
    }
}

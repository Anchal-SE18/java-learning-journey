// Progam to perform different Bitwise Operations using a Menu driven apporach.

import java.util.Scanner;

public class BitwiseMenuProject {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int choice;
        do {

            System.out.println("Welcome to Bitwise Menu Project ");
            System.out.println("1. Bitwise AND (&)");
            System.out.println("2. Bitwise OR (|)");
            System.out.println("3. Bitwise XOR (^)");
            System.out.println("4. Left Shift (<<)");
            System.out.println("5. Right Shift (>>)");
            System.out.println("6. Unsigned Right Shift (>>>)");
            System.out.println("7. Exit");

            System.out.print("Enter Your Choice: ");
            choice = input.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter first number: ");
                    int a1 = input.nextInt();
                    System.out.print("Enter second number: ");
                    int b1 = input.nextInt();
                    System.out.println("Result (AND): " + (a1 & b1));
                    break;

                case 2:
                    System.out.print("Enter first number: ");
                    int a2 = input.nextInt();
                    System.out.print("Enter second number: ");
                    int b2 = input.nextInt();
                    System.out.println("Result (OR): " + (a2 | b2));
                    break;

                case 3:
                    System.out.print("Enter first number: ");
                    int a3 = input.nextInt();
                    System.out.print("Enter second number: ");
                    int b3 = input.nextInt();
                    System.out.println("Result (XOR): " + (a3 ^ b3));
                    break;

                case 4:
                    System.out.print("Enter a number: ");
                    int num1 = input.nextInt();
                    System.out.print("Enter shift positions: ");
                    int shift1 = input.nextInt();
                    System.out.println("Result (Left shift): " + (num1 << shift1));
                    break;

                case 5:
                    System.out.print("Enter a number: ");
                    int num2 = input.nextInt();
                    System.out.print("Enter shift positions: ");
                    int shift2 = input.nextInt();
                    System.out.println("Result (Right shift): " + (num2 >> shift2));
                    break;

                case 6:
                    System.out.print("Enter a number: ");
                    int num3 = input.nextInt();
                    System.out.print("Enter shift positions: ");
                    int shift3 = input.nextInt();
                    System.out.println("Result (Unsigned Right shift): " + (num3 >>> shift3));
                    break;

                case 7:
                    System.out.println("Thank you for using the Bitwise Menu Project!");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");

            }

        } while (choice != 7);

        input.close();
    }

}

// Program that shows the bitwise OR operation between two integers.

import java.util.Scanner;

public class BitwiseOR {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Bitwise OR Operation");
        System.out.print("Enter first Number: ");
        int num1 = input.nextInt();

        System.out.print("Enter second Number: ");
        int num2 = input.nextInt();

        // int num1 = 12; // Binary: 1100
        // int num2 = 5; // Binary: 0101

        int result = num1 | num2; 

        System.out.println("Bitwise OR of " + num1 + " | " + num2 + " is: " + result);

        input.close();
    }
}

// Program that shows the bitwise XOR operation between two integers.

import java.util.Scanner;

public class BitwiseXOR {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Bitwise XOR Operation");
        System.out.print("Enter first Number: ");
        int num1 = input.nextInt();

        System.out.print("Enter second Number: ");
        int num2 = input.nextInt();

        // int num1 = 12; // Binary: 1100
        // int num2 = 5; // Binary: 0101

        int result = num1 ^ num2;

        System.out.println("Bitwise XOR of " + num1 + " ^ " + num2 + " is: " + result);

        input.close();
    }
}

// Program that shows the bitwise NOT (Compliment) operation  of a Number.

import java.util.Scanner;

public class BitwiseNOT {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Bitwise NOT Compliment Operator");
        System.out.print("Enter your Number: ");
        int num = input.nextInt();

        int result = ~num;

        System.out.println("Bitwise NOT of " + num + " is: " + result);
    }
}

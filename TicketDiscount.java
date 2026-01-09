// Program to check a Ticket Discount.

import java.util.Scanner;

public class TicketDiscount {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Ticket Discount Calculator");

        System.out.print("Enter your age: ");
        int age = input.nextInt();

        System.out.print("Are you female? (true/false): ");
        boolean isFemale = input.nextBoolean();

        if (age < 5) {
            System.out.println("You get a 75% discount.");
        } 
        else if (isFemale) {
            System.out.println("You get a 60% discount.");
        } 
        else if (age > 60) {
            System.out.println("You get a 25% discount.");
        } 
        else {
            System.out.println("Sorry, you do not get any discount.");
        }

        input.close();
    }
}

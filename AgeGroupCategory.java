//Program that categorizes people into different age groups based on their age.

import java.util.Scanner;

public class AgeGroupCategory {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Age Group Identifier");
        System.out.print("Enter Your Age: ");

        int age = input.nextInt();

        if (age <= 2) {
            System.out.println("You are an Infant.");
        }
        else if (age <= 12) {
            System.out.println("You are a Child.");
        }
        else if (age <= 19) {
            System.out.println("You are a Teenager.");
        }
        else if (age <= 35) {
            System.out.println("You are a Young Adult.");
        }
        else if (age <= 59) {
            System.out.println("You are an Adult.");
        }
        else {
            System.out.println("You are a Senior Citizen.");
        }
        input.close();
    }
}

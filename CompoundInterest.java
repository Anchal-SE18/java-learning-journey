// Program to Calculate Compound Interest.

import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Compound Interest Calculator\n");

        System.out.print("Enter your Principal Amount (Rs): ");
        // int Principle = input.nextInt();
        double Principal = input.nextDouble();

        System.out.print("Enter your rate of interest (%): ");
        // float rate = input.nextFloat();
        double rate = input.nextDouble();

        System.out.print("Enter the Number of Years: ");
        // float years = input.nextFloat();
        double years = input.nextDouble();

        // double CompInt = Principle * Math.pow((1 + rate / 100), years);
        // System.out.println("Your Compound Interest is Rs: " + CompInt);

        // Compound Interest Formula
        double amount = Principal * Math.pow((1 + rate / 100), years);
        double compoundInterest = amount - Principal;

        System.out.println("\nFinal Amount: Rs " + amount);
        System.out.println("Compound Interest: Rs " + compoundInterest);

        input.close();
    }
}

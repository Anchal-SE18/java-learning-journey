// Program to Finance Calculator.

import java.util.Scanner;

public class FinanceCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int choice;

        while (true) {

            System.out.println("\n===== FINANCE CALCULATOR =====");
            System.out.println("1. Simple Interest");
            System.out.println("2. Compound Interest");
            System.out.println("3. EMI Calculator");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = input.nextInt();

            switch (choice) {

                case 1:
                    // Simple Interest
                    System.out.print("Enter Principal Amount (Rs): ");
                    double p1 = input.nextDouble();

                    System.out.print("Enter Rate of Interest (%): ");
                    double r1 = input.nextDouble();

                    System.out.print("Enter Time (in years): ");
                    double t1 = input.nextDouble();

                    double simpleInterest = (p1 * r1 * t1) / 100;
                    System.out.println("Simple Interest: Rs " + simpleInterest);
                    break;

                case 2:
                    // Compound Interest
                    System.out.print("Enter Principal Amount (Rs): ");
                    double p2 = input.nextDouble();

                    System.out.print("Enter Rate of Interest (%): ");
                    double r2 = input.nextDouble();

                    System.out.print("Enter Time (in years): ");
                    double t2 = input.nextDouble();

                    double amount = p2 * Math.pow((1 + r2 / 100), t2);
                    double compoundInterest = amount - p2;

                    System.out.println("Final Amount: Rs " + amount);
                    System.out.println("Compound Interest: Rs " + compoundInterest);
                    break;

                case 3:
                    // EMI Calculator
                    System.out.print("Enter Loan Amount (Rs): ");
                    double loan = input.nextDouble();

                    System.out.print("Enter Annual Interest Rate (%): ");
                    double annualRate = input.nextDouble();

                    System.out.print("Enter Loan Tenure (in years): ");
                    int years = input.nextInt();

                    double monthlyRate = annualRate / (12 * 100);
                    int months = years * 12;

                    double emi = (loan * monthlyRate * Math.pow(1 + monthlyRate, months))
                            / (Math.pow(1 + monthlyRate, months) - 1);

                    System.out.println("Monthly EMI: Rs " + emi);
                    break;

                case 4:
                    System.out.println("Thank you for using Finance Calculator!");
                    input.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
 

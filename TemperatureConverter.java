// Program of Temperature Converter.

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int choice;
        double temp, result;

        do {
            System.out.println("\n--- Temperature Converter ---");
            System.out.println("1. Celsius to Fahrenheit");
            System.out.println("2. Fahrenheit to Celsius");
            System.out.println("3. Celsius to Kelvin");
            System.out.println("4. Kelvin to Celsius");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter temperature in Celsius: ");
                    temp = input.nextDouble();
                    result = (temp * 9 / 5) + 32;
                    System.out.println("Temperature in Fahrenheit: " + result);
                    break;

                case 2:
                    System.out.print("Enter temperature in Fahrenheit: ");
                    temp = input.nextDouble();
                    result = (temp - 32) * 5 / 9;
                    System.out.println("Temperature in Celsius: " + result);
                    break;

                case 3:
                    System.out.print("Enter temperature in Celsius: ");
                    temp = input.nextDouble();
                    result = temp + 273.15;
                    System.out.println("Temperature in Kelvin: " + result);
                    break;

                case 4:
                    System.out.print("Enter temperature in Kelvin: ");
                    temp = input.nextDouble();
                    result = temp - 273.15;
                    System.out.println("Temperature in Celsius: " + result);
                    break;

                case 5:
                    System.out.println("Thank you for using Temperature Converter!");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }

        } while (choice != 5);

        input.close();
    }
}


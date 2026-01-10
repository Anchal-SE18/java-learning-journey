// Program to Calculate Grades based on Percentage.

import java.util.Scanner;
public class Grades {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("WWelcome to Grade Calculator");
        System.out.print("Enter your Percentange: ");

        float percentange = input.nextFloat();

        if (percentange >= 90) {
            System.out.println("You have got A+ Grade");
        }
        else if (percentange >= 80) {
            System.out.println("You have got A Grade");
        }
        else if (percentange >= 70) {
            System.out.println("You have got B Grade");
        }
        else if (percentange >= 60) {
            System.out.println("You have got C Grade");
        }
        else if (percentange >= 40) {
            System.out.println("You have got D Grade");
        }
        else if (percentange >= 30) {
            System.out.println("You have got E Grade");
        }
        else {
            System.out.println("Fail (Percentage is less than 30)");
        }

        input.close();
    }
}

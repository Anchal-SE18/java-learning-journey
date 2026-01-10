// Program to check if a Year is a Leap Year. (but the condition is divisible by 4 but not 100, or divisible by 400)

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a year that you want to check: ");
        int year = input.nextInt();

        // Leap Year condition
        
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println(year + " is a Leap year.");
        } 
        else {
            System.out.println(year + " is not a Leap year.");
        }
        input.close();
    }
}

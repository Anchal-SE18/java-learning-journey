// Taking input 5 times and print it (Store data and use it).

import java.util.Scanner;

public class InputFiveNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sum = 0;
        int i = 1;

        while (i <= 5) {
            System.out.print("Enter number " + i + ": ");
            int inp = input.nextInt();
            sum += inp;
            i++;
        }

        System.out.println("Total sum: " + sum);

        input.close();
    }
}
//program to find the sum of numbers from 1 to 100 using a loop.

public class Sum1To100 {
    public static void main(String[] args) {
        int sum = 0;
        int number = 1;
        while (number <= 100) {
            sum += number;
            number++;
        }
        System.out.println("The sum of numbers from 1 to 100 is: " + sum);
    }
}

//Program to Print Numbers 1 to 100 in Columns.

public class WhileLoop {

    public static void main(String[] args) {

        int number = 1;

        while (number <= 100) {

            // Print number with fixed width for column alignment
            System.out.printf("%4d", number);

            // Move to next line after every 10 numbers
            if (number % 10 == 0) {
                System.out.println();
            }

            number++;
        }
    }
}

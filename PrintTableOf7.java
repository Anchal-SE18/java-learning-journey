// Program to print the multiplication table of 7 using a while loop.

public class PrintTableOf7 {
    public static void main(String[] args) {
        int number = 7;
        int i = 1;
        while (i <= 10) {
            System.out.println(number + " X " + i + " = " + (number * i));
            i++;
        }
    }
}

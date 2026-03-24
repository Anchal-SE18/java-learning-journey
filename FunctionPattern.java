// program to print Triangle Star Pattern using Function.

public class FunctionPattern {
    public static void main(String[] args) {
        printFirstPattern();
    }

    public static void printFirstPattern() {
        int rows = 0;

        while (rows < 5) {
            int i = 0;

            while (i <= rows) {
                System.out.print("* ");
                i++;
            }

            System.out.println();
            rows++;
        }

    }
}

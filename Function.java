//Program to demonstrate method calling

public class Function {
    public static void main(String[] args) {
        System.out.println("In main method");
        greetuser();
        System.out.println("Method calling complete");
        greetuser();
    }

    public static void greetuser() {
        System.out.println("Good Morning From My side");
    }
}

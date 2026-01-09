// Program to Number Guessing Game.

import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int choice;

        do {
            System.out.println("\n GAME MENU ");
            System.out.println("1. Start Game");
            System.out.println("2. Game Rules");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {

                case 1:
                    int number = random.nextInt(100) + 1;
                    int guess, attempts = 0;

                    System.out.println("\n Guess a number between 1 and 100");

                    do {
                        System.out.print("Enter your guess: ");
                        guess = input.nextInt();
                        attempts++;

                        if (guess > number) {
                            System.out.println("Too High!");
                        } else if (guess < number) {
                            System.out.println("Too Low!");
                        } else {
                            System.out.println(" Congratulations!");
                            System.out.println("You guessed the number in " + attempts + " attempts.");
                        }
                    } while (guess != number);
                    break;

                case 2:
                    System.out.println("\n GAME RULES");
                    System.out.println("1. The system generates a random number between 1 and 100.");
                    System.out.println("2. You need to guess the correct number.");
                    System.out.println("3. The game will guide you with hints.");
                    System.out.println("4. Game ends when you guess correctly.");
                    break;

                case 3:
                    System.out.println("\nThank you for playing the game!");
                    break;

                default:
                    System.out.println("\nInvalid choice! Please try again.");
            }

        } while (choice != 3);

        input.close();
    }
}

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int secretNumber = random.nextInt(100) + 1; // Generate a random number between 1 and 100

        System.out.println("Oasis Infobyte Task_02:");
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Think a number between 1 and 100.");

        int attempts = 0;
        boolean isCorrect = false;

        while (!isCorrect) {
            System.out.print("Take a guess: ");
            int guess = scanner.nextInt();
            attempts++;
            if (guess == secretNumber) {
                isCorrect = true;
                System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
            } else if (guess < secretNumber) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }
        }

        scanner.close();
        System.out.println("Thank you for playing the Number Guessing Game!");
    }
}
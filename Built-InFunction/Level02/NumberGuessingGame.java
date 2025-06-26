import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int low = 1, high = 100;
        boolean correct = false;

        while (!correct) {
            int guess = generateGuess(low, high);
            System.out.println("Computer guesses: " + guess);
            System.out.println("Is the guess (1) Correct, (2) Too High, or (3) Too Low?");
            int feedback = scanner.nextInt();

            if (feedback == 1) {
                correct = true;
                System.out.println("The computer guessed your number!");
            } else if (feedback == 2) {
                high = guess - 1;
            } else if (feedback == 3) {
                low = guess + 1;
            }
        }
    }

    public static int generateGuess(int low, int high) {
        return low + (int) (Math.random() * (high - low + 1));
    }
}
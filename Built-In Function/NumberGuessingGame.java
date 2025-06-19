import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    private static final int LOWER_BOUND = 1;
    private static final int UPPER_BOUND = 100;
    private static Random random = new Random();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Think of a number between " + LOWER_BOUND + " and " + UPPER_BOUND + ".");
        System.out.println("I will try to guess it!");
        int low = LOWER_BOUND;
        int high = UPPER_BOUND;
        boolean found = false;
        while (!found && low <= high) {
            int guess = generateGuess(low, high);
            System.out.println("Is your number " + guess + "? (Enter 'high', 'low', or 'correct')");
            String feedback = getUserFeedback();
            if (feedback.equals("correct")) {
                System.out.println("Yay! I guessed your number: " + guess);
                found = true;
            } else if (feedback.equals("low")) {
                low = guess + 1;
            } else if (feedback.equals("high")) {
                high = guess - 1;
            } else {
                System.out.println("Invalid input. Please enter 'high', 'low', or 'correct'.");
            }
        }
        if (!found) {
            System.out.println("Hmm, something went wrong. Are you sure you followed the rules?");
        }
    }

    private static int generateGuess(int low, int high) {
        return low + random.nextInt(high - low + 1);
    }

    private static String getUserFeedback() {
        return scanner.nextLine().trim().toLowerCase();
    }
}


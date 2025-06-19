import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        String input = getInput();
        boolean isPalindrome = checkPalindrome(input);
        displayResult(input, isPalindrome);
    }

    private static String getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to check if it is a palindrome: ");
        return scanner.nextLine();
    }

    private static boolean checkPalindrome(String str) {
        String cleaned = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int left = 0, right = cleaned.length() - 1;
        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    private static void displayResult(String input, boolean isPalindrome) {
        if (isPalindrome) {
            System.out.println('"' + input + '"' + " is a palindrome.");
        } else {
            System.out.println('"' + input + '"' + " is not a palindrome.");
        }
    }
}


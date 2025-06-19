import java.util.Scanner;

public class FactorialRecursive {
    public static void main(String[] args) {
        int number = getInput();
        long result = factorial(number);
        displayResult(number, result);
    }

    private static int getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to calculate its factorial: ");
        return scanner.nextInt();
    }

    private static long factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }

    private static void displayResult(int number, long result) {
        System.out.println("Factorial of " + number + " is: " + result);
    }
}


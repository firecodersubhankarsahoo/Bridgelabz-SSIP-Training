import java.util.Scanner;

public class FibonacciSequenceGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms for the Fibonacci sequence: ");
        int terms = scanner.nextInt();
        printFibonacciSequence(terms);
    }

    private static void printFibonacciSequence(int n) {
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }
        int a = 0, b = 1;
        System.out.print("Fibonacci Sequence: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + (i < n ? ", " : "\n"));
            int next = a + b;
            a = b;
            b = next;
        }
    }
}


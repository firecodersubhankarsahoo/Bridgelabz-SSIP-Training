import java.util.Scanner;
public class _14_sum_natural_number_using_for_loop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if (n <= 0) {
            System.out.println("Please enter a natural number.");
            return;
        }
        int sumLoop = 0;
        for (int i = 1; i <= n; i++) {
            sumLoop += i;
        }
        int sumFormula = n * (n + 1) / 2;
        System.out.println("Sum using loop: " + sumLoop);
        System.out.println("Sum using formula: " + sumFormula);
        if (sumLoop == sumFormula) {
            System.out.println("Both results are correct and match.");
        } else {
            System.out.println("Mismatch in results.");
        }
    }
}

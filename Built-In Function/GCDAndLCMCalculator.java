import java.util.Scanner;

public class GCDAndLCMCalculator {
    public static void main(String[] args) {
        int[] numbers = getInput();
        int gcd = calculateGCD(numbers[0], numbers[1]);
        int lcm = calculateLCM(numbers[0], numbers[1], gcd);
        displayResult(numbers[0], numbers[1], gcd, lcm);
    }

    private static int[] getInput() {
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[2];
        System.out.print("Enter the first number: ");
        nums[0] = scanner.nextInt();
        System.out.print("Enter the second number: ");
        nums[1] = scanner.nextInt();
        return nums;
    }

    private static int calculateGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a);
    }

    private static int calculateLCM(int a, int b, int gcd) {
        return Math.abs(a * b) / gcd;
    }

    private static void displayResult(int a, int b, int gcd, int lcm) {
        System.out.println("GCD of " + a + " and " + b + " is: " + gcd);
        System.out.println("LCM of " + a + " and " + b + " is: " + lcm);
    }
}


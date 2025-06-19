import java.util.Scanner;

public class MaximumOfThree {
    public static void main(String[] args) {
        int[] numbers = getThreeIntegers();
        int max = findMaximum(numbers[0], numbers[1], numbers[2]);
        System.out.println("The maximum of the three numbers is: " + max);
    }

    private static int[] getThreeIntegers() {
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[3];
        System.out.print("Enter the first integer: ");
        nums[0] = scanner.nextInt();
        System.out.print("Enter the second integer: ");
        nums[1] = scanner.nextInt();
        System.out.print("Enter the third integer: ");
        nums[2] = scanner.nextInt();
        return nums;
    }

    private static int findMaximum(int a, int b, int c) {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }
}


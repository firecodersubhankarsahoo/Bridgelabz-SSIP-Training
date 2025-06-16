import java.util.*;

public class _2_Positive_Negative_Even_Odd_and_Compare_First_Last {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            if (arr[i] > 0) {
                if (arr[i] % 2 == 0) System.out.println(arr[i] + " is positive even");
                else System.out.println(arr[i] + " is positive odd");
            } else if (arr[i] < 0) {
                System.out.println(arr[i] + " is negative");
            } else {
                System.out.println(arr[i] + " is zero");
            }
        }

        if (arr[0] == arr[4]) System.out.println("First and last elements are equal");
        else if (arr[0] > arr[4]) System.out.println("First element is greater");
        else System.out.println("Last element is greater");

    }
}

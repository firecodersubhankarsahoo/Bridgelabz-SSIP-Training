import java.util.*;

public class _3_odd_and_even_arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if (number <= 0) {
            System.out.println("Not a natural number");
            return;
        }

        int[] even = new int[number / 2 + 1];
        int[] odd = new int[number / 2 + 1];
        int ei = 0, oi = 0;

        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) even[ei++] = i;
            else odd[oi++] = i;
        }

        System.out.print("Even: ");
        for (int i = 0; i < ei; i++) System.out.print(even[i] + " ");
        System.out.println();
        System.out.print("Odd: ");
        for (int i = 0; i < oi; i++) System.out.print(odd[i] + " ");

    }
}

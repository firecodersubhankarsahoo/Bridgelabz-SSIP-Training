import java.util.*;

public class _15_array_in_reverse_order {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int temp = number;

        int count = 0;
        while (temp > 0) {
            temp /= 10;
            count++;
        }

        int[] digits = new int[count];
        for (int i = 0; i < count; i++) {
            digits[i] = number % 10;
            number /= 10;
        }

        System.out.print("Reversed Number: ");
        for (int i = 0; i < count; i++) {
            System.out.print(digits[i]);
        }

    }
}

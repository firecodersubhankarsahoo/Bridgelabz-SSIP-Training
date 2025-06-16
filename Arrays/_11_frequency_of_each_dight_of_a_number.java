import java.util.*;

public class _11_frequency_of_each_dight_of_a_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int[] freq = new int[10];

        while (number > 0) {
            int digit = number % 10;
            freq[digit]++;
            number /= 10;
        }

        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                System.out.println("Digit " + i + " appears " + freq[i] + " times");
            }
        }

    }
}

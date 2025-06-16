import java.util.*;

public class _19_largest_and_second_largest_element_of_the_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int[] digits = new int[10];
        int index = 0;

        while (number > 0 && index < 10) {
            digits[index++] = number % 10;
            number /= 10;
        }

        int largest = -1, second = -1;

        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                second = largest;
                largest = digits[i];
            } else if (digits[i] > second && digits[i] != largest) {
                second = digits[i];
            }
        }

        System.out.println("Largest: " + largest + ", Second Largest: " + second);

    }
}

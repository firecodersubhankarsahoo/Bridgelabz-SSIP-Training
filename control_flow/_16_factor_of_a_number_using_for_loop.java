import java.util.*;

public class _16_factor_of_a_number_using_for_loop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        for (int i = 1; i <= number/2; i++) {
            if (number % i == 0) {
                System.out.println(i);
            }
        }

    }
}

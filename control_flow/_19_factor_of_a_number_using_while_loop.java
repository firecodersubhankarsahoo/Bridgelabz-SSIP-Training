import java.util.*;

public class _19_factor_of_a_number_using_while_loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int i = 1;
        while (i < number) {
            if (number % i == 0) {
                System.out.println(i);
            }
            i++;
        }

    }
}


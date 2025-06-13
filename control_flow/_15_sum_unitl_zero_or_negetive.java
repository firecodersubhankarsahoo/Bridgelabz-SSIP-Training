import java.util.*;

public class _15_sum_unitl_zero_or_negetive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        while (true) {
            int num = input.nextInt();
            if (num <= 0) break;
            sum += num;
        }
        System.out.println("Total sum is: " + sum);

    }
}



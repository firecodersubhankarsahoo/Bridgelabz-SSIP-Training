import java.util.*;

public class _6_store_multiple_values_in_an_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] arr = new double[10];
        int index = 0;

        while (true) {
            double val = sc.nextDouble();
            if (val <= 0 || index == 10) break;
            arr[index++] = val;
        }
        double sum = 0;
        for (int i = 0; i < index; i++) {
            System.out.println("Value: " + arr[i]);
            sum += arr[i];
        }

        System.out.println("Total Sum = " + sum);

    }
}

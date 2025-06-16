import java.util.*;

public class _7_Multiplication_Table_from_6_to_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int[] result = new int[4];

        for (int i = 0; i < 4; i++) {
            result[i] = number * (i + 6);
        }

        for (int i = 0; i < 4; i++) {
            System.out.println(number + " * " + (i + 6) + " = " + result[i]);
        }

    }
}

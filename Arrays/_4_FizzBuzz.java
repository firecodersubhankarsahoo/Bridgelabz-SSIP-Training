import java.util.*;

public class _4_FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num < 0) return;

        String[] result = new String[num + 1];

        for (int i = 0; i <= num; i++) {
            if (i % 3 == 0 && i % 5 == 0) result[i] = "FizzBuzz";
            else if (i % 3 == 0) result[i] = "Fizz";
            else if (i % 5 == 0) result[i] = "Buzz";
            else result[i] = Integer.toString(i);
        }

        for (int i = 0; i <= num; i++) {
            System.out.println("Position " + i + " = " + result[i]);
        }

    }
}

import java.util.*;

public class _38_Abundant_Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) sum += i;
        }
        if (sum > number) System.out.println("Abundant Number");
        else System.out.println("Not Abundant");

    }
}

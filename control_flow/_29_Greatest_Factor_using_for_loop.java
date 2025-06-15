import java.util.*;

public class _29_Greatest_Factor_using_for_loop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int greatestFactor = 1;

        for (int i = number - 1; i >= 1; i--) {
            if (number % i == 0) {
                greatestFactor = i;
                break;
            }
        }

        System.out.println("Greatest factor: " + greatestFactor);

    }
}

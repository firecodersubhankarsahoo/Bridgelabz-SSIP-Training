import java.util.*;

public class _23_Power_using_while_loop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int power = input.nextInt();
        int result = 1, counter = 0;
        while (counter < power) {
            result *= number;
            counter++;
        }
        System.out.println("Result: " + result);

    }
}

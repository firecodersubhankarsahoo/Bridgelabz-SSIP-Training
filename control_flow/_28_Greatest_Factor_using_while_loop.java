import java.util.*;

public class _28_Greatest_Factor_using_while_loop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int counter = number - 1;
        int greatestFactor = 1;

        while (counter >= 1) {
            if (number % counter == 0) {
                greatestFactor = counter;
                break;
            }
            counter--;
        }

        System.out.println("Greatest factor: " + greatestFactor);

    }
}

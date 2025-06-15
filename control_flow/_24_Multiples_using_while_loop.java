import java.util.*;

public class _24_Multiples_using_while_loop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int counter = number - 1;
        while (counter > 1) {
            if (number % counter == 0) {
                System.out.println(counter);
            }
            counter--;
        }

    }
}

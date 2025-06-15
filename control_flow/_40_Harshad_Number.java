import java.util.*;

public class _40_Harshad_Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int original = number, sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        if (original % sum == 0) System.out.println("Harshad Number");
        else System.out.println("Not Harshad");

    }
}

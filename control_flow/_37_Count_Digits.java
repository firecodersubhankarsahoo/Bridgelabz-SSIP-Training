import java.util.*;

public class _37_Count_Digits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int count = 0;
        while (number != 0) {
            number /= 10;
            count++;
        }
        System.out.println("Digits: " + count);

    }
}

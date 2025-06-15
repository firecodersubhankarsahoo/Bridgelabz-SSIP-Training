import java.util.*;

public class _35_Percentage_and_Grade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int phy = input.nextInt();
        int chem = input.nextInt();
        int math = input.nextInt();

        int total = phy + chem + math;
        double percentage = total / 3.0;
        System.out.println("Average: " + percentage);

        if (percentage >= 90) System.out.println("Grade: A");
        else if (percentage >= 80) System.out.println("Grade: B");
        else if (percentage >= 70) System.out.println("Grade: C");
        else if (percentage >= 60) System.out.println("Grade: D");
        else System.out.println("Grade: F");

    }
}

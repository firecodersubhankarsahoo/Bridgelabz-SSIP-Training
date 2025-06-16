import java.util.*;

public class _14_calculate_the_grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int students = sc.nextInt();

        int[] phy = new int[students];
        int[] chem = new int[students];
        int[] math = new int[students];
        double[] percent = new double[students];
        char[] grade = new char[students];

        for (int i = 0; i < students; i++) {
            phy[i] = sc.nextInt();
            chem[i] = sc.nextInt();
            math[i] = sc.nextInt();

            if (phy[i] < 0 || chem[i] < 0 || math[i] < 0) {
                System.out.println("Enter positive marks");
                i--;
                continue;
            }

            percent[i] = (phy[i] + chem[i] + math[i]) / 3.0;

            if (percent[i] >= 90) grade[i] = 'A';
            else if (percent[i] >= 80) grade[i] = 'B';
            else if (percent[i] >= 70) grade[i] = 'C';
            else if (percent[i] >= 60) grade[i] = 'D';
            else grade[i] = 'F';
        }

        for (int i = 0; i < students; i++) {
            System.out.println("Student " + (i+1) + ": % = " + percent[i] + ", Grade = " + grade[i]);
        }

    }
}

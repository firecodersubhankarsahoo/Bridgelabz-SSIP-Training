import java.util.*;

public class _16_compute_the_percentage_and_grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int students = sc.nextInt();

        int[][] marks = new int[students][3];
        double[] percent = new double[students];
        char[] grade = new char[students];

        for (int i = 0; i < students; i++) {
            for (int j = 0; j < 3; j++) {
                marks[i][j] = sc.nextInt();
                if (marks[i][j] < 0) {
                    System.out.println("Enter positive mark");
                    j--;
                }
            }
            percent[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;

            if (percent[i] >= 90) grade[i] = 'A';
            else if (percent[i] >= 80) grade[i] = 'B';
            else if (percent[i] >= 70) grade[i] = 'C';
            else if (percent[i] >= 60) grade[i] = 'D';
            else grade[i] = 'F';
        }

        for (int i = 0; i < students; i++) {
            System.out.println("Student " + (i + 1) + ": % = " + percent[i] + ", Grade = " + grade[i]);
        }

    }
}

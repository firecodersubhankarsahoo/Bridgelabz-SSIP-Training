
public class _16_calculate_the_grade {
    static int[][] generateScores(int n) {
        int[][] scores = new int[n][3];
        for (int i = 0; i < n; i++) {
            scores[i][0] = (int)(Math.random() * 41) + 60; // 60 to 100
            scores[i][1] = (int)(Math.random() * 41) + 60;
            scores[i][2] = (int)(Math.random() * 41) + 60;
        }
        return scores;
    }

    static double[][] calculateStats(int[][] scores) {
        double[][] result = new double[scores.length][3]; // total, avg, percentage
        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double avg = total / 3.0;
            double percent = total / 3.0;

            result[i][0] = total;
            result[i][1] = Math.round(avg * 100.0) / 100.0;
            result[i][2] = Math.round(percent * 100.0) / 100.0;
        }
        return result;
    }

    static String[] assignGrade(double[][] stats) {
        String[] grades = new String[stats.length];
        for (int i = 0; i < stats.length; i++) {
            double p = stats[i][2];
            if (p >= 90) grades[i] = "A+";
            else if (p >= 80) grades[i] = "A";
            else if (p >= 70) grades[i] = "B";
            else if (p >= 60) grades[i] = "C";
            else grades[i] = "F";
        }
        return grades;
    }

    static void display(int[][] scores, double[][] stats, String[] grades) {
        System.out.println("Phy\tChem\tMath\tTotal\tAvg\tPercent\tGrade");
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%d\t%d\t%d\t%.0f\t%.2f\t%.2f\t%s\n",
                    scores[i][0], scores[i][1], scores[i][2],
                    stats[i][0], stats[i][1], stats[i][2], grades[i]);
        }
    }

    public static void main(String[] args) {
        int[][] scores = generateScores(5);
        double[][] stats = calculateStats(scores);
        String[] grades = assignGrade(stats);
        display(scores, stats, grades);
    }
}

public class SelectionSortScores {

    static void selectionSort(int[] scores) {
        for (int i = 0; i < scores.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < scores.length; j++) {
                if (scores[j] < scores[min]) min = j;
            }
            int temp = scores[i]; scores[i] = scores[min]; scores[min] = temp;
        }
    }

    public static void main(String[] args) {
        int[] scores = {88, 75, 95, 60, 82};
        selectionSort(scores);
        for (int score : scores) System.out.print(score + " ");
    }
}

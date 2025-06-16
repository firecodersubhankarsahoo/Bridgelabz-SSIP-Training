import java.util.*;

public class _5_Multi_Dimensional_Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];
        int[] flat = new int[rows * cols];

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                matrix[i][j] = sc.nextInt();

        int k = 0;
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                flat[k++] = matrix[i][j];

        for (int i = 0; i < k; i++)
            System.out.print(flat[i] + " ");

    }
}

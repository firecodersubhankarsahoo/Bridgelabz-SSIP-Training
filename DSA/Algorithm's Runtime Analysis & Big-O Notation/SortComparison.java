import java.util.*;

public class SortComparison {

    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            for (int j = 1; j < arr.length - i; j++)
                if (arr[j - 1] > arr[j]) {
                    int t = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = t;
                }
    }

    public static void mergeSort(int[] arr) {
        if (arr.length < 2) return;
        int mid = arr.length / 2;
        int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, arr.length);
        mergeSort(left);
        mergeSort(right);
        merge(arr, left, right);
    }

    public static void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length)
            arr[k++] = left[i] <= right[j] ? left[i++] : right[j++];
        while (i < left.length) arr[k++] = left[i++];
        while (j < right.length) arr[k++] = right[j++];
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high], i = low - 1;
        for (int j = low; j < high; j++)
            if (arr[j] < pivot)
                swap(arr, ++i, j);
        swap(arr, i + 1, high);
        return i + 1;
    }

    public static void swap(int[] arr, int i, int j) {
        int t = arr[i]; arr[i] = arr[j]; arr[j] = t;
    }

    public static void main(String[] args) {
        int[] original = new Random().ints(10000, 1, 100000).toArray();
        int[] a = Arrays.copyOf(original, original.length);
        int[] b = Arrays.copyOf(original, original.length);
        int[] c = Arrays.copyOf(original, original.length);

        bubbleSort(a);
        mergeSort(b);
        quickSort(c, 0, c.length - 1);

        System.out.println("All sorting algorithms executed.");
    }
}

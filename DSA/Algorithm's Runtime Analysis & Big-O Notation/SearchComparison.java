import java.util.*;

public class SearchComparison {
    public static boolean linearSearch(int[] arr, int target) {
        for (int num : arr)
            if (num == target)
                return true;
        return false;
    }

    public static boolean binarySearch(int[] arr, int target) {
        Arrays.sort(arr);  // Required for binary search
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target)
                return true;
            else if (arr[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] data = new Random().ints(100000, 1, 1000000).toArray();
        int target = data[500]; // Pick a known value

        System.out.println("Linear Search: " + linearSearch(data, target));
        System.out.println("Binary Search: " + binarySearch(data, target));
    }
}

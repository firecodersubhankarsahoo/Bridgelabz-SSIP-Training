public class MergeSortBookPrices {

    static void mergeSort(int[] arr, int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }

    static void merge(int[] arr, int l, int m, int r) {
        int[] L = new int[m - l + 1];
        int[] R = new int[r - m];
        for (int i = 0; i < L.length; i++) L[i] = arr[l + i];
        for (int i = 0; i < R.length; i++) R[i] = arr[m + 1 + i];

        int i = 0, j = 0, k = l;
        while (i < L.length && j < R.length) {
            arr[k++] = (L[i] <= R[j]) ? L[i++] : R[j++];
        }
        while (i < L.length) arr[k++] = L[i++];
        while (j < R.length) arr[k++] = R[j++];
    }

    public static void main(String[] args) {
        int[] prices = {500, 150, 700, 300, 450};
        mergeSort(prices, 0, prices.length - 1);
        for (int price : prices) System.out.print(price + " ");
    }
}

public class InsertionSortEmployeeIDs {

    static void insertionSort(int[] ids) {
        for (int i = 1; i < ids.length; i++) {
            int key = ids[i];
            int j = i - 1;
            while (j >= 0 && ids[j] > key) {
                ids[j + 1] = ids[j];
                j--;
            }
            ids[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] ids = {105, 102, 110, 101, 108};
        insertionSort(ids);
        for (int id : ids) System.out.print(id + " ");
    }
}

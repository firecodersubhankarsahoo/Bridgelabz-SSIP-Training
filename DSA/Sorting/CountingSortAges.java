public class CountingSortAges {

    static void countingSort(int[] ages, int min, int max) {
        int range = max - min + 1;
        int[] count = new int[range];
        int[] output = new int[ages.length];

        for (int age : ages) count[age - min]++;
        for (int i = 1; i < count.length; i++) count[i] += count[i - 1];
        for (int i = ages.length - 1; i >= 0; i--) {
            output[count[ages[i] - min] - 1] = ages[i];
            count[ages[i] - min]--;
        }

        System.arraycopy(output, 0, ages, 0, ages.length);
    }

    public static void main(String[] args) {
        int[] ages = {12, 15, 14, 10, 13, 12, 11};
        countingSort(ages, 10, 18);
        for (int age : ages) System.out.print(age + " ");
    }
}

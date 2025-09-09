import java.util.*;

public class DSASearchComparison {

    public static void main(String[] args) {
        int n = 1_000_000;
        int target = n - 1;

        List<Integer> arrayList = new ArrayList<>();
        HashSet<Integer> hashSet = new HashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();

        for (int i = 0; i < n; i++) {
            arrayList.add(i);
            hashSet.add(i);
            treeSet.add(i);
        }

        long startArray = System.currentTimeMillis();
        boolean foundArray = arrayList.contains(target);
        long endArray = System.currentTimeMillis();
        System.out.println("ArrayList Search Time: " + (endArray - startArray) + "ms");

        long startHash = System.currentTimeMillis();
        boolean foundHash = hashSet.contains(target);
        long endHash = System.currentTimeMillis();
        System.out.println("HashSet Search Time: " + (endHash - startHash) + "ms");

        long startTree = System.currentTimeMillis();
        boolean foundTree = treeSet.contains(target);
        long endTree = System.currentTimeMillis();
        System.out.println("TreeSet Search Time: " + (endTree - startTree) + "ms");
    }
}

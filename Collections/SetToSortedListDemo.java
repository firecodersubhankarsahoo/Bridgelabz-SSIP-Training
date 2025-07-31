import java.util.*;

public class SetToSortedListDemo {
    public static List<Integer> convertSetToSortedList(Set<Integer> set) {
        List<Integer> sortedList = new ArrayList<>(set);
        Collections.sort(sortedList);
        return sortedList;
    }

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>(Arrays.asList(5, 3, 9, 1));
        List<Integer> sortedList = convertSetToSortedList(set);
        System.out.println("Sorted List: " + sortedList);
    }
}


import java.util.*;

public class RemoveDuplicatesDemo {
    public static <T> List<T> removeDuplicates(List<T> list) {
        Set<T> seen = new LinkedHashSet<>();
        seen.addAll(list);
        return new ArrayList<>(seen);
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 1, 2, 2, 3, 4);
        List<Integer> result = removeDuplicates(numbers);
        System.out.println("List after removing duplicates: " + result);
    }
}


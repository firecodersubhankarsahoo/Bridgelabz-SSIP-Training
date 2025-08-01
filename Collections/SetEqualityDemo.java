import java.util.*;

public class SetEqualityDemo {
    public static <T> boolean areSetsEqual(Set<T> set1, Set<T> set2) {
        return set1.equals(set2);
    }

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 2, 1));
        boolean result = areSetsEqual(set1, set2);
        System.out.println("Are sets equal? " + result);
    }
}


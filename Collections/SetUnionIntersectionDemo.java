import java.util.*;

public class SetUnionIntersectionDemo {
    public static <T> Set<T> union(Set<T> set1, Set<T> set2) {
        Set<T> result = new HashSet<>(set1);
        result.addAll(set2);
        return result;
    }

    public static <T> Set<T> intersection(Set<T> set1, Set<T> set2) {
        Set<T> result = new HashSet<>(set1);
        result.retainAll(set2);
        return result;
    }

    public static <T> Set<T> symmetricDifference(Set<T> set1, Set<T> set2) {
        Set<T> result = new HashSet<>(set1);
        result.addAll(set2);
        Set<T> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        result.removeAll(intersection);
        return result;
    }

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5));
        Set<Integer> unionSet = union(set1, set2);
        Set<Integer> intersectionSet = intersection(set1, set2);
        Set<Integer> symmetricDiffSet = symmetricDifference(set1, set2);
        System.out.println("Union: " + unionSet);
        System.out.println("Intersection: " + intersectionSet);
        System.out.println("Symmetric Difference: " + symmetricDiffSet);
    }
}

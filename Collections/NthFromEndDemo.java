import java.util.*;

public class NthFromEndDemo {
    public static <T> T findNthFromEnd(LinkedList<T> list, int n) {
        Iterator<T> first = list.iterator();
        Iterator<T> second = list.iterator();
        int count = 0;
        while (count < n && first.hasNext()) {
            first.next();
            count++;
        }
        if (count < n) return null; // n is larger than list size
        while (first.hasNext()) {
            first.next();
            second.next();
        }
        return second.next();
    }

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(Arrays.asList("A", "B", "C", "D", "E"));
        int n = 2;
        String result = findNthFromEnd(list, n);
        System.out.println(n + "th element from end: " + result);
    }
}


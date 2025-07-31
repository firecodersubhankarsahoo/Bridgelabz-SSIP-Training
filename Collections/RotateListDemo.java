import java.util.*;

public class RotateListDemo {
    public static <T> void rotateList(List<T> list, int positions) {
        int n = list.size();
        positions = positions % n;
        if (positions == 0) return;
        List<T> rotated = new ArrayList<>();
        rotated.addAll(list.subList(positions, n));
        rotated.addAll(list.subList(0, positions));
        for (int i = 0; i < n; i++) {
            list.set(i, rotated.get(i));
        }
    }

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
        rotateList(numbers, 2);
        System.out.println("Rotated List: " + numbers);
    }
}


import java.util.*;

public class ReverseQueueDemo {
    public static <T> void reverseQueue(Queue<T> queue) {
        if (queue.isEmpty()) return;
        T item = queue.remove();
        reverseQueue(queue);
        queue.add(item);
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        System.out.println("Original Queue: " + queue);
        reverseQueue(queue);
        System.out.println("Reversed Queue: " + queue);
    }
}


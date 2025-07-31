import java.util.*;

public class StackUsingQueuesDemo {
    static class StackUsingQueues<T> {
        private Queue<T> q1 = new LinkedList<>();
        private Queue<T> q2 = new LinkedList<>();

        // Push element onto stack
        public void push(T x) {
            q2.add(x);
            while (!q1.isEmpty()) {
                q2.add(q1.remove());
            }
            Queue<T> temp = q1;
            q1 = q2;
            q2 = temp;
        }

        // Pop element from stack
        public T pop() {
            if (q1.isEmpty()) throw new NoSuchElementException("Stack is empty");
            return q1.remove();
        }

        // Get top element
        public T top() {
            if (q1.isEmpty()) throw new NoSuchElementException("Stack is empty");
            return q1.peek();
        }

        // Check if stack is empty
        public boolean isEmpty() {
            return q1.isEmpty();
        }
    }

    public static void main(String[] args) {
        StackUsingQueues<Integer> stack = new StackUsingQueues<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("Top: " + stack.top()); // Output: 3
        System.out.println("Pop: " + stack.pop()); // Output: 3
        System.out.println("Top after pop: " + stack.top()); // Output: 2
    }
}


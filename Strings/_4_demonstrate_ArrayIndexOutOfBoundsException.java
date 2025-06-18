import java.util.Scanner;
public class _4_demonstrate_ArrayIndexOutOfBoundsException {
    static void generateException(String[] arr) {
        System.out.println(arr[arr.length]);
    }

    static void handleException(String[] arr) {
        try {
            System.out.println(arr[arr.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Handled ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Handled Exception: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        String[] names = {"Alice", "Bob", "Charlie"};
        // generateException(names);
        handleException(names);
    }
}

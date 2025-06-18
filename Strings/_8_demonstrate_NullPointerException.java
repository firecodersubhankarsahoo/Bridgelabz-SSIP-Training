import java.util.*;
public class _8_demonstrate_NullPointerException {
    static void generateException() {
        String text = null;
        System.out.println(text.length());
    }

    static void handleException() {
        try {
            String text = null;
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("Handled NullPointerException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Handled Exception: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // generateException();
        handleException();
    }
}

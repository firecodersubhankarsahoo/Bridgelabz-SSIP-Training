import java.util.Scanner;
public class _10_demonstrate_IllegalArgumentException {
    static void generateException(String s) {
        System.out.println(s.substring(5, 2)); // Invalid range
    }

    static void handleException(String s) {
        try {
            System.out.println(s.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("Handled IllegalArgumentException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Handled Exception: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.next();

        // generateException(input);
        handleException(input);
    }
}

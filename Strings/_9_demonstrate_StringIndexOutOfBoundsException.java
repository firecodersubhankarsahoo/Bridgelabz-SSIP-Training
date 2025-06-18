


import java.util.Scanner;

public class _9_demonstrate_StringIndexOutOfBoundsException {
    static void generateException(String s) {
        System.out.println(s.charAt(s.length())); // Invalid index
    }

    static void handleException(String s) {
        try {
            System.out.println(s.charAt(s.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Handled StringIndexOutOfBoundsException: " + e.getMessage());
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

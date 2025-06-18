
import java.util.*;
public class _7_characters_in_a_string {
    static char[] manualToCharArray(String text) {
        char[] result = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            result[i] = text.charAt(i);
        }
        return result;
    }

    static boolean compareCharArrays(char[] a, char[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.next();

        char[] manual = manualToCharArray(input);
        char[] builtin = input.toCharArray();

        boolean isSame = compareCharArrays(manual, builtin);

        System.out.println("Manual: " + Arrays.toString(manual));
        System.out.println("Built-in: " + Arrays.toString(builtin));
        System.out.println("Same? " + isSame);
    }
}

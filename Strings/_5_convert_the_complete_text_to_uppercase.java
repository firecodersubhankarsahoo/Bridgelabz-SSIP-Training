import java.util.Scanner;
public class _5_convert_the_complete_text_to_uppercase {
    static String toUpperManual(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                result += (char)(ch - 32);
            } else {
                result += ch;
            }
        }
        return result;
    }

    static boolean compareStrings(String a, String b) {
        if (a.length() != b.length()) return false;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String input = sc.nextLine();

        String upperManual = toUpperManual(input);
        String upperBuiltIn = input.toUpperCase();

        boolean isSame = compareStrings(upperManual, upperBuiltIn);

        System.out.println("Manual: " + upperManual);
        System.out.println("Built-in: " + upperBuiltIn);
        System.out.println("Same? " + isSame);
    }
}

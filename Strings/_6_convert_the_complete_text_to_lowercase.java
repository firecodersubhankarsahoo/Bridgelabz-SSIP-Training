


import java.util.Scanner;

public class _6_convert_the_complete_text_to_lowercase {
    static String toLowerManual(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                result += (char)(ch + 32);
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

        String lowerManual = toLowerManual(input);
        String lowerBuiltIn = input.toLowerCase();

        boolean isSame = compareStrings(lowerManual, lowerBuiltIn);

        System.out.println("Manual: " + lowerManual);
        System.out.println("Built-in: " + lowerBuiltIn);
        System.out.println("Same? " + isSame);
    }
}

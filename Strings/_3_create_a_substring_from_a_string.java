import java.util.Scanner;
public class _3_create_a_substring_from_a_string {
    static String manualSubstring(String s, int start, int end) {
        String res = "";
        for (int i = start; i < end && i < s.length(); i++) {
            res += s.charAt(i);
        }
        return res;
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
        System.out.print("Enter the string: ");
        String s = sc.next();
        System.out.print("Enter start index: ");
        int start = sc.nextInt();
        System.out.print("Enter end index: ");
        int end = sc.nextInt();

        String substr1 = manualSubstring(s, start, end);
        String substr2 = s.substring(start, end);

        boolean isSame = compareStrings(substr1, substr2);
        System.out.println("Manual substring: " + substr1);
        System.out.println("Built-in substring: " + substr2);
        System.out.println("Comparison result: " + isSame);
    }
}

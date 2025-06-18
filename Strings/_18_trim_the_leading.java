
import java.util.Scanner;

public class _18_trim_the_leading {
    static int[] findTrimBounds(String s) {
        int start = 0, end = s.length() - 1;
        while (start <= end && s.charAt(start) == ' ') start++;
        while (end >= start && s.charAt(end) == ' ') end--;
        return new int[]{start, end + 1}; // end is exclusive
    }

    static String substringManual(String s, int start, int end) {
        String res = "";
        for (int i = start; i < end; i++) {
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
        System.out.print("Enter string with spaces: ");
        String s = sc.nextLine();

        int[] bounds = findTrimBounds(s);
        String trimmedManual = substringManual(s, bounds[0], bounds[1]);
        String trimmedBuiltIn = s.trim();

        boolean same = compareStrings(trimmedManual, trimmedBuiltIn);

        System.out.println("Manual trim: '" + trimmedManual + "'");
        System.out.println("Built-in trim: '" + trimmedBuiltIn + "'");
        System.out.println("Same? " + same);
    }
}

import java.util.*;
public class _1_compare_two_strings {
    public static boolean compareStrings(String a, String b) {
        if (a.length() != b.length()) return false;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        boolean resultCharAt = compareStrings(a, b);
        boolean resultEquals = a.equals(b);
        System.out.println("Custom compare: " + resultCharAt);
        System.out.println("Using equals(): " + resultEquals);

    }
}


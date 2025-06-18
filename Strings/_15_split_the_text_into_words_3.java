
import java.util.Scanner;

public class _15_split_the_text_into_words_3 {
    static int getLength(String s) {
        int len = 0;
        try {
            while (true) {
                s.charAt(len);
                len++;
            }
        } catch (Exception e) {
            return len;
        }
    }

    static String[] manualSplit(String s) {
        s = s.trim();
        int len = getLength(s);
        int wordCount = 1;

        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == ' ') wordCount++;
        }

        String[] words = new String[wordCount];
        int index = 0;
        String word = "";
        for (int i = 0; i < len; i++) {
            char ch = s.charAt(i);
            if (ch == ' ') {
                if (!word.isEmpty()) {
                    words[index++] = word;
                    word = "";
                }
            } else {
                word += ch;
            }
        }
        if (!word.isEmpty()) words[index++] = word;

        String[] result = new String[index];
        System.arraycopy(words, 0, result, 0, index);
        return result;
    }

    static boolean compareArrays(String[] a, String[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String input = sc.nextLine();

        String[] manual = manualSplit(input);
        String[] builtin = input.trim().split(" ");

        boolean isSame = compareArrays(manual, builtin);

        System.out.println("Manual Split: ");
        for (String w : manual) System.out.print(w + " ");
        System.out.println("\nBuilt-in Split: ");
        for (String w : builtin) System.out.print(w + " ");

        System.out.println("\nSame? " + isSame);
    }
}

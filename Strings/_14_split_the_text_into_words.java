
import java.util.Scanner;

public class _14_split_the_text_into_words {
    static String[] splitText(String text) {
        text = text.trim();
        String[] words = new String[text.length()];
        int index = 0;
        String word = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch != ' ') {
                word += ch;
            } else if (!word.isEmpty()) {
                words[index++] = word;
                word = "";
            }
        }
        if (!word.isEmpty()) words[index++] = word;

        String[] result = new String[index];
        System.arraycopy(words, 0, result, 0, index);
        return result;
    }

    static int getLength(String word) {
        int len = 0;
        try {
            while (true) {
                word.charAt(len);
                len++;
            }
        } catch (Exception e) {
            return len;
        }
    }

    static String[][] wordWithLength(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(getLength(words[i]));
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String input = sc.nextLine();

        String[] words = splitText(input);
        String[][] wordData = wordWithLength(words);

        System.out.println("Word\tLength");
        for (String[] row : wordData) {
            System.out.println(row[0] + "\t" + Integer.parseInt(row[1]));
        }
    }
}

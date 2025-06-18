import java.util.*;
public class _20_length_of_a_string {
        static int getManualLength(String s) {
            int count = 0;
            try {
                while (true) {
                    s.charAt(count);
                    count++;
                }
            } catch (Exception e) {
                return count;
            }
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter string: ");
            String input = sc.next();

            int manualLength = getManualLength(input);
            int builtinLength = input.length();

            System.out.println("Manual length: " + manualLength);
            System.out.println("Built-in length: " + builtinLength);
        }
    }

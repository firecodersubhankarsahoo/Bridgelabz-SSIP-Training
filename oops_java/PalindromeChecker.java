public class PalindromeChecker {
    private String text;

    public PalindromeChecker(String text) {
        this.text = text;
    }

    public boolean isPalindrome() {
        String clean=text.toLowerCase();
        int left = 0;
        int right = clean.length() - 1;

        while (left < right) {
            if (clean.charAt(left) != clean.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public void displayResult() {
        if (isPalindrome()) {
            System.out.println("\"" + text + "\" is a palindrome.");
        } else {
            System.out.println("\"" + text + "\" is not a palindrome.");
        }
    }

    public static void main(String[] args) {
        PalindromeChecker checker1 = new PalindromeChecker("madam");
        checker1.displayResult();

        PalindromeChecker checker2 = new PalindromeChecker("racecar");
        checker2.displayResult();

        PalindromeChecker checker3 = new PalindromeChecker("Madam");
        checker3.displayResult();

        PalindromeChecker checker4 = new PalindromeChecker("step on no pets");
        checker4.displayResult();
    }
}

public class PalindromeString {

    static boolean isPalindrome(String text) {

        char[] textArray = text.toCharArray();
        for (int i = 0; i < textArray.length; i++) {
            if (textArray[i] != textArray[textArray.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        String text = "deed";

        if (isPalindrome(text)) {
            System.out.println("\"" + text + "\"" + " is palindrome");
        } else {
            System.out.println("\"" + text + "\"" + " is not palindrome");
        }
    }
}

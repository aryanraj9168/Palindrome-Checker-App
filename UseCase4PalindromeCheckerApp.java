public class UseCase4PalindromeCheckerApp {

    public static void main(String[] args) {

        // Input string
        String input = "radar";

        // Convert string to character array
        char[] chars = input.toCharArray();

        // Start and end pointers
        int start = 0;
        int end = chars.length - 1;

        // Assume palindrome initially
        boolean isPalindrome = true;

        // Compare characters from both ends
        while (start < end) {
            if (chars[start] != chars[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        // Display result
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}

public class UseCase9PalindromeCheckerApp {

    public static void main(String[] args) {

        // Input string
        String input = "madam";

        // Call recursive function
        boolean isPalindrome = check(input, 0, input.length() - 1);

        // Print result
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }

    // Recursive method to check palindrome
    private static boolean check(String s, int start, int end) {

        // Base condition: if pointers meet or cross
        if (start >= end) {
            return true;
        }

        // If characters do not match
        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }

        // Recursive call moving inward
        return check(s, start + 1, end - 1);
    }
}

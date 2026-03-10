public class UseCase2PalindromeCheckerApp {

    public static void main(String[] args) {

        // Hardcoded string to check
        String input = "madam";

        // Variable to store result
        boolean isPalindrome = true;

        // Loop through half of the string
        for (int i = 0; i < input.length() / 2; i++) {

            // Compare characters from start and end
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        // Print result
        System.out.println("Input text: " + input);
        System.out.println("Is it a Palindrome? : " + isPalindrome);
    }
}

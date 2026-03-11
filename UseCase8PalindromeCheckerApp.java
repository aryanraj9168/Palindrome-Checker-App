import java.util.LinkedList;

public class UseCase8PalindromeCheckerApp {

    public static void main(String[] args) {

        // Input string
        String input = "level";

        // Create LinkedList to store characters
        LinkedList<Character> list = new LinkedList<>();

        // Add each character of the string into the list
        for (char c : input.toCharArray()) {
            list.add(c);
        }

        // Assume palindrome initially
        boolean isPalindrome = true;

        // Compare first and last elements until list size <= 1
        while (list.size() > 1) {
            if (!list.removeFirst().equals(list.removeLast())) {
                isPalindrome = false;
                break;
            }
        }

        // Print result
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}

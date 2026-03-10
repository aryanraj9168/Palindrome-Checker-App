import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class UseCase6PalindromeCheckerApp {

    public static void main(String[] args) {

        // Input string
        String input = "civic";

        // Queue for FIFO order
        Queue<Character> queue = new LinkedList<>();

        // Stack for LIFO order
        Stack<Character> stack = new Stack<>();

        // Insert characters into both queue and stack
        for (char c : input.toCharArray()) {
            queue.add(c);
            stack.push(c);
        }

        // Assume palindrome initially
        boolean isPalindrome = true;

        // Compare dequeue (queue) with pop (stack)
        while (!queue.isEmpty()) {
            if (queue.remove() != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        // Print result
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}

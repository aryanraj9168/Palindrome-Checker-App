public class UseCase12PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "Level";

        // Choose strategy at runtime
        PalindromeStrategy strategy = new StackStrategy();

        boolean result = strategy.check(input);

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + result);
    }
}

/*
 Interface for palindrome checking strategies
*/
interface PalindromeStrategy {
    boolean check(String input);
}

/*
 Stack based palindrome checking strategy
*/
class StackStrategy implements PalindromeStrategy {

    public boolean check(String input) {

        // Create stack
        java.util.Stack<Character> stack = new java.util.Stack<>();

        // Push characters into stack
        for (char c : input.toLowerCase().toCharArray()) {
            stack.push(c);
        }

        // Compare with popped characters
        for (char c : input.toLowerCase().toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}

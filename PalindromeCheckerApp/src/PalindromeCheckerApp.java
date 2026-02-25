import java.util.*;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("=== UC6: Queue + Stack Palindrome Check ===");

        System.out.print("Enter a word: ");
        String input = scanner.nextLine();

        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        // Add characters to both stack and queue
        for(char c : input.toCharArray()) {
            stack.push(c);
            queue.add(c);
        }

        boolean isPalindrome = true;

        // Compare elements
        while(!stack.isEmpty()) {
            if(stack.pop() != queue.remove()) {
                isPalindrome = false;
                break;
            }
        }

        if(isPalindrome) {
            System.out.println(input + " is a Palindrome (Stack + Queue Method)");
        } else {
            System.out.println(input + " is NOT a Palindrome");
        }

        scanner.close();
    }
}
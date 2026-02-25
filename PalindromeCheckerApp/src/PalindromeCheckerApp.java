import java.util.*;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("=== UC7: Deque Based Palindrome Check ===");

        System.out.print("Enter a word: ");
        String input = scanner.nextLine();

        Deque<Character> deque = new LinkedList<>();

        // Add characters to deque
        for(char c : input.toCharArray()) {
            deque.add(c);
        }

        boolean isPalindrome = true;

        // Compare from both ends
        while(deque.size() > 1) {
            if(deque.removeFirst() != deque.removeLast()) {
                isPalindrome = false;
                break;
            }
        }

        if(isPalindrome) {
            System.out.println(input + " is a Palindrome (Deque Method)");
        } else {
            System.out.println(input + " is NOT a Palindrome");
        }

        scanner.close();
    }
}
import java.util.*;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String input = scanner.nextLine();

        Stack<Character> stack = new Stack<>();

        for(char c : input.toCharArray()) {
            stack.push(c);
        }

        String reversed = "";

        while(!stack.isEmpty()) {
            reversed += stack.pop();
        }

        if(input.equals(reversed)) {
            System.out.println("Palindrome (Stack Method)");
        } else {
            System.out.println("Not a Palindrome");
        }

        scanner.close();
    }
}
import java.util.*;

// 1. Define the Strategy Interface
interface PalindromeStrategy {
    boolean isValid(String text);
}

// 2. Implementation using a Stack (LIFO)
class StackStrategy implements PalindromeStrategy {
    public boolean isValid(String text) {
        String clean = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        Stack<Character> stack = new Stack<>();

        for (char c : clean.toCharArray()) stack.push(c);

        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) reversed.append(stack.pop());

        return clean.equals(reversed.toString());
    }
}

// 3. Implementation using a Deque (Front/Back comparison)
class DequeStrategy implements PalindromeStrategy {
    public boolean isValid(String text) {
        String clean = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        Deque<Character> deque = new LinkedList<>();

        for (char c : clean.toCharArray()) deque.addLast(c);

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) return false;
        }
        return true;
    }
}

// 4. The Context class that uses the Strategy
class PalindromeContext {
    private PalindromeStrategy strategy;

    public void setStrategy(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean executeCheck(String text) {
        return strategy.isValid(text);
    }
}

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PalindromeContext context = new PalindromeContext();

        System.out.print("Enter text: ");
        String input = sc.nextLine();

        System.out.println("Choose Strategy: 1) Stack 2) Deque");
        int choice = sc.nextInt();

        // Injecting the strategy at runtime (Polymorphism)
        if (choice == 1) context.setStrategy(new StackStrategy());
        else context.setStrategy(new DequeStrategy());

        if (context.executeCheck(input)) {
            System.out.println("Result: Valid Palindrome");
        } else {
            System.out.println("Result: Not a Palindrome");
        }
        sc.close();
    }
}
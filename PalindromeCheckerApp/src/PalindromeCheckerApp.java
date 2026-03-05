import java.util.Scanner;

class PalindromeService {
    public boolean checkPalindrome(String input) {
        if (input == null) return false;

        // Normalization logic (Reuse from UC10)
        String clean = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Logical check
        int left = 0;
        int right = clean.length() - 1;
        while (left < right) {
            if (clean.charAt(left) != clean.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PalindromeService service = new PalindromeService();

        System.out.println("--- UC11: Object-Oriented Palindrome Service ---");
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        if (service.checkPalindrome(text)) {
            System.out.println("Success: This is a palindrome!");
        } else {
            System.out.println("Failure: This is not a palindrome.");
        }

        sc.close();
    }
}
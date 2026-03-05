import java.util.Scanner;
 public class PalindromeCheckerApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- UC10: Case-Insensitive & Space-Ignored Checker ---");
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

         String cleanString = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

            if (isPalindrome(cleanString)) {
            System.out.println("Result: \"" + input + "\" IS a palindrome (ignoring case/spaces).");
        } else {
            System.out.println("Result: \"" + input + "\" IS NOT a palindrome.");
        }

        sc.close();
    }

    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
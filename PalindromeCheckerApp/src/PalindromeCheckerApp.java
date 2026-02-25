import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {
        String word = "madam";

        if (word.equals(new StringBuilder(word).reverse().toString())) {
            System.out.println(word + " is a Palindrome");
            System.out.println("=== PALINDROME CHECKER APP ===");

            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a word: ");
            String input = scanner.nextLine();

            String reversed = new StringBuilder(input).reverse().toString();

            if (input.equalsIgnoreCase(reversed)) {
                System.out.println(input + " is a Palindrome");
            } else {
                System.out.println(word + " is Not a Palindrome");
                System.out.println(input + " is NOT a Palindrome");
            }

            scanner.close();
        }
    }

}
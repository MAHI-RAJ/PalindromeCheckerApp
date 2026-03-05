import java.util.Scanner;

public class UseCase9PalindromeCheckerApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to check: ");
        String word = sc.nextLine();


        String cleanWord = word.replaceAll("\\s+", "").toLowerCase();

        if (isPalindrome(cleanWord)) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is Not a Palindrome");
        }
        sc.close();
    }

    public static boolean isPalindrome(String s) {

        if (s.length() <= 1) {
            return true;
        }

        if (s.charAt(0) == s.charAt(s.length() - 1)) {
            return isPalindrome(s.substring(1, s.length() - 1));
        }


        return false;
    }
}
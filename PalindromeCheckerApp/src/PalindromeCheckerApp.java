public class PalindromeCheckerApp {

    public static void main(String[] args) {
        System.out.println("=== PALINDROME CHECKER APP ===");
        System.out.println("Welcome User!");
        String word = "madam";

        if(word.equals(new StringBuilder(word).reverse().toString())) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is Not a Palindrome");
        }
    }
}
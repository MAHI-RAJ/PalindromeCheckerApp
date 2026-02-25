public static void main(String[] args) {

    System.out.println("=== PALINDROME CHECKER APP ===");

    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a word: ");
    String input = scanner.nextLine();

    String reversed = new StringBuilder(input).reverse().toString();
    char[] chars = input.toCharArray();
    boolean isPalindrome = true;

    for (int i = 0; i < chars.length / 2; i++) {
        if (chars[i] != chars[chars.length - 1 - i]) {
            isPalindrome = false;
            break;
        }
    }

    if (input.equalsIgnoreCase(reversed)) {
        System.out.println(input + " is a Palindrome");
        if (isPalindrome) {
            System.out.println("Palindrome (Character Array Method)");
        } else {
            System.out.println(input + " is NOT a Palindrome");
            System.out.println("Not a Palindrome");
        }

        scanner.close();
    }
}
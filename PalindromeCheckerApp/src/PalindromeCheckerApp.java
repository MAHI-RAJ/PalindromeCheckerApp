import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- UC13: Palindrome Performance Comparison ---");
        System.out.print("Enter a string to test: ");
        String input = scanner.nextLine();


        long startTime = System.nanoTime();
        boolean res1 = isPalindromeReversal(input);
        long endTime = System.nanoTime();
        long durationReversal = endTime - startTime;


        startTime = System.nanoTime();
        boolean res2 = isPalindromeTwoPointer(input);
        endTime = System.nanoTime();
        long durationTwoPointer = endTime - startTime;


        startTime = System.nanoTime();
        boolean res3 = isPalindromeRecursive(input.toLowerCase().replaceAll("[^a-zA-Z0-9]", ""));
        endTime = System.nanoTime();
        long durationRecursive = endTime - startTime;

        displayResults(input, durationReversal, durationTwoPointer, durationRecursive);

        scanner.close();
    }


    public static boolean isPalindromeReversal(String str) {
        String clean = str.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        String reversed = new StringBuilder(clean).reverse().toString();
        return clean.equals(reversed);
    }

    public static boolean isPalindromeTwoPointer(String str) {
        String clean = str.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        int left = 0;
        int right = clean.length() - 1;
        while (left < right) {
            if (clean.charAt(left) != clean.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }


    public static boolean isPalindromeRecursive(String str) {
        if (str.length() <= 1) return true;
        if (str.charAt(0) != str.charAt(str.length() - 1)) return false;
        return isPalindromeRecursive(str.substring(1, str.length() - 1));
    }

    public static void displayResults(String input, long d1, long d2, long d3) {
        System.out.println("\nPerformance Results for: \"" + input + "\"");
        System.out.println("-------------------------------------------------");
        System.out.printf("%-25s | %-15s\n", "Algorithm", "Execution Time (ns)");
        System.out.println("-------------------------------------------------");
        System.out.printf("%-25s | %-15d\n", "StringBuilder Reversal", d1);
        System.out.printf("%-25s | %-15d\n", "Two-Pointer Manual", d2);
        System.out.printf("%-25s | %-15d\n", "Recursive Approach", d3);
        System.out.println("-------------------------------------------------");
    }
}
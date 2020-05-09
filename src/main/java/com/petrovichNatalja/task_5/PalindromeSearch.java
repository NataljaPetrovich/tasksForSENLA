package main.java.com.petrovichNatalja.task_5;

import java.util.Scanner;

public class PalindromeSearch {

    public static void showPalindromeNumbers() {
        System.out.println("Enter number (upper limit of sequence): ");
        Scanner scanner = new Scanner(System.in);
        int limit = scanner.nextInt();
        System.out.printf("Palindrome numbers in sequence [0;%d]: ", limit);
        for (int i = 0; i <= limit; i++) {

            if (isPalindrome(String.valueOf(i))) {
                System.out.print(i + "\t");
            }
        }
    }

    private static boolean isPalindrome(String input) {
        StringBuilder plain = new StringBuilder(input);
        StringBuilder reverse = plain.reverse();
        return (reverse.toString()).matches(input);
    }
}

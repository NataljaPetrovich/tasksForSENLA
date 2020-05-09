package main.java.com.petrovichNatalja.task_3;

import java.util.Arrays;
import java.util.Scanner;

public class StringAnalyser {
    private String stringForAnalyse;
    private String[] words;

    public StringAnalyser() {
        setStringForAnalyse();
        words = stringForAnalyse.split("\\s+");
    }

    private void setStringForAnalyse() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your text: ");
        stringForAnalyse = scanner.nextLine();
    }

    public void countWords() {
        System.out.println("This text contains " + words.length + " word(s)");
    }

    public void showSortedWords() {
        Arrays.stream(words)
                .map((s) -> firstLetterToUpperCase(s))
                .sorted()
                .forEach(System.out::println);
    }

    private String firstLetterToUpperCase(String string) {
        return string.substring(0, 1).toUpperCase() + string.substring(1);
    }
}

package main.java.com.petrovichNatalja.task_4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordCounter {
    private String wordForSearch;
    private String textForSearch;

    public WordCounter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter word for search: ");
        wordForSearch = scanner.nextLine();
        System.out.println("Enter text: ");
        textForSearch = scanner.nextLine();
    }

    public void countWord() {
        String regex = "\\b" + wordForSearch + "\\b";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(textForSearch);
        int counter = 0;
        while (matcher.find()) {
            counter++;
        }
        System.out.printf("Word \"%s\" appears in this text %d times", wordForSearch.toLowerCase(), counter);
    }
}

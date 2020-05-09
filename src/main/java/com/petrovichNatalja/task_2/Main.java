package main.java.com.petrovichNatalja.task_2;

public class Main {
    public static void main(String[] args) {
        NumbersAnalyser task2 = new NumbersAnalyser();
        if (task2.setNumbers()) {
            task2.showGreatestCommonFactor();
            task2.showLeastCommonMultiple();
        }
    }
}
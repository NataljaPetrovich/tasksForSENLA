package main.java.com.petrovichNatalja.task_1;

import java.util.Scanner;

public class NumberAnalyser {
    private int numberToAnalyse;

    private Boolean setNumberToAnalyse() {
        System.out.println("Enter your number: ");
        Scanner scanner = new Scanner(System.in);
        String data = scanner.nextLine();
        if (data.matches("-?\\d+")) {
            numberToAnalyse = Integer.parseInt(data);
            return true;
        } else {
            System.out.println("Required integer! ");
            return false;
        }
    }

    public void analyseNumber() {
        if (setNumberToAnalyse()) {
            isEven();
            isPrime();
        }
    }

    private void isEven() {
        System.out.print(numberToAnalyse % 2 == 0 ? "This number is even " : "This number is odd ");
    }

    private void isPrime() {
        boolean prime = true;
        if (numberToAnalyse == 1) {
            System.out.println(" and isn't prime or complex.");
        } else {
            int temp;
            for (int i = 2; i <= numberToAnalyse / 2; i++) {
                temp = numberToAnalyse % i;
                if (temp == 0) {
                    prime = false;
                    break;
                }
            }
            System.out.println(prime ? "and prime." : "and complex.");
        }
    }
}

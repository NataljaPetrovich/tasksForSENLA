package main.java.com.petrovichNatalja.task_2;

import java.util.Scanner;

public class NumbersAnalyser {
    private int numberOne;
    private int numberTwo;


    public boolean setNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        String data1 = scanner.nextLine();
        System.out.println("Enter second number: ");
        String data2 = scanner.nextLine();
        if (data1.matches("-?\\d+") && data2.matches("-?\\d+")) {
            numberOne = Integer.parseInt(data1);
            numberTwo = Integer.parseInt(data2);
            return true;
        } else {
            System.out.println("Required integer! ");
            return false;
        }
    }

    public void showGreatestCommonFactor() {
        System.out.println("Greatest common factor: " + greatestCommonFactor(numberOne, numberTwo));
    }

    private int greatestCommonFactor(int a, int b) {
        if (b == 0)
            return Math.abs(a);
        return greatestCommonFactor(b, a % b);
    }

    public void showLeastCommonMultiple() {
        int leastCommonMultiple = (Math.abs(numberOne) * Math.abs(numberTwo)) / greatestCommonFactor(numberOne, numberTwo);
        System.out.println("Least common multiple: " + leastCommonMultiple);
    }
}

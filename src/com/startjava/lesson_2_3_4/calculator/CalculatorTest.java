package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        do {
            System.out.print("Введите  математическое выражение (например, 2 * 10): ");
            String expression = scan.nextLine();
            Calculator calculator = new Calculator(expression);
            System.out.println("Результат: " + calculator.calculate());
        } while (isNext());
        scan.close();
    }

    private static boolean isNext() {
        String answer;
        do {
            System.out.print("Хотите продолжить вычисления? [yes/no]: ");
            Scanner scan = new Scanner(System.in);
            answer = scan.nextLine();
        } while (!answer.equals("yes") && !answer.equals("no"));
        return answer.equals("yes");
    }
}
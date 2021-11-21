package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        do {
            System.out.print("Введите  математическое выражение (например, 2 * 10): ");
            String expression = scan.nextLine();
            Calculator calculator = new Calculator(expression);
            System.out.println("Результат: " + calculator.calculate());
        } while (countAgain());
        scan.close();
    }

    public static boolean countAgain() {
        String answer;
        do {
            System.out.print("Хотите продолжить вычисления? [yes/no]: ");
            Scanner scan = new Scanner(System.in);
            answer = scan.nextLine();
        } while(!answer.equals("yes") && !answer.equals("no"));
        return answer.equals("yes");
    }
}
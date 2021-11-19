package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String answer;
        do {
            System.out.println("Введите  математическое выражение (например, 2 * 10): ");
            String[] expression = scan.nextLine().split(" ");
            double firstNumber = Double.parseDouble(expression[0]);
            char sign = expression[1].charAt(0);
            double secondNumber = Double.parseDouble(expression[2]);
            Calculator calculator = new Calculator(firstNumber, sign, secondNumber);
            System.out.println("Результат: " + calculator.calculate());

            do {
                System.out.println("Хотите продолжить вычисления? [yes/no]: ");
                answer = scan.nextLine();
            } while(!answer.equals("yes") && !answer.equals("no"));
        } while (!answer.equals("no"));
        scan.close();
    }
}
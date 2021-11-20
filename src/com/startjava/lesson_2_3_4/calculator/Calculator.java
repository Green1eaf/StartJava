package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

class Calculator {
    private double firstNumber;
    private char sign;
    private double secondNumber;

    public Calculator(String expression) {
        String[] expressionArray = expression.split(" ");
        firstNumber = Double.parseDouble(expressionArray[0]);
        sign = expressionArray[1].charAt(0);
        secondNumber = Double.parseDouble(expressionArray[2]);
    }

    public double calculate() {
        double result = 0;
        switch(sign) {
            case '+':
                return firstNumber + secondNumber;
            case '-':
                return firstNumber - secondNumber;
            case '*':
                return firstNumber * secondNumber;
            case '/':
                return firstNumber / secondNumber;
            case '%':
                return firstNumber % secondNumber;
            case '^':
                return Math.pow(firstNumber, secondNumber);
        }
        return result;
    }

    public boolean countAgain() {
        String answer;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.print("Хотите продолжить вычисления? [yes/no]: ");
            answer = scan.nextLine();
        } while(!answer.equals("yes") && !answer.equals("no"));
        return answer.equals("no");
    }
}
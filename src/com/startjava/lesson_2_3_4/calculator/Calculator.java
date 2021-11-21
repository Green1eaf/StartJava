package com.startjava.lesson_2_3_4.calculator;

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
}
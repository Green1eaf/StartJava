package com.startjava.lesson_2_3_4.calculator;
//
import java.util.Scanner;

public class CalculatorTest {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        do {
            System.out.print("Введите  математическое выражение (например, 2 * 10): ");
            String expression = scan.nextLine();
            Calculator calculator = new Calculator(expression);
            System.out.println("Результат: " + calculator.calculate());
            if(calculator.countAgain()) break;
        } while (true);
        scan.close();
    }
}
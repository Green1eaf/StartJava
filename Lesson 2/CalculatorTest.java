import java.util.Scanner;

public class CalculatorTest {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String answer = "";
        while (!answer.equals("no")) {
            answer = "";
            System.out.println("Введите первое число: ");
            double firstNumber = scan.nextDouble();
            scan.nextLine();
            System.out.println("Введите знак математического действия: ");
            char sign = scan.next().charAt(0);
            System.out.println("Введите второе число: ");
            double secondNumber = scan.nextDouble();
            scan.nextLine();
            Calculator calculator = new Calculator(firstNumber, sign, secondNumber);
            System.out.println("Ответ: " + calculator.calculate());

            while(!answer.equals("yes") && !answer.equals("no")) {
                System.out.println("Хотите продолжить вычисления? [yes/no]: ");
                answer = scan.nextLine();
            }
        }
        scan.close();
    }
}
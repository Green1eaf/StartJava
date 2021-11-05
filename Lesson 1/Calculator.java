import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.print("Enter first number: ");
            int firstNum = scan.nextInt();
            System.out.print("Enter arithmetic action: ");
            scan.nextLine();
            String sign = scan.nextLine();
            System.out.print("Enter second number: ");
            int secondNum = scan.nextInt();
            if(sign.equals("+")) {
                int result = firstNum + secondNum;
                System.out.println("Result = " + result);
            } else if (sign.equals("-")) {
                int result = firstNum - secondNum;
                System.out.println("Result = " + result);
            } else if (sign.equals("*")) {
                int result = firstNum * secondNum;
                System.out.println("Result = " + result);
            } else if (sign.equals("/")) {
                int result = firstNum / secondNum;
                System.out.println("Result = " + result);
            } else if (sign.equals("^")) {
                int result = firstNum;
                for (int i = 0; i < secondNum - 1; i++) {
                    if (secondNum == 0) {
                        System.out.println("Result = " + 1);
                        break;
                    }
                    result *= firstNum;
                }
                System.out.println("Result = " + result);
            } else if (sign.equals("%")) {
                int result = firstNum % secondNum;
                System.out.println("Result = " + result);
            }

            System.out.println("Do U wanna count again? [yes/no]: ");
            scan.nextLine();
            String answer = scan.nextLine();
            if (answer.equals("no")) {
                break;
            }
        }
        scan.close();
    }
}
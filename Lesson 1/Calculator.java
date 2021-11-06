import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String answer = "";

        while (!answer.equals("no")) {
            System.out.print("Enter first number: ");
            int firstNum = scan.nextInt();
            System.out.print("Enter arithmetic action: ");
            scan.nextLine();
            String sign = scan.nextLine();
            System.out.print("Enter second number: ");
            int secondNum = scan.nextInt();
            
            int result = 1;
            if(sign.equals("^") && secondNum == 0) {
            } else if(sign.equals("+")) {
                result = firstNum + secondNum;
            } else if (sign.equals("-")) {
                result = firstNum - secondNum;
            } else if (sign.equals("*")) {
                result = firstNum * secondNum;
            } else if (sign.equals("/")) {
                result = firstNum / secondNum;
            } else if (sign.equals("^")) {
                result = firstNum;
                for (int i = 0; i < secondNum - 1; i++) {
                    result *= firstNum;
                }
            } else if (sign.equals("%")) {
                result = firstNum % secondNum;
            }
            System.out.println("Result = " + result);

            System.out.println("Do U wanna count again? [yes/no]: ");
            scan.nextLine();
            answer = scan.nextLine();
        }
        scan.close();
    }
}
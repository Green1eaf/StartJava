import java.util.Scanner;

public class GuessNumber {
    
    public static void main(String[] args) {
        System.out.println("������ �����!");
        int targetNumber = (int) (Math.random() * 101);
        Scanner scan = new Scanner(System.in, "Cp1251");
        System.out.print("������� ��� ������� ������: ");
        Player firstPlayer = new Player(scan.nextLine());
        System.out.print("������� ��� ������� ������: ");
        Player secondPlayer = new Player(scan.nextLine());
        int answer = 0;

        String repeat = "";
        while(!repeat.equals("no")) {
            repeat = "";
            while(true) {
                System.out.print(firstPlayer.getName() + " ������� �����: ");
                answer = scan.nextInt();
                scan.nextLine();
                if (targetNumber < answer) {
                    System.out.println("������ ����� ������ ����, ��� ������� ���������");
                } else if (targetNumber > answer) {
                    System.out.println("������ ����� ������ ����, ��� ������� ���������");
                } else if (targetNumber == answer) {
                    System.out.println("����������! ����� " + firstPlayer.getName() + " ������ �����!");
                    break;
                }

                System.out.print(secondPlayer.getName() + " ������� �����: ");
                answer = scan.nextInt();
                scan.nextLine();
                if (targetNumber < answer) {
                    System.out.println("������ ����� ������ ����, ��� ������� ���������");
                } else if (targetNumber > answer) {
                    System.out.println("������ ����� ������ ����, ��� ������� ���������");
                } else if (targetNumber == answer) {
                    System.out.println("����������! " + secondPlayer.getName() + " ������ �����!");
                    break;
                }
            }

            while(!repeat.equals("no") && !repeat.equals("yes")) {
                System.out.println("������ ���������� ����? [yes/no]: ");
                repeat = scan.nextLine();
            }
        }
        scan.close();
    }
}
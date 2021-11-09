import java.util.Scanner;

public class GuessNumber {
    
    public static void main(String[] args) {
        System.out.println("Угадай число!");
        int targetNumber = (int) (Math.random() * 101);
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите имя первого игрока: ");
        Player firstPlayer = new Player(scan.nextLine());
        System.out.print("Введите имя второго игрока: ");
        Player secondPlayer = new Player(scan.nextLine());
        int answer = 0;

        String repeat = "";
        while(!repeat.equals("no")) {
            repeat = "";
            while(true) {
                System.out.print(firstPlayer.getName() + " введите число: ");
                answer = scan.nextInt();
                scan.nextLine();
                if (targetNumber < answer) {
                    System.out.println("Данное число больше того, что загадал компьютер");
                } else if (targetNumber > answer) {
                    System.out.println("Данное число меньше того, что загадал компьютер");
                } else if (targetNumber == answer) {
                    System.out.println("Поздравляю! " + firstPlayer.getName() + " угадал число!");
                    break;
                }

                System.out.print(secondPlayer.getName() + " введите число: ");
                answer = scan.nextInt();
                scan.nextLine();
                if (targetNumber < answer) {
                    System.out.println("Данное число больше того, что загадал компьютер");
                } else if (targetNumber > answer) {
                    System.out.println("Данное число меньше того, что загадал компьютер");
                } else if (targetNumber == answer) {
                    System.out.println("Поздравляю! " + secondPlayer.getName() + " угадал число!");
                    break;
                }
            }

            while(!repeat.equals("no") && !repeat.equals("yes")) {
                System.out.println("Хотите продолжить игру? [yes/no]: ");
                repeat = scan.nextLine();
            }
        }
        scan.close();
    }
}
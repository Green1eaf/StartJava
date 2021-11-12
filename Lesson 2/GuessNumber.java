import java.util.Scanner;

public class GuessNumber {
    private Player firstPlayer;
    private Player secondPlayer;
    private int targetNumber;
    private Scanner scan;

    public GuessNumber() {
        System.out.println("Угадай число!");
        scan = new Scanner(System.in);
        System.out.print("Введите имя первого игрока: ");
        firstPlayer = new Player(scan.nextLine());
        System.out.print("Введите имя второго игрока: ");
        secondPlayer = new Player(scan.nextLine());
    }

    public void setTargetNumber() {
        targetNumber = (int) (Math.random() * 101);
    }

    public void play() {
        while(true) {
            System.out.print(firstPlayer.getName() + " введите число: ");
            int number = scan.nextInt();
            if(compareNumbers(number)) {
                System.out.println("Поздравляю! " + firstPlayer.getName() + " угадал число!");
                break;
            }
            System.out.print(secondPlayer.getName() + " введите число: ");
            number = scan.nextInt();
            if(compareNumbers(number)) {
                System.out.println("Поздравляю! " + secondPlayer.getName() + " угадал число!");
                break;
            }
        }
    }

    private boolean compareNumbers(int number) {
        if (targetNumber < number) {
            System.out.println("Данное число больше того, что загадал компьютер");
        } else if (targetNumber > number) {
            System.out.println("Данное число меньше того, что загадал компьютер");
        } else if (targetNumber == number) {
            return true;
        }
        return false;
    }

    public boolean repeatGame() {
        scan.nextLine();
        String repeat = "";
        while(!repeat.equals("no") && !repeat.equals("yes")) {
            System.out.println("Хотите продолжить игру? [yes/no]: ");
            repeat = scan.nextLine();
        }
        if(repeat.equals("no")) scan.close();
        return repeat.equals("yes")? true : false;
    }
}
import java.util.Scanner;

public class GuessNumber {
    private Player firstPlayer;
    private Player secondPlayer;

    public GuessNumber(Player firstPlayer, Player secondPlayer) {
        this.firstPlayer = firstPlayer;
        this.secondPlayer = secondPlayer;
    }

    public void play() {
        int targetNumber = (int) (Math.random() * 101);
        Scanner scan = new Scanner(System.in);
        while(true) {
            System.out.print(firstPlayer.getName() + " введите число: ");
            int number = scan.nextInt();
            if(compareNumbers(number, targetNumber)) {
                System.out.println("Поздравляю! " + firstPlayer.getName() + " угадал число!");
                break;
            }
            System.out.print(secondPlayer.getName() + " введите число: ");
            number = scan.nextInt();
            if(compareNumbers(number, targetNumber)) {
                System.out.println("Поздравляю! " + secondPlayer.getName() + " угадал число!");
                break;
            }
        }
    }

    private boolean compareNumbers(int number, int targetNumber) {
        if (targetNumber < number) {
            System.out.println("Данное число больше того, что загадал компьютер");
        } else if (targetNumber > number) {
            System.out.println("Данное число меньше того, что загадал компьютер");
        } else if (targetNumber == number) {
            return true;
        }
        return false;
    }
}
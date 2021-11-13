import java.util.Scanner;

public class GuessNumberTest {    
    public static void main(String[] args) {
        System.out.println("Угадай число!");
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите имя первого игрока: ");
        String firstPlayerName = scan.nextLine();
        Player firstPlayer = new Player(firstPlayerName);
        System.out.print("Введите имя второго игрока: ");
        String secondPlayerName = scan.nextLine();
        Player secondPlayer = new Player(secondPlayerName);

        GuessNumber game = new GuessNumber(firstPlayer, secondPlayer);
        String repeat = "";
        do {
            game.play();
            do {
                System.out.println("Хотите продолжить игру? [yes/no]: ");
                repeat = scan.nextLine();
            } while(!repeat.equals("no") && !repeat.equals("yes"));
        } while(!repeat.equals("no"));
        scan.close();
    }
}
package com.startjava.lesson_2_3_4.game;

import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        System.out.println("Угадай число!");
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите имя первого игрока: ");
        Player firstPlayer = new Player(scan.nextLine());
        System.out.print("Введите имя второго игрока: ");
        Player secondPlayer = new Player(scan.nextLine());
        System.out.println("У каждого игрока есть 10 попыток, чтобы угадать число, которое загадал компьютер.");

        GuessNumber game = new GuessNumber(firstPlayer, secondPlayer);
        String repeat;
        do {
            game.play();
            game.getAllAttempts(firstPlayer);
            game.getAllAttempts(secondPlayer);
            do {
                System.out.print("Хотите продолжить игру? [yes/no]: ");
                repeat = scan.nextLine();
            } while (!repeat.equals("no") && !repeat.equals("yes"));
            if (repeat.equals("yes")) game.resetGame();
        } while (!repeat.equals("no"));
        scan.close();
    }
}
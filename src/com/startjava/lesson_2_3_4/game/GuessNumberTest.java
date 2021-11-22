package com.startjava.lesson_2_3_4.game;

import java.util.Scanner;

public class GuessNumberTest {
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Угадай число!");
        System.out.print("Введите имя первого игрока: ");
        Player firstPlayer = new Player(scan.nextLine());
        System.out.print("Введите имя второго игрока: ");
        Player secondPlayer = new Player(scan.nextLine());
        System.out.println("У каждого игрока есть 10 попыток, чтобы угадать число, которое загадал компьютер.");

        GuessNumber game = new GuessNumber(firstPlayer, secondPlayer);
        String repeat = "yes";
        while (!repeat.equals("no")) {
            if (repeat.equals("yes")) {
                game.play();
            }
            System.out.print("Хотите продолжить игру? [yes/no]: ");
            repeat = scan.nextLine();
        }
        scan.close();
    }
}
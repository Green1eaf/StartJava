package com.startjava.lesson_2_3_4.game;

import java.util.Scanner;

public class GuessNumber {
    private Player firstPlayer;
    private Player secondPlayer;
    private int targetNumber;

    public GuessNumber(Player firstPlayer, Player secondPlayer) {
        this.firstPlayer = firstPlayer;
        this.secondPlayer = secondPlayer;
    }

    public void play() {
        targetNumber = (int) (Math.random() * 101);
        while (makeMove(firstPlayer) && makeMove(secondPlayer)) {
            if (firstPlayer.getAttemptNumber() == 10 && secondPlayer.getAttemptNumber() == 10) {
                System.out.println("Оба игрока проиграли! Игра окончена!");
                break;
            }
        }
        getAllAttempts(firstPlayer);
        getAllAttempts(secondPlayer);
        firstPlayer.resetCountAttempt();
        secondPlayer.resetCountAttempt();
    }

    private boolean makeMove(Player player) {
        Scanner scan = new Scanner(System.in);
        System.out.print(player.getName() + " введите число: ");
        int number = scan.nextInt();
        player.addNumber(number);
        player.increaseAttemptNumber();
        if (compareNumbers(number, player)) return false;
        if (player.getAttemptNumber() == 10) {
            System.out.println("У " + player.getName() + " закончились попытки");
        }
        return true;
    }

    private void getAllAttempts(Player player) {
        System.out.print(player.getName() + ": ");
        for (int number : player.getNumbers()) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    private boolean compareNumbers(int playerNumber, Player player) {
        if (targetNumber == playerNumber) {
            System.out.println("Игрок " + player.getName() + " угадал число " +
                    targetNumber + " с " + player.getAttemptNumber() + " попытки");
            return true;
        } else {
            System.out.println(targetNumber < playerNumber ?
                    "Данное число больше того, что загадал компьютер" :
                    "Данное число меньше того, что загадал компьютер");
        }
        return false;
    }
}
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
        while (true) {
            if (playerMove(firstPlayer)) break;
            if (playerMove(secondPlayer)) break;
            if (firstPlayer.getAttemptNumber() == 10 && secondPlayer.getAttemptNumber() == 10) {
                System.out.println("Оба игрока проиграли! Игра окончена!");
                break;
            }
        }
    }

    private boolean playerMove(Player player) {
        Scanner scan = new Scanner(System.in);
        System.out.print(player.getName() + " введите число: ");
        int number = scan.nextInt();
        if (compareNumbers(number, targetNumber, player)) {
            System.out.println("Игрок " + player.getName() + " угадал число " +
                    targetNumber + " с " + player.getAttemptNumber() + " попытки");
            return true;
        } else if (player.getAttemptNumber() == 10) {
            System.out.println("У " + player.getName() + " закончились попытки");
        }
        return false;
    }

    public void getAllAttempts() {
        System.out.print(firstPlayer.getName() + ": ");
        for (int i = 0; i < firstPlayer.getNumbers().length; i++) {
            System.out.print(firstPlayer.getNumbers()[i] + " ");
        }
        System.out.println();

        System.out.print(secondPlayer.getName() + ": ");
        for (int i = 0; i < secondPlayer.getNumbers().length; i++) {
            System.out.print(secondPlayer.getNumbers()[i] + " ");
        }
        System.out.println();
    }

    public void resetGame() {
        firstPlayer.resetCountAttempt();
        secondPlayer.resetCountAttempt();
    }

    private boolean compareNumbers(int playerNumber, int targetNumber, Player player) {
        player.addNumber(playerNumber);
        player.increaseAttemptNumber();
        if (targetNumber < playerNumber) {
            System.out.println("Данное число больше того, что загадал компьютер");
        } else if (targetNumber > playerNumber) {
            System.out.println("Данное число меньше того, что загадал компьютер");
        } else return true;
        return false;
    }
}
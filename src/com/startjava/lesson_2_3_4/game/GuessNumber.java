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
        while (!makeMove(firstPlayer) && !makeMove(secondPlayer) && !attemptsIsOver()) {}
        showPlayerNumbers(firstPlayer);
        showPlayerNumbers(secondPlayer);
        firstPlayer.resetAttempt();
        secondPlayer.resetAttempt();
    }

    private boolean makeMove(Player player) {
        Scanner scan = new Scanner(System.in);
        System.out.print(player.getName() + " введите число: ");
        int number = scan.nextInt();
        player.addNumber(number);
        if (compareNumbers(player)) return true;
        if (player.getAttemptNumber() == 10) {
            System.out.println("У " + player.getName() + " закончились попытки");
        }
        return false;
    }

    private boolean compareNumbers(Player player) {
        if (targetNumber == player.getNumbers()[player.getAttemptNumber() - 1]) {
            System.out.println("Игрок " + player.getName() + " угадал число " +
                    targetNumber + " с " + player.getAttemptNumber() + " попытки");
            return true;
        }
        String comparator = targetNumber < player.getNumbers()[player.getAttemptNumber() - 1] ? "больше" : "меньше";
        System.out.println("Данное число " + comparator + " того, что загадал компьютер");
        return false;
    }

    private void showPlayerNumbers(Player player) {
        System.out.print(player.getName() + ": ");
        for (int number : player.getNumbers()) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    private boolean attemptsIsOver() {
        if (firstPlayer.getAttemptNumber() == 10 && secondPlayer.getAttemptNumber() == 10) {
            System.out.println("Оба игрока проиграли! Игра окончена!");
            return true;
        }
        return false;
    }
}
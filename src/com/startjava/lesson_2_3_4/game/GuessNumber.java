package com.startjava.lesson_2_3_4.game;

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
            if (compareNumbers(number, targetNumber, firstPlayer)) {
                System.out.println("Игрок " + firstPlayer.getName() + " угадал число " +
                        targetNumber + " с " + firstPlayer.getAttemptNumber() + " попытки");
                break;
            } else if (firstPlayer.getAttemptNumber() == 10) {
                System.out.println("У " + firstPlayer.getName() + " закончились попытки");
            }

            System.out.print(secondPlayer.getName() + " введите число: ");
            number = scan.nextInt();
            if (compareNumbers(number, targetNumber, secondPlayer)) {
                System.out.println("Игрок " + secondPlayer.getName() + " угадал число " +
                        targetNumber + " с " + secondPlayer.getAttemptNumber() + " попытки");
                break;
            } else if (secondPlayer.getAttemptNumber() == 10) {
                System.out.println("У " + secondPlayer.getName() + " закончились попытки");
                System.out.println("Оба игрока проиграли! Игра окончена!");
                break;
            }
        }
    }

    public void getAllAttempts() {
        System.out.print(firstPlayer.getName() + ": ");
        for(int i = 0; i < firstPlayer.getNumbers().length; i++) {
            System.out.print(firstPlayer.getNumbers()[i] + " ");
        }
        System.out.println();

        System.out.print(secondPlayer.getName() + ": ");
        for(int i = 0; i < secondPlayer.getNumbers().length; i++) {
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
package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {
    private String name;
    private int[] numbers;
    private int attemptNumber;

    public Player(String name) {
        this.name = name;
        numbers = new int[10];
    }

    public String getName() {
        return name;
    }

    public int[] getNumbers() {
        return Arrays.copyOf(numbers, attemptNumber);
    }

    public int getAttemptNumber() {
        return attemptNumber;
    }

    public void addNumber(int number) {
        numbers[attemptNumber] = number;
        ++attemptNumber;
    }

    public void resetAttempt() {
        Arrays.fill(numbers, 0, attemptNumber, 0);
        attemptNumber = 0;
    }
}
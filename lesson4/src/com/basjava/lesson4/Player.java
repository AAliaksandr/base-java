package com.basjava.lesson4;

import java.util.Arrays;

public class Player {

    private int number;
    private int[] numbers;

    public Player(int number, int[] numbers) {
        this.number = number;
        this.numbers = numbers;
    }

    public int getNumber() {
        return number;
    }

    public int[] getNumbers() {
        return numbers;
    }

    @Override
    public String toString() {
        return "Player{" +
                "number=" + number +
                ", numbers=" + Arrays.toString(numbers) +
                '}';
    }
}

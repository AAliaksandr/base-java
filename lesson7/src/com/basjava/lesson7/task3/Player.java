package com.basjava.lesson7.task3;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class Player {

    private int number;
    private Set<Integer> numbers;

    public Player(int number, Set<Integer> numbers) {
        this.number = number;
        this.numbers = numbers;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Set<Integer> getNumbers() {
        return numbers;
    }

    public void setNumbers(Set<Integer> numbers) {
        this.numbers = numbers;
    }

    @Override
    public String toString() {
        return "Player{" +
                "number=" + number +
                ", numbers=" + numbers +
                '}';
    }
}

package com.basjava.lesson4.util;

import com.basjava.lesson4.Player;

import java.util.Arrays;


public class GameUtil {

    public static Player[] generatePlayer(int num) {
        int number = 0;
        Player[] players = new Player[num];
        for (int i = 0; i < num; i++) {
            number++;
            Player player = new Player(number, generateNumbers());
            players[i] = player;
        }
        return players;
    }

    private static int[] generateNumbers() {
        int[] numbers = new int[6];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 49);
            for (int j = 0; j < i; j++) {
                if (numbers[i] == numbers[j]){
                    i--;
                }
            }
        }
        return numbers;
    }

    public static boolean compareResult(Player player) {
        int[] wonNums = generateNumbers();
        return Arrays.equals(wonNums, player.getNumbers());
    }
}

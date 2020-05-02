package com.basjava.lesson4.util;

import com.basjava.lesson4.Player;

import java.util.Arrays;
import java.util.Scanner;

public class ScannerUtil {
    public static Scanner scanner = new Scanner(System.in);

    public static int getPlayers() {
        System.out.println(" Введите число игроков: ");
        int playerNum;
        if (scanner.hasNextInt()) {
            playerNum = scanner.nextInt();
        } else {
            System.out.println("Вы допустили ошибку при вводе операции. Попробуйте еще раз.");
            scanner.nextInt();
            playerNum = getPlayers();
        }
        return playerNum;
    }

    public static Player selectPlayer(Player[] players) {
        for (int i = 0; i < players.length; i++) {
            System.out.println("Игрок " + players[i].getNumber() + " - числа " + Arrays.toString(players[i].getNumbers()));
        }
        System.out.println(" Выберете пользователя по номеру: ");
        int number;
        if (scanner.hasNextInt()) {
            number = scanner.nextInt();
            number = validateIndex(number, players.length);
        } else {
            System.out.println("Вы допустили ошибку при вводе операции. Попробуйте еще раз.");
            scanner.nextInt();
            number = scanner.nextInt();
        }
        return getPlayer(number, players);
    }

    private static Player getPlayer(int number, Player[] players) {
        return players[number];
    }

    private static int validateIndex(int number, int playerSize) {
        if (number == 1 || number == playerSize) {
            number--;
        }
        return number;
    }

    public static int getOperation() {
        System.out.println("1 - Да");
        System.out.println("0 - Нет");
        int operation = 0;
        if (scanner.hasNextInt()) {
            operation = scanner.nextInt();
        } else {
            System.out.println("Вы допустили ошибку при вводе операции. Попробуйте еще раз.");
            scanner.nextInt();
            operation = getOperation();
        }
        return operation;
    }
}
package com.basjava.lesson7.task3.util;

import com.basjava.lesson7.task3.Player;

import java.util.Arrays;
import java.util.Map;
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

    public static Player selectPlayer(Map<Integer, Player> players) {
        for (int i = 1; i <= players.size(); i++) {
            System.out.println("Игрок " + players.get(i).getNumber() + " - числа " + players.get(i).getNumbers());
        }
        System.out.println(" Выберете пользователя по номеру: ");
        int number;
        if (scanner.hasNextInt()) {
            number = scanner.nextInt();
        } else {
            System.out.println("Вы допустили ошибку при вводе операции. Попробуйте еще раз.");
            scanner.nextInt();
            number = scanner.nextInt();
        }
        return getPlayer(number, players);
    }

    private static Player getPlayer(int number, Map<Integer, Player> players) {
        if(number > players.size()){
            throw new IllegalArgumentException("No such player");
        }
        return players.get(number);
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
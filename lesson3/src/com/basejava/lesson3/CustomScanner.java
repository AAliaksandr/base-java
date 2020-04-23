package com.basejava.lesson3;

import java.util.Scanner;

public class CustomScanner {

    private static Scanner scanner = new Scanner(System.in);

    public static int getOperation() {
        System.out.println("Введите операцию:");
        System.out.println("1. Сложение");
        System.out.println("2. Разность");
        System.out.println("3. Умножение");
        System.out.println("4. Деление");
        System.out.println("5. Выход");
        int operation;
        if (scanner.hasNextInt()) {
            operation = scanner.nextInt();
        } else {
            System.out.println("Вы допустили ошибку при вводе операции. Попробуйте еще раз.");
            scanner.nextInt();
            operation = getOperation();
        }
        return operation;
    }

    public static int getInt() {
        int num;

        if (scanner.hasNextInt()) {
            num = scanner.nextInt();
        } else {
            System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
            scanner.next();
            num = getInt();
        }
        return num;
    }
}



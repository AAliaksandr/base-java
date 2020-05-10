package com.basjava.lesson6.print;

import java.util.Scanner;

public class ScannerUtil {

    private static Scanner scanner = new Scanner(System.in);

    public static void printPhrase(Printable printable) {
        scanner.nextLine();
        System.out.println("Введите фразу");
        String phrase = scanner.nextLine();
        printable.print(phrase);
    }

    public static Printable getPrinter(){
        int operation = scanner.nextInt();
        switch (operation) {
            case 1:
                return new LazerPrinter();
            case 2:
                return new Monitor();
            case 3:
                return new Display();
            default:
                throw new IllegalArgumentException("Выбранного устройства не существует");
        }
    }

    public static boolean reprintWithSelectedPrinter(){
        int operation = scanner.nextInt();
        return operation == 1;
    }
}

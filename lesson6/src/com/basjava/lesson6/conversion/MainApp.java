package com.basjava.lesson6.conversion;

import java.util.Locale;

import static com.basjava.lesson6.conversion.ScannerUtil.scanner;

public class MainApp {
    public static void main(String[] args) {
        scanner.useLocale(Locale.US);
        System.out.println("Введите градусы:");
        double degrees = ScannerUtil.getDegree();
        System.out.println("1 - Конвертировать в Фаренгейты\n2 - Конвертировать в Кельвины");
        degrees = ScannerUtil.getConverter(degrees);
        System.out.println(degrees);
    }
}

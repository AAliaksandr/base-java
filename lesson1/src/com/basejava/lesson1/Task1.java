package com.basejava.lesson1;

import javax.crypto.spec.PSource;

/**
 * Задание № 1
 * <p>
 * 1) Написать алгоритмы конвертации физических величин.
 * Код должен быть написан в соответствующих функциях
 * вместо комментария со вловом TODO
 * <p>
 * 2) Написать 2-3 собственные функции по конвертированию величин.
 * Результат вывести в консоль с помощью команды System.out.println().
 * См. Пример ее использования в методе main
 * <p>
 * PS Предусмотреть деление на 0, в этом случае нужно возвращать число -999.
 * <p>
 * Метод проверки: когда запустите метод main и посмотреть результаты в консоли.
 */

public class Task1 {

    private final static int ERROR_CODE = -999;

    public static double meterToInch(double meter) {
        double inch = 39.3701;
        return inch * meter;
    }

    public static double inchToMeter(double inch) {
        double meter = 0.0254;
        return meter * inch;
    }

    public static double kilogramToGram(double kilogram) {
        double gram = 1000;
        return kilogram * gram;
    }

    public static double gramToKilogram(double gram) {
        double kilogram = 0.001;
        return gram * kilogram;
    }

    public static double literToCubicMeter(double liter) {
        double cubicMeter = 0.001;
        return liter * cubicMeter;
    }

    public static double cubicMeterToLiter(double cubicMeter) {
        double liter = 1000;
        return cubicMeter * liter;
    }

    public static double SentimetrToMillimeter(double sentimeter) {
        double millimeter = 10;
        return millimeter * sentimeter;
    }

    public static double millimeterToSentimeter(double millimeter) {
        double sentimeter = 100;
        if (millimeter == 0) {
            return ERROR_CODE;
        }
        return sentimeter / millimeter;
    }

    public static void main(String[] args) {
        double inch = meterToInch(5);
        System.out.println("meterToInch - 5: " + inch);

        inch = meterToInch(0);
        System.out.println("meterToInch - 0: " + inch);

        double meter = inchToMeter(10);
        System.out.println("inchToMeter - 10: " + meter);

        meter = inchToMeter(0);
        System.out.println("inchToMeter - 0: " + meter);

        double gram = kilogramToGram(13);
        System.out.println("kilogramToGram - 13: " + gram);

        gram = kilogramToGram(0);
        System.out.println("kilogramToGram - 0: " + gram);

        double kilogram = gramToKilogram(991);
        System.out.println("gramToKilogram - 991: " + kilogram);

        kilogram = gramToKilogram(0);
        System.out.println("gramToKilogram - 0: " + kilogram);

        double cubicMeter = literToCubicMeter(88);
        System.out.println("literToCubicMeter - 88: " + cubicMeter);

        cubicMeter = literToCubicMeter(0);
        System.out.println("literToCubicMeter - 0: " + cubicMeter);

        double liter = cubicMeterToLiter(69);
        System.out.println("cubicMeterToLiter - 69: " + liter);

        liter = cubicMeterToLiter(0);
        System.out.println("cubicMeterToLiter - 0: " + liter);

        double sentimeter = SentimetrToMillimeter(100);
        System.out.println("sentimetrToMilllimeter - 100: " + sentimeter);

        sentimeter = SentimetrToMillimeter(0);
        System.out.println("SentimetrToMillimeter - 0: " + sentimeter);

        double millimeter = millimeterToSentimeter(10);
        System.out.println("millimeterToSentimeter - 100: " + millimeter);

        millimeter = millimeterToSentimeter(0);
        System.out.println("millimeterToSentimeter - 0: " + millimeter);
    }
}

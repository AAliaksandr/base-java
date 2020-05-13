package com.basjava.lesson6.conversion;

import java.util.Scanner;

public class ScannerUtil {
    public static Scanner scanner = new Scanner(System.in);

    public static double getDegree() {
        double degrees = scanner.nextDouble();
        return degrees;
    }

    public static double getConverter(double degree) {

        DegreeScale degreeScale = null;

        int operation = scanner.nextInt();
        scanner.nextLine();
        switch (operation) {
            case 1:
                degreeScale = new CelcToFar(degree);
                break;
            case 2:
                degreeScale = new CelcToKelv(degree);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + operation);
        }
        return degreeScale.converter();
    }
}
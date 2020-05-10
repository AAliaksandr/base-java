package com.basjava.lesson6.conversion;

import java.util.Scanner;

public class ScannerUtil {
    public static Scanner scanner = new Scanner(System.in);

    public static double getDegree(){
        double degrees = scanner.nextDouble();
        return degrees;
    }

    public static double getConverter(double degree) {
        int operation = scanner.nextInt();
        scanner.nextLine();
        switch (operation){
            case 1:
                DegreeScale degreeScale = new CelcToFar(degree);
                return degreeScale.converter();
            case 2:
                DegreeScale degreeScale1 = new CelcToKelv(degree);
                return degreeScale1.converter();
            default:
                throw new IllegalStateException("Unexpected value: " + operation);
        }
    }
}

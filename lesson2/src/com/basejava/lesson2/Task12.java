package com.basejava.lesson2;

public class Task12 {
    public static void main(String[] args) {
        double[] arr = {1.3e5, 2.4e2, 1.5e4, 6.3e4, 1e-2, 3.4e-2};
        for (int i = 0; i < arr.length; i++) {
            double min = arr[i];
            int min1 = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    min1 = j;
                }
            }
            if (i != min1) {
                double buf = arr[i];
                arr[i] = arr[min1];
                arr[min1] = buf;
            }
            System.out.print(arr[i] + "  ");
        }
        System.out.println();


        for (int i = 0; i < arr.length; i++) {
            double max = arr[i];
            int max1 = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                    max1 = j;
                }
            }
            if (i != max1) {
                double buf = arr[i];
                arr[i] = arr[max1];
                arr[max1] = buf;
            }
            System.out.print(arr[i] + "  ");
        }
        System.out.println();

    }
}

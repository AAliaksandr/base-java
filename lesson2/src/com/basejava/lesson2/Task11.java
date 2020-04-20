package com.basejava.lesson2;

public class Task11 {
    public static void main(String[] args) {
        double[] array = {1.3e5, 2.4e2, 1.5e4, 6.3e4, 1e-2, 3.4e-2};

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    double but = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = but;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "  ");
        }
        System.out.println();


        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] < array[j + 1]) {
                    double but = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = but;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "  ");
        }
        System.out.println();
    }
}

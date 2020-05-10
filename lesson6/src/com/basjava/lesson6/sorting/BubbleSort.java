package com.basjava.lesson6.sorting;

public class BubbleSort implements Sort {

    private int[] array;

    public BubbleSort(int[] array) {

        this.array = array;
    }

    @Override
    public int[] descSort() {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] < array[j + 1]) {
                    int but = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = but;
                }
            }
        }
        return array;
    }
    @Override
    public int[] ascSort() {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int but = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = but;
                }
            }
        }
        return array;
    }
}

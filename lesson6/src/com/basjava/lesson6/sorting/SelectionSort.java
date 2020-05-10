package com.basjava.lesson6.sorting;

public class SelectionSort implements Sort {

    private int[] array;

    public SelectionSort(int[] array) {
        this.array = array;
    }

    @Override
    public int[] descSort() {

        for (int i = 0; i < array.length; i++) {
            int max = array[i];
            int max1 = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] > max) {
                    max = array[j];
                    max1 = j;
                }
            }
            if (i != max1) {
                int buf = array[i];
                array[i] = array[max1];
                array[max1] = buf;
            }
        }
        return array;
    }

    @Override
    public int[] ascSort() {
            for (int i = 0; i < array.length; i++) {
                int min = array[i];
                int min1 = i;
                for (int j = i + 1; j < array.length; j++) {
                    if (array[j] < min) {
                        min = array[j];
                        min1 = j;
                    }
                }
                if (i != min1) {
                    int buf = array[i];
                    array[i] = array[min1];
                    array[min1] = buf;
                }
            }
        return array;
    }
}

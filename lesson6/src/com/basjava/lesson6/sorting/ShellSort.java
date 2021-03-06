package com.basjava.lesson6.sorting;

public class ShellSort implements Sort {

    private int[] array;

    public ShellSort(int[] array) {
        this.array = array;
    }

    @Override
    public int[] descSort() {
        int temp;
        int h = 0;
        while (h <= array.length / 3)
            h = 3 * h + 1;
        for (int k = h; k > 0; k = (k - 1) / 3)
            for (int i = k; i < array.length; i++) {
                temp = array[i];
                int j;
                for (j = i; j >= k; j -= k) {
                    if (temp > array[j - k])
                        array[j] = array[j - k];
                    else
                        break;
                }
                array[j] = temp;
            }
        return array;
    }


    @Override
    public int[] ascSort() {
        int temp;
        int h = 0;
        while (h <= array.length / 3)
            h = 3 * h + 1;
        for (int k = h; k > 0; k = (k - 1) / 3)
            for (int i = k; i < array.length; i++) {
                temp = array[i];
                int j;
                for (j = i; j >= k; j -= k) {
                    if (temp < array[j - k])
                    array[j] = array[j - k];
                    else
                    break;
                }
                array[j] = temp;
            }
        return array;
    }
}
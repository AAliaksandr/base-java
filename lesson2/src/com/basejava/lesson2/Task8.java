package com.basejava.lesson2;

public class Task8 {
    public static void main(String[] args) {

        int sum = 0;
        int average;
        int[] arr = {2, 3, 2, 1, 2, 5, 7, 9, 1, 4};
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        average = sum / arr.length;

        System.out.println(average);
    }
}

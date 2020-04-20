package com.basejava.lesson2;

public class Task6 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 2, 1, 2, 5, 7, 9, 8, 4};
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            if (num % 2 == 0) {
                arr[i] = num * num;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

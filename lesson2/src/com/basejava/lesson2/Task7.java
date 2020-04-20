package com.basejava.lesson2;

public class Task7 {
    public static void main(String[] args) {
        int[] arr = {6, 3, 2, 5, 2, 5, 7, 9, 1, 4};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0)
                arr[i] = 0;
            System.out.print(arr[i] + " ");
        }
    }
}

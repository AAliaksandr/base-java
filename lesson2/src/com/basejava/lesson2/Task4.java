package com.basejava.lesson2;

public class Task4 {
    public static void main(String[] args) {
        int max = 0;
        int min = 0;
        int[] myArray = new int[]{11, 2, 3, 11, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] > max) {
                max = myArray[i];
            }
            if (myArray[i] < myArray[min]) {
                min = myArray[i];
            }
        }
        System.out.println("Максимальное число " + max + " Минимальное число " + min);
    }
}
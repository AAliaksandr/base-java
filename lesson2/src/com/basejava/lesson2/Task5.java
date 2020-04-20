package com.basejava.lesson2;

public class Task5 {
    public static void main(String[] args) {

        int[] myArray = new int[]{11, 2, 3, 11, 5, 6, 7, 8, 9, 12};

        for (int i = myArray.length - 1; i >= 0; i--) {
            System.out.print(myArray[i] + " ");
        }
    }
}

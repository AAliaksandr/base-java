package com.basejava.lesson2;

public class Task5 {
    public static void main(String[] args) {

        int[] myArray = new int[]{11, 2, 3, 11, 5, 6, 7, 8, 9, 12};

        for (int i = 0; i < myArray.length; i++) {
        }
        int n = myArray.length;
        for (int i = 0; i < n/2; i++) {
            int a;
            a = myArray[n-i-1];
            myArray[n-i-1] = myArray[i];
            myArray[i] = a;

        }
        for (int i = 0; i < myArray.length ; i++) {
            System.out.print(myArray[i] + " ");
        }
    }
}

package com.basejava.lesson2;

public class Task10 {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 4, 5}, {8, 9, 7, 0}, {6, 6, 4, 3}};
        for (int[] i : arr) {
            for (int j : i) {
                System.out.print(" " + j + " ");
            }
            System.out.println();
        }
    }
}

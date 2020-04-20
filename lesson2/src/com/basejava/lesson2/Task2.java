package com.basejava.lesson2;

public class Task2 {
    public static void main(String[] args) {
        int num = numPow(7, 2);
        System.out.println(num);
    }

    public static int numPow(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        return result;
    }
}

package com.basejava.lesson2;

public class Task3 {
    private static final int ERROR_CODE = -999; // Число не входит в диапазон от 1 до 100

    public static void main(String[] args) {
        int num = numDiv(10);
        System.out.println(num);
    }

    public static int numDiv(int num) {
        int result = 0;
        if (num > 100) {
            return ERROR_CODE;
        }
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                result = i;
            }
        }
        return result;
    }
}


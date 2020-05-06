package com.basejava.lesson2;

public class Task3 {
    private static final int ERROR_CODE = -999; // Число не входит в диапазон от 1 до 100

    public static void main(String[] args) {
        int num = numDiv(99);
        System.out.println(num);
    }

    public static int numDiv(int num) {
        if (num > 100) {
            return ERROR_CODE;
        }
        for (int i = num; i > 0; i--) {
            if(i != num && i != 1 && num % i == 0){
                return i;
            }
        }
        return 0;
    }
}


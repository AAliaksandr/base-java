package com.basejava.lesson2;

public class Task1 {
    public static void main(String[] args) {
        int num = sum(4);
        System.out.println(num);
    }

    public static int sum(int num) {
        int a = 0;
        int sum = 0;
        while (a < num) {
            a++;
            sum += a;
        }
        return sum;
    }
}

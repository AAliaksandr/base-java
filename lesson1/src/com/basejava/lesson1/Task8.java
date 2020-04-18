package com.basejava.lesson1;

/**
 * Задание № 7
 * <p>
 * 1) Даны 3 числа. Вычислить их сумму. Если все три числа равны,
 * то нужно вернуть сумму увеличеннную в два раза
 * <p>
 * 2) Даны 2 числа, нужно вернуть true,
 * если одно из низ равно 10 или их сумма равно 10
 * <p>
 * 3) Даны 3 числа, нужно вернуть максимально число
 * Результат вывести в консоль
 * <p>
 * 4) Даны 3 числа, нужно вернуть минимальное число
 * Результат вывести в консоль
 */

public class Task8 {

    public static int sum1(int a, int b, int c) {
        // TODO решение для задания №1
        int result = a + b + c;
        if (a == b && b == c && c == a) {
            return result * 2;
        }
        System.out.println(result);
        return result;

    }

    public static boolean sum2(int a, int b) {
        // TODO решение для задания №2
        return a == 10 || b == 10 || a + b == 10;
    }

    public static int max(int a, int b, int c) {

        if (a >= b && a >= c) {
            return a;
        } else if (b >= c) {
            return b;
        } else {
            return c;
        }

    }

    public static int min(int a, int b, int c) {
        if (a <= b && a <= c) {
            return a;
        } else if (b <= c) {
            return b;
        } else {
            return c;
        }
    }

    public static void main(String[] args) {
        // вызвать функцию здесь
        int sum = sum1(2 , 2, 2);
        System.out.println(sum);

        System.out.println(sum2(7, 3));

        System.out.println(max(30, 10, 8));

        System.out.println(min(5, 2, 3));

    }



}

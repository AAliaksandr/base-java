package com.basejava.lesson1;

/**
 * Задание № 5
 *
 * 1) Написать алгоритм округления числа до целого.
 * Например 2.5 -> 3, 2.6 -> 3, 2.4 -> 2
 *
 * Вызвать функцию в методе main, а результат вывести в консоль
 * Пример вызова:
 * int result = roundNumber(4.45)
 * System.out.println(result)
 *
 * 2) Написать алгоритм получения дробной части числа.
 * То есть, если у меня число 2.75, то я хочу получить 0.75
 *
 */

public class Task5 {

    public static int roundNumber(double number) {
        // TODO написать проверку здесь и вывести сообщение
        int result = (int)(number + 0.5);
        System.out.println(result);
        return result;
    }


    public static double getTail(double number) {
        // TODO получение дробной части
        double result = (number)%1;
        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        roundNumber(2.5);

        getTail(2.75);

    }
}

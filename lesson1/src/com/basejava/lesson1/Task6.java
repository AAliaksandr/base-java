package com.basejava.lesson1;

/**
 * Задание № 6
 *
 * 1) Написать функцию определения месяца по его номеру.
 * То есть, в функцию будет подано число. Если это число находится
 * в диапазоне 1 - 12, то нам нужно вывести соответствующее имя месяца.
 * Если же было введено число, которое не попадает в заданный диапазон,
 * то нужно вывести сообщение с ошибкой ("Число не в диапазоне").
 *
 * Решение должно быть представлено в двух вариантах в отдельных функциях:
 * - с использованием if-else
 * - с использованием switch-case
 *
 * 2) Произвести вызов функций в main
 *
 * Пример вызова: printMonthWithIfElse(1)
 */

public class Task6 {

    public static void printMonthWithIfElse(int monthNumber) {
        // TODO решение через if-else

        if (monthNumber == 1) {
            System.out.println("Январь");
        } else if (monthNumber == 2) {
            System.out.println("Февраль");
        } else if (monthNumber == 3) {
            System.out.println("Март");
        } else if (monthNumber == 4) {
            System.out.println("апрель");
        } else if (monthNumber == 5) {
            System.out.println("Май");
        }else if (monthNumber == 6) {
            System.out.println("Июнь");
        }else if (monthNumber == 7) {
            System.out.println("Июль");
        }else if (monthNumber == 8) {
            System.out.println("Август");
        }else if (monthNumber == 9) {
            System.out.println("Сентябрь");
        }else if (monthNumber == 10) {
            System.out.println("Октябрь");
        }else if (monthNumber == 11) {
            System.out.println("Ноябрь");
        }else if (monthNumber == 12) {
            System.out.println("Декабрь");
        } else {
            System.out.println("Число не в диапазоне");
        }

    }

    public static void printMonthWithSwithCase(int monthNumber) {
        // TODO решение через switch-case
        switch (monthNumber){
            case 1:
                System.out.println("Январь");
                break;
            case 2:
                System.out.println("Февраль");
                break;
            case 3:
                System.out.println("Март");
                break;
            case 4:
                System.out.println("Апрель");
                break;
            case 5:
                System.out.println("Май");
                break;
            case 6:
                System.out.println("Июнь");
                break;
            case 7:
                System.out.println("Июль");
                break;
            case 8:
                System.out.println("Август");
                break;
            case 9:
                System.out.println("Сентябрь");
                break;
            case 10:
                System.out.println("Октябрь");
                break;
            case 11:
                System.out.println("Ноябрь");
                break;
            case 12:
                System.out.println("Декабрь");
                break;
            default:
                System.out.println("Число не в диапазоне");
                break;
        }

    }

    public static void main(String[] args) {
        // вызвать функцию здесь
        printMonthWithSwithCase(1);

        printMonthWithIfElse(11);
    }
}

package com.basejava.lesson1;

/**
 * Задание № 7
 *
 * 1) Написать функцию определения количества дней месяца месяца по его номеру.
 * То есть, в функцию будет подано число. Если это число находится
 * в диапазоне 1 - 12, то нам нужно соответствующее количество дне для месяца и
 * его название.
 * Если же было введено число, которое не попадает в заданный диапазон,
 * то нужно вывести сообщение с ошибкой ("Число не в диапазоне").
 *
 * Решение должно быть представлено в двух вариантах в отдельных функциях:
 * - с использованием if-else.
 * Подсказка: можно несколько раз использовать логическое "ИЛИ"(||)
 * - с использованием switch-case
 *
 * 2) Произвести вызов функций в main
 *
 *  Пример вызова:
 *  printMonthWithIfElse(12)
 *  printMonthWithIfElse(44)
 */

public class Task7 {

    public static void printDaysInMonthWithIfElse(int monthNumber) {
        // TODO решение через if-else
        if (monthNumber == 1 ||monthNumber == 3 ||monthNumber == 5 ||monthNumber == 7 ||monthNumber==8 ||monthNumber==10 ||monthNumber==12) {
            System.out.println("В месяце 31 день");
        } else if (monthNumber == 4 ||monthNumber == 6 ||monthNumber == 9|| monthNumber== 11) {
            System.out.println("В месяце 30 дней");
        } else if (monthNumber == 2) {
            System.out.println("В месяце 28 дней");
        } else {
            System.out.println("Число не в диапазоне");
        }
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

    public static void printDaysInMonthWithSwithCase(int monthNumber) {
        // TODO решение через switch-case
        switch (monthNumber){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("В месяце 31 день");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("В месяце 30 дней");
                break;
            case 2:
                System.out.println("В месяце 28 дней");
                break;
            default:
                System.out.println("Число не в диапазоне");
                break;
        }
    }

    public static void main(String[] args) {
        // вызвать функцию здесь
        printDaysInMonthWithIfElse(12);

        printDaysInMonthWithSwithCase(4);
    }
}

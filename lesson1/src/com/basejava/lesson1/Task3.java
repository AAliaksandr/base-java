package com.basejava.lesson1;

/**
 * Задание № 3
 *
 * 1) Написать алгоритм проверки необходимости человеку работать.
 * Функция имеет два параметра:
 * - isWeekDay показывает это рабочий день (true) или выходной(false)
 * - isHoliday показывает нахожусь ли я в отпуске true) или нет(false)
 *
 * Задание:
 * - если человек в отпуске или сейчас выходной день, то вывести в консоль
 * сообщение "Отдыхай"
 * - иначе вывести сообщение "Давай работай"
 * Вывод сообщения произвести в консоль
 */

public class Task3 {

    public static void checkHoliday(boolean isWeekDay, boolean isHoliday) {
        // TODO написать проверку здесь и вывести сообщение
        if(isWeekDay || !isHoliday){
            System.out.println("Иди работай");
        } else {
            System.out.println("Отдыхай");
        }
    }

    public static void main(String[] args) {
        // вызвать функцию здесь
        checkHoliday(false, true);
    }
}

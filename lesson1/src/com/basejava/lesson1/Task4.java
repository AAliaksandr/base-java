package com.basejava.lesson1;

/**
 * Задание № 4
 *
 * 1) В переменной min лежит число от 0 до 59.
 * Определите в какую четверть часа попадает это число
 * (в первую, вторую, третью или четвертую).
 *
 * - от 0 до 14 - первая
 * - от 15 до 29 - вторая
 * - от 30 до 44 - третья
 * - от 45 до 59 - четвертая
 * - если число не входит в диапазон, то вывести сообщение об этом
 *
 * Пример пример сообщения:
 * System.out.println("первая")
 *
 * Пример вызова функции в main:
 * checkTimePath(15)
 * checkTimePath(100)
 *
 * 2) В функцию приходит время в виде миллисекунд.
 * Необходимо вывести в консолько сколько в этих миллисекундах
 * часов, минут и секунд. 1секунда = 1000 милиссекунд.
 *
 * Пример вывода:
 * int hours = ...
 * System.out.println("Часы: " + hours)
 */

public class Task4 {

    public static void checkTimePath(int min) {
        // TODO написать проверку здесь и вывести сообщение
        if (min>=0 && min<=14) {
            System.out.println("Первая");
        } else if (min>=15 && min<=29) {
            System.out.println("Вторая");
        } else if (min>=30 && min<=44) {
            System.out.println("Третья");
        } else if (min>=45 && min<=59) {
            System.out.println("Четвертая");
        } else {
            System.out.println("Число не входит в диапазон");
        }
    }


     public static void parseMilliseconds(long milliseconds) {
         // TODO написать деление миллисекунд
         int second = (int) (milliseconds / 1000);
         int minutes =  second / 60;
         int hours = minutes / 60;

         System.out.println("Секунды " + second);
         System.out.println("Минуты " + minutes);
         System.out.println("Часы " + hours);
     }

    public static void main(String[] args) {
        // вызвать функцию здесь с разными сходными параметрами
         checkTimePath(100);
         parseMilliseconds(10000000);
    }
}

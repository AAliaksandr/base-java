package com.basejava.lesson1;

/**
 * Задание № 2
 * <p>
 * 1) Написать алгоритм проверки числа на четность.
 * в методе main вывести сообщение:
 * - System.out.println("Четное"), если введенное число было четным,
 * то есть функция вернула true
 * - System.out.println("Нечетное"), если введенное число было нечетным,
 * то есть функция вернула false
 * <p>
 * 2) Написать фукнцию расчета среднего числа между 4-мя значениями.
 * Результат вывести в консоль в main
 * <p>
 * 3) переделайте код метода clearOperator1() так,
 * чтобы использовались операции +=, -=, *=, /=.
 * Количество строк кода при этом не должно измениться.
 * <p>
 * 4) Переделайте этот код метода clearOperator2(),
 * чтобы в нем использовались операции ++ и --.
 * Количество строк кода при этом не должно измениться.
 * <p>
 * 5) Вычислить выражения (записать в пригодной для java форме):
 * знак "/" - дробь. Вычисления можно сделать либо отдельной функцией,
 * либо в методе main.
 * <p>
 * a) (1/4 + 5/8 - 1) * 9 - 3
 * b) 9 + 3.6 + (33/(48*5/3))
 * c) 10 * 1/2 + (48*5/3)
 */

public class Task2 {

    public static boolean isEvenNumber(int number) {
        // TODO написать проверку на четность входного числа
        return number % 2 == 0;
    }


    public static double getAvgNumber(int x, int y, int z, int l) {
        //TODO написать расчет среднего значения для входных параметров

        return (x + y + z + l) / 4;
    }

    public static void clearOperator1() {
        int num = 47;
        num += 7;
        num -= 18;
        num *= 10;
        num /= 15;
        System.out.println("clearOperator1" + num);
    }

    public static void clearOperator2() {
        int num = 47;
        num++;
        num--;
        num++;
        num--;
        System.out.println("clearOperator2 " + num);
    }

    public static void main(String[] args) {
        //task number 1
        int number  = 6;
        if (isEvenNumber(number)) {
            System.out.println("Четное " + number);
        } else {
            System.out.println("Нечетное " + number);
        }


        double avgNumber = (int) getAvgNumber(1, 2, 3, 4);
        System.out.println(avgNumber);

        clearOperator1();


        clearOperator2();

        //a)
        double result1;
        double a = 0.25;
        double b = 0.625;
        double c = 1;
        double d = 9;
        double e = 3;
        result1 = (a + b + c) * d - e;
        System.out.println(result1);

        //b)
        double result2;
        double a1 = 9;
        double b1 = 3.6;
        double c1 = 33;
        double d1 = 48;
        double e1 = 1.67;
        result2 = (a1 + b1) + (c1 / (d1 * e1));
        System.out.println(result2);

        //c)
        double result3;
        double a2 = 10;
        double b2 = 0.5;
        double c2 = 48;
        double d2 = 1.67;
        result3 = (a2 * b2) + (c2 * d2);
        System.out.println(result3);
    }
}

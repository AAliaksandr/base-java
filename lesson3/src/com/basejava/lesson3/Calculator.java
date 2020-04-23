package com.basejava.lesson3;

public class Calculator {
    private int num1;
    private int num2;
    private int operator;

    public Calculator(int num1, int num2, int operator) {
        this.num1 = num1;
        this.num2 = num2;
        this.operator = operator;
    }

    public int calculate() {
        int result = 0;
        switch (operator) {
            case 1:
                result = num1 + num2;
                break;
            case 2:
                result = num1 - num2;
                break;
            case 3:
                result = num1 * num2;
                break;
            case 4:
                result = divide();
                break;
            default:
                System.out.println("Операция не распознана");
        }
        return result;
    }

    private int divide() {
        int result;
        if (num2 != 0) {
            result = num1 / num2;
        } else {
            System.out.println("Делить на ноль нельзя");
            System.out.println("Ввести другое число");
            num2 = CustomScanner.getInt();
            return num1 / num2;
        }
        return result;
    }
}

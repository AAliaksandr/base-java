package com.basejava.lesson3;

class CalculatorApp {

    public static void main(String[] args) {
        int operation = CustomScanner.getOperation();
        if(isExit(operation)){
            System.out.println("Exiting...");
            return;
        }
        System.out.println("Введите первое число:");
        int num1 = CustomScanner.getInt();
        System.out.println("Введите второе число:");
        int num2 = CustomScanner.getInt();
        Calculator calculator = new Calculator(num1, num2, operation);
        int result = calculator.calculate();
        System.out.println("Результат равен: " + result);
    }

    private static boolean isExit(int operation){
        return operation == 5;
    }
}
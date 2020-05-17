package com.basjava.lesson5.car;

import java.util.Scanner;

public class CarApp {
    public static void main(String[] args) {
        int type = getTransportType();
        if(type == 1){
            print(TransportDB.getTruck());
        } else if (type == 2){
            print(TransportDB.getCars());
        } else {
            System.out.println("Wrong number");
        }
    }
    public static void print(Transport[] transports){
        for (int i = 0; i < transports.length; i++) {
            System.out.println(transports[i].getName() +
                    " " + transports[i].getYear() +
                    " года " + " цвет: " + transports[i].getColor() +
                    " масса: " + transports[i].getWeight() +
                    " номер: " + transports[i].getNumber());
        }
    }

    private static int getTransportType(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите тип автомобиля:");
        System.out.println("1- грузовые");
        System.out.println("2- легковые");
        int number = scanner.nextInt();
        return number;
    }
}

package com.basjava.lesson7.task4;

import java.util.List;
import java.util.Scanner;

public class CarApp {
    public static void main(String[] args) {
        int type = getTransportType();
        if(type == 1){
            printTruck(TransportDB.getTruck());
        } else if (type == 2){
            printCars(TransportDB.getCars());
        } else {
            System.out.println("Wrong number");
        }
    }
    private static void printTruck(List<Truck> trucks){
        for (Truck truck : trucks) {
            System.out.println(truck.getName() +
                    " " + truck.getYear() +
                    " года " + " цвет: " + truck.getColor() +
                    " масса: " + truck.getWeight() +
                    " номер: " + truck.getNumber());
        }
    }

    private static void printCars(List<Car> cars) {
        for (Car car : cars) {
            System.out.println(car.getName() +
                    " " + car.getYear() +
                    " года " + " цвет: " + car.getColor() +
                    " масса: " + car.getWeight() +
                    " номер: " + car.getNumber());
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

package com.basjava.lesson7.task4;

import java.util.Arrays;
import java.util.List;

public class TransportDB {


    public static List<Car> getCars(){
        Car car1 = new Car("Lada Vesta", 2018, "Green", 1550, 1234);
        Car car2 = new Car("Audi A4", 2010, "Orange", 1650, 2323);
        Car car3 = new Car("Skoda Rapid", 2020, "Red", 1600, 1111);
        Car car4 = new Car("Toyota Corolla", 2015, "Grey", 1600, 2222);
        Car car5 = new Car("Citroen C4", 2016, "Black", 1600, 3333);

        return Arrays.asList(car1, car2, car3, car4, car5);
    }

    public static List<Truck> getTruck(){
        Truck truck1 = new Truck("Kamaz 4318", 2017, "Red", 14260, 4444);
        Truck truck2 = new Truck("Mercedes-Benz Unimog U5000", 2015, "Green", 14500, 5555);
        Truck truck3 = new Truck("Volvo", 2010, "White", 15000, 6666);
        Truck truck4 = new Truck("Daf", 2005, "Green", 14000, 7777);
        Truck truck5 = new Truck("Maz", 2018, "Black", 13000, 8888);

        return Arrays.asList(truck1, truck2, truck3, truck4, truck5);
    }
}

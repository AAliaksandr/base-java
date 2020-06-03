package com.basjava.lesson9;

import java.util.ArrayList;
import java.util.List;

public class StorageAPP {
    public static void main(String[] args) {

        List<Integer> items = new ArrayList<>();
        for (int i = 0; i < 16; i++) {
            items.add(i);
        }
        Storage  loadingStorageA = new Storage(items);
        Storage  loadingStorageB = new Storage(items);
        Storage  loadingStorageC = new Storage(items);
        Storage  loadingStorageD = new Storage(items);
        Storage  loadingStorageE = new Storage(items);


        Storage unloadingStorageA = new Storage(items);
        Storage unloadingStorageB = new Storage(items);


        Thread truck1 = new Thread(new Truck("TruckA_1", TruckType.CAPACITY_1, loadingStorageA,unloadingStorageA));
        Thread truck2 = new Thread(new Truck("TruckA_2", TruckType.CAPACITY_1, loadingStorageB, unloadingStorageB));
        Thread truck3 = new Thread(new Truck("TruckA_3", TruckType.CAPACITY_1, loadingStorageC, unloadingStorageA));
        Thread truck4 = new Thread(new Truck("TruckA_4", TruckType.CAPACITY_1, loadingStorageD, unloadingStorageB));
        Thread truck5 = new Thread(new Truck("TruckA_5", TruckType.CAPACITY_1, loadingStorageE, unloadingStorageA));
        Thread truck6 = new Thread(new Truck("TruckB_1", TruckType.CAPACITY_3, loadingStorageA, unloadingStorageA));
        Thread truck7 = new Thread(new Truck("TruckB_2", TruckType.CAPACITY_3, loadingStorageB, unloadingStorageB));
        Thread truck8 = new Thread(new Truck("TruckB_3", TruckType.CAPACITY_3, loadingStorageC, unloadingStorageA));
        Thread truck9 = new Thread(new Truck("TruckB_4", TruckType.CAPACITY_3, loadingStorageD, unloadingStorageB));
        Thread truck10 = new Thread(new Truck("TruckB_5", TruckType.CAPACITY_3, loadingStorageE, unloadingStorageA));
        Thread truck11 = new Thread(new Truck("TruckB_6", TruckType.CAPACITY_3, loadingStorageA, unloadingStorageA));
        Thread truck12 = new Thread(new Truck("TruckB_7", TruckType.CAPACITY_3, loadingStorageB, unloadingStorageB));
        Thread truck13 = new Thread(new Truck("TruckB_8", TruckType.CAPACITY_3, loadingStorageC, unloadingStorageA));
        Thread truck14 = new Thread(new Truck("TruckB_9", TruckType.CAPACITY_3, loadingStorageD, unloadingStorageB));
        Thread truck15 = new Thread(new Truck("TruckB_10", TruckType.CAPACITY_3, loadingStorageE, unloadingStorageA));
        Thread truck16 = new Thread(new Truck("TruckC_1", TruckType.CAPACITY_5, loadingStorageA, unloadingStorageB));
        Thread truck17 = new Thread(new Truck("TruckC_2", TruckType.CAPACITY_5, loadingStorageB, unloadingStorageA));
        Thread truck18 = new Thread(new Truck("TruckC_3", TruckType.CAPACITY_5, loadingStorageC, unloadingStorageB));
        Thread truck19 = new Thread(new Truck("TruckC_4", TruckType.CAPACITY_5, loadingStorageD, unloadingStorageA));
        Thread truck20 = new Thread(new Truck("TruckC_5", TruckType.CAPACITY_5, loadingStorageE, unloadingStorageB));

        truck1.start();
        truck2.start();
        truck3.start();
        truck4.start();
        truck5.start();
        truck6.start();
        truck7.start();
        truck8.start();
        truck9.start();
        truck10.start();
        truck11.start();
        truck12.start();
        truck13.start();
        truck14.start();
        truck15.start();
        truck16.start();
        truck17.start();
        truck18.start();
        truck19.start();
        truck20.start();
    }
}

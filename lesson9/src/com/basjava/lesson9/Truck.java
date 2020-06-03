package com.basjava.lesson9;

import java.util.ArrayList;
import java.util.List;

public class Truck implements Runnable {
    private final String name;
    private final TruckType type;
    private final List<Integer> items = new ArrayList<>();
    private final Storage loadingStorage;
    private final Storage unloadingStorage;

    public Truck(String name, TruckType type, Storage loadingStorage, Storage unloadingStorage) {
        this.name = name;
        this.type = type;
        this.loadingStorage = loadingStorage;
        this.unloadingStorage = unloadingStorage;
    }



    @Override
    public void run() {
        try {

                System.out.println("Truck " + name + " arrives to loading storage");
                boolean loadingResult = loadingStorage.get(type,items);

                if (loadingResult) {
                    System.out.println("Truck " + name + " successfully loading " + items.size() + " items");
                }
                Thread.sleep(5000);
                System.out.println("Truck " + name + " arrives to unloadingStorage storage");


                boolean unloadingResult = unloadingStorage.put(type, items);
                if (unloadingResult) {
                    System.out.println("Truck " + name + " successfully unloading " + items.size() + " items");
                }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

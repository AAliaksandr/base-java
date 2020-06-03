package com.basjava.lesson9;

import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Storage {
    private final Lock lock = new ReentrantLock();
    private final Condition condition = lock.newCondition();
    private final List<Integer> items;

    public Storage(List<Integer> items) {
        this.items = items;
    }

    public boolean get(TruckType truckType, List<Integer> truckFreight) throws InterruptedException{
        lock.lock();
        try {
            if (truckType == TruckType.CAPACITY_1){
                return getFromStorage(2000, 1, truckFreight);
            }
            if (truckType == TruckType.CAPACITY_3){
                return getFromStorage(6000, 3, truckFreight);
            }
            if (truckType == TruckType.CAPACITY_5){
                return getFromStorage(10000, 5, truckFreight);
            }
            return false;
        } finally {
            lock.unlock();
        }
    }


    public boolean put(TruckType truckType, List<Integer> truckFreight) throws InterruptedException{
        lock.lock();
        try {
            if (truckType == TruckType.CAPACITY_1){
                return fillInStorage(1000, 1, truckFreight);
            }
            if (truckType == TruckType.CAPACITY_3){
                return fillInStorage(3000, 3, truckFreight);
            }
            if (truckType == TruckType.CAPACITY_5){
                return fillInStorage(5000, 5, truckFreight);
            }
            return false;
        } finally {
            lock.unlock();
        }
    }

    private boolean getFromStorage(int time, int quantity, List<Integer> truckFreight) throws InterruptedException{
        Thread.sleep(time);
        if (items.size() <= 0){
            condition.await();
        }
        for (int i = 0; i < quantity; i++) {
           truckFreight.add(items.get(i));
        }
        condition.signalAll();
        return true;
    }
    private boolean fillInStorage(int time, int quantity, List<Integer> truckFreight) throws InterruptedException{
        Thread.sleep(time);
        if (truckFreight.size() <= 0){
            condition.await();
        }
        for (int i = 0; i < quantity; i++) {
            items.add(truckFreight.get(i));
        }
        condition.signalAll();
        return true;
    }

}

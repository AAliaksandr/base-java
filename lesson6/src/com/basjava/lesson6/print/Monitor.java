package com.basjava.lesson6.print;


public class Monitor extends Printer implements Printable {

    public Monitor(){}

    public Monitor(String name) {
        super(name);
    }

    @Override
    public void print(String phrase) {

        System.out.println("Ваше сообщение " +phrase);
    }
}

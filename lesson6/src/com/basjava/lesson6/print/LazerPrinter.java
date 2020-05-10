package com.basjava.lesson6.print;

public class LazerPrinter extends Printer implements Printable {

    public LazerPrinter(){}

    public LazerPrinter(String name) {
        super(name);
    }

    @Override
    public void print(String phrase) {

        System.out.println("Ваше сообщение " +phrase);
    }
}

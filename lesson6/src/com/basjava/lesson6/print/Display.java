package com.basjava.lesson6.print;

public class Display extends Printer implements Printable{

    public Display(){
    }

    public Display(String name) {
        super(name);
    }

    @Override
    public void print(String phrase) {
        System.out.println("Ваше сообщение " +phrase);
    }
}

package com.basjava.lesson6.print;

public abstract class Printer {
    private String name;

    public Printer(){}

    public Printer(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Print{" +
                "name='" + name + '\'' +
                '}';
    }
}

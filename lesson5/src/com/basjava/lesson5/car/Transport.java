package com.basjava.lesson5.car;

public class Transport {
    private String name;
    private int year;
    private String color;
    private int weight;
    private int number;

    public Transport(String name, int year, String color, int weight, int number) {
        this.name = name;
        this.year = year;
        this.color = color;
        this.weight = weight;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                ", number=" + number +
                '}';
    }
}

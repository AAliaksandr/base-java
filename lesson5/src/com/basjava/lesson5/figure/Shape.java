package com.basjava.lesson5.figure;

public abstract class Shape {

    private int height;
    private int length;

    public Shape(int height, int length) {
        this.height = height;
        this.length = length;
    }

    public int getArea(){
       return height * length;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}



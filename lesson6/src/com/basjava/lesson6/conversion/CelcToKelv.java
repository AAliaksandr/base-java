package com.basjava.lesson6.conversion;

public class CelcToKelv implements DegreeScale {

     private double degress;

    public CelcToKelv(double degress) {
        this.degress = degress;
    }

    @Override
    public double converter() {
        return degress + 273.15;
    }
}

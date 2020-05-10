package com.basjava.lesson6.conversion;

public class CelcToFar implements DegreeScale {
    private double degress;

    public CelcToFar(double degress) {
        this.degress = degress;
    }

    @Override
    public double converter() {
        return degress  * 9 / 5 + 32;
    }
}

package com.example.cmput301w23t30;

public class Hexagon extends Shape {
    private int sideLength;

    public Hexagon(int x, int y, int sideLength) {
        super(x, y);
        this.sideLength = sideLength;
    }

    public int getSideLength() {
        return sideLength;
    }

    public void setSideLength(int sideLength) {
        this.sideLength = sideLength;
    }
}

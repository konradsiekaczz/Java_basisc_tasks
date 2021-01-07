package com.konrad;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        return length * width;
    }

    public double calculatePerimeter() {
        return 2 * length + 2 * width;
    }

    public double calculateDiagonal(){
        return Math.sqrt(Math.pow(2,length) + Math.pow(2, width));
    }
}

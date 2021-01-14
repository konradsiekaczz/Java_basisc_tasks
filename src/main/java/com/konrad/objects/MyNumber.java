package com.konrad.objects;

public class MyNumber {
    private double num;

    public MyNumber(double num) {
        this.num = num;
    }

    public double getNum() {
        return num;
    }

    public boolean isOdd() {
        return num % 2 != 0;
    }

    public boolean isEven() {
        return num % 2 == 0;
    }

    public double sqrt() {
        return Math.sqrt(num);
    }

    public MyNumber pow(MyNumber x) {
        return new MyNumber(Math.pow(num, x.num));
    }

    public MyNumber add(MyNumber x) {
        return new MyNumber(num + x.num);
    }

    public MyNumber subtract(MyNumber x) {
        return new MyNumber(num - x.num);
    }

    @Override
    public String toString() {
        return String.valueOf(num);
    }
}

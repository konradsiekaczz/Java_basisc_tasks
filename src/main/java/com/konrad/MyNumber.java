package com.konrad;

public class MyNumber {
    private long num;

    public MyNumber(long num) {
        this.num = num;
    }

    public long getNum() {
        return num;
    }

    public boolean isOdd() {
        return num % 2 != 0;
    }

    public boolean isEven() {
        return num % 2 == 0;
    }

    public long sqrt(){
        return (long) Math.sqrt(num);
    }

    public MyNumber pow(MyNumber x){
        return new MyNumber((long) Math.pow(num,x.num));
    }

    public MyNumber add(MyNumber x){
        return new MyNumber(num + x.num);
    }

    public MyNumber subtract(MyNumber x){
        return new MyNumber(num - x.num);
    }

    @Override
    public String toString() {
        return String.valueOf(num);
    }
}

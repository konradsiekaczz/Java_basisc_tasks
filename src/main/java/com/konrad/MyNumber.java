package com.konrad;

public class MyNumber {
    private long num;

    public MyNumber(long num) {
        this.num = num;
    }

    public boolean isOdd() {
        return this.num % 2 != 0;
    }

    public boolean isEven() {
        return this.num % 2 == 0;
    }

}

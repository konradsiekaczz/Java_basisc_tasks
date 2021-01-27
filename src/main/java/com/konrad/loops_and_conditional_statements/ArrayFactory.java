package com.konrad.loops_and_conditional_statements;

public class ArrayFactory {

    private int size;

    public ArrayFactory(int size) {
        this.size = size;
    }

    private int[] oneDimension(){
        return new int[size];
    }

    private int[][] twoDimension(){
        return new int[size][size];
    }
}

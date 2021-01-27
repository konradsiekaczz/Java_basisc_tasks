package com.konrad.loops_and_conditional_statements;

public class ArrayFactory {

    private int x;

    public ArrayFactory(int x) {
        this.x = x;
    }

    private int[] oneDimension(){
        return new int[x];
    }

    private int[][] twoDimension(){
        return new int[x][x];
    }
}

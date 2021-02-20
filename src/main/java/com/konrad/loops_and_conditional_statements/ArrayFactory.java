package com.konrad.loops_and_conditional_statements;

public class ArrayFactory {

    private int size;

    public ArrayFactory(int size) {
        this.size = size;
    }

    private int[] oneDimension(){
        return new int[size];
    }

    public int[][] twoDimension(){
        return new int[size][size];
    }

    public int[][] unitMatrix(){
        int [][] arr = twoDimension();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i==j){
                    arr[i][j]=1;
                }
            }
        }
        return arr;
    }

}

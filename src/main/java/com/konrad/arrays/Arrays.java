package com.konrad.arrays;

public class Arrays {

    /*This method return five first letter of alphabet*/
    public static String[] returnLetters() {
        return new String[]{"A", "B", "C", "D", "E"};
    }

    /*This method reverse elements in array*/
    public static void reverseElements(Object[] arrays) {
        for (int i = 0; i < arrays.length / 2; i++) {
            Object temp = arrays[i];
            arrays[i] = arrays[arrays.length - i - 1];
            arrays[arrays.length - i - 1] = temp;
        }
    }
}

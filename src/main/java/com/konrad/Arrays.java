package com.konrad;


import java.util.Collections;

public class Arrays {

    public static void main(String[] args) {
        Object[]array = new Object[]{new Arrays(),new Human(2,2,2,"k","e")};

        reverseElements(array);

        System.out.println(java.util.Arrays.toString(array));
    }

    public static String[] returnLetters(){
        return  new String[]{"A","B","C","D","E"};
    }

    public static void reverseElements(Object[] arrays){
        for (int i = 0; i < arrays.length/2; i++) {
            Object temp = arrays[i];
            arrays[i] = arrays[arrays.length - i - 1];
            arrays[arrays.length -i - 1] = temp;
        }
    }
}

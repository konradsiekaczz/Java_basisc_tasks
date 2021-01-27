package com.konrad.loops_and_conditional_statements;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LoopsAndConditionalStatements {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        System.out.println(toBinary(1234));
        System.out.println(Integer.toBinaryString(1234));
    }

    public static void printFrom0ToNFromInput() throws IOException {
        while (true) {
            try {
                String inputStr = br.readLine();
                int inputInt = Integer.parseInt(inputStr);

                for (int i = 0; i <= inputInt; i++)
                    System.out.println(i);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Wrong typ of input, please try again!");
            }
        }
    }

    public static void printFrom0ToN(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }
    }

    public static void printReverseInputNumber(long num) {
        String numToString = String.valueOf(num);
        for (int i = numToString.length() - 1; i >= 0; i--) {
            System.out.println(numToString.charAt(i));
        }
    }

    public static void printCharPerLine(long num) {
        while (num > 0) {
            System.out.println(num % 10);
            num /= 10;
        }
    }

    public static String reverseString(String word) {
        return new StringBuilder(word).reverse().toString();
    }

    public static String toBinary(long num) {
        String binaryRepresentation = "";
        while (num > 0){
            long remainder = num % 2;
            binaryRepresentation = binaryRepresentation.concat(String.valueOf(remainder));
            num /= 2;
        }
        return reverseString(binaryRepresentation);
    }
}

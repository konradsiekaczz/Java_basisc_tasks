package com.konrad.loops_and_conditional_statements;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LoopsAndConditionalStatements {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        printFrom0ToNFromInput();
        printFrom0ToN(2);
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
}

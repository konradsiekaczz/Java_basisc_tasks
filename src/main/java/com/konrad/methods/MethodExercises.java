package com.konrad.methods;

import java.time.LocalDate;

public class MethodExercises {

    /*This method accepts year of birth as an argument and returns current age after calculating.*/
    public static int returnMyCurrentAge(int birthYear) {
        return LocalDate.now().getYear() - birthYear;
    }

    /*This method accepts name as an argument and returns it.*/
    public static String returnName(String s) {
        return s;
    }

    /*This method prints basics calculating between two arguments.*/
    public static void calculate(int x, int y) {
        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x * y);
    }

    /*This method checks if number is even.*/
    public static boolean isEven(double number) {
        return number % 2 == 0;
    }

    /*This method checks if number is divide by 3 and 5.*/
    public static boolean isDivisibleByThreeAndFive(double num) {
        return num % 3 == 0 && num % 5 == 0;
    }

    /*This method returns a number raised to the power of 3.*/
    public static double thirdPower(double num) {
        return Math.pow(num, 3);
    }

    /*This method returns a square root of number.*/
    public static double squareRoot(int num) {
        return Math.sqrt(num);
    }

    /*This method checks if we can build a right triangle using three number as an arguments.*/
    public static boolean canMakeTriangle(int a, int b, int c) {
        return Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2);
    }
}

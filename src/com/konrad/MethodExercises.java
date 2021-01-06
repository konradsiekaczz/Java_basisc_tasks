package com.konrad;

import java.time.LocalDate;

public class MethodExercises {

    public static void main(String[] args) {
    }

    /*This method accepts year of birth as an argument and returns current age after calculating.*/
    private static int returnMyCurrentYear(int birthYear) {
        return LocalDate.now().getYear() - birthYear;
    }

    /*This method accepts name as an argument and returns it.*/
    private static String returnName(String s) {
        return s;
    }

    /*This method prints basics calculating between two arguments.*/
    private static void calculate(int x, int y) {
        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x * y);
    }

    /*This method checks if number is even.*/
    private static boolean isEven(double number) {
        return number % 2 == 0;
    }

    /*This method checks if number is divide by 3 and 5.*/
    private static boolean isDivideBy3Or5(double num) {
        return num % 3 == 0 && num % 5 == 0;
    }

    /*This method returns a number raised to the power of 3.*/
    private static double thirdPower(double num){
        return Math.pow(num, 3);
    }

}

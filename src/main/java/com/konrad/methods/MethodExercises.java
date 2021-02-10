package com.konrad.methods;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MethodExercises {
    public static void main(String[] args) {

        Object[] ar = new Object[]{"Banana", "Orange", "Apple", "Mango", 5, 8, 1};
        Object[] ar1 = new Object[]{2, 6, 1, 9, 4, 5};
        Object[] ar2 = new Object[0];
        dbSort(ar);
    }

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

    /*This method find the n-th odd element from the given list.*/

    public static Integer getElement(List<Integer> list, Integer n) {
        int nthOddNumber = 1;
        if (list.size() - 1 < n) {
            return -1;
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 != 0 || list.get(i) == 0 || list.get(i) == 1) {
                if (n == nthOddNumber) {
                    return list.get(i);
                }
                nthOddNumber++;
            }
        }
        return -1;
    }
    /*This method find the n-th odd element from the given list.*/

    static int kthOdd(List<Integer> list, int k) {

        // Traverse the array
        for (int i = 0; i < list.size(); i++) {

            // If current element is odd
            if (list.get(i) % 2 == 1)
                k--;

            // If kth odd element is found
            if (k == 0)
                return list.get(i);
        }

        // Total odd elements in the array are < k
        return -1;
    }

    public static Object[] dbSort(Object[] a) {

        Object[] objects;
        List<Object> integers = new ArrayList<>();
        List<Object> strings = new ArrayList<>();

        addElementFromArrayToList(a, integers, strings);

        integers = integers.stream().sorted().collect(Collectors.toList());
        strings = strings.stream().sorted().collect(Collectors.toList());

        integers.addAll(strings);
        objects = integers.stream().toArray();

        return objects;
    }

    private static void addElementFromArrayToList(Object[] a, List<Object> integers, List<Object> strings) {
        for (int i = 0; i < a.length; i++) {
            if (a[i].getClass().equals(Integer.class)) {
                integers.add(a[i]);
            } else {
                strings.add(a[i]);
            }
        }
    }
}

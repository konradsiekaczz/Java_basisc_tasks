package com.konrad;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println(returnName("Konrad"));
    }

    /*This method accepts year of birth as an argument and returns current age after calculating.*/
    private static int returnMyCurrentYear(int birthYear){
        return LocalDate.now().getYear() - birthYear;
    }

    /*This method accepts name as an argument and returns it.*/
    private static String returnName(String s){
        return s;
    }
}

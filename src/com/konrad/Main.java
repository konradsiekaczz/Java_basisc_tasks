package com.konrad;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    private static Scanner scanner;

    public static void main(String[] args) {
    }

    /*This method accepts year of birth as an argument and returns age.*/
    private static int returnMyCurrentYear(int birthYear){
        return LocalDate.now().getYear() - birthYear;
    }
}

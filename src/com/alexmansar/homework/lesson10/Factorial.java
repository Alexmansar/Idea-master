package com.alexmansar.homework.lesson10;

import com.alexmansar.helper.HelperArrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factorial {
    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        HelperArrays.print("Please, enter number more for 0");
        int number = HelperArrays.getValue();
        if (!check(number, 0)) {
            HelperArrays.print("Result is: " + factorial(number));
        }
    }

    public static long factorial(int number) {
        if (number == 1) {
            return number;
        }
        return (long) number * factorial(number - 1);
    }

    public static boolean check(int number, int checkNumber) {
        if (number <= checkNumber) {
            System.out.println("You are wrong! Please, enter number more for 0");
            return true;
        }
        return false;
    }
}
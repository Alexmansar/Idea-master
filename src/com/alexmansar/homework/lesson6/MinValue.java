package com.alexmansar.homework.lesson6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MinValue {
    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        double a = 14.98888;
        double b = 14.98887;
        double c = 15;
        System.out.println("Minimize value is= " + findMin(a, b, c));

        System.out.println("Enter 3 any values : ");
        double val1 = getValue();
        double val2 = getValue();
        double val3 = getValue();
        System.out.println("Minimize value is= " + findMin(val1, val2, val3));
    }

    public static double findMin(double a, double b, double c) {
        if (a <= b && a <= c) {
            return a;
        } else if (b <= c && b <= a) {
            return b;
        }
        return c;
    }

    public static Double getValue() throws IOException {
        System.out.println("Input number");
        return Double.parseDouble(READER.readLine());
    }

}
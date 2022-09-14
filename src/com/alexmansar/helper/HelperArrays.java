package com.alexmansar.helper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HelperArrays {
    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
    }
    public static void print(String str) {
        System.out.println(str);
    }
    public static int getValue() throws IOException {
        return Integer.parseInt(READER.readLine());
    }

    public static int[][] generateRandom(int lines, int columns, int minValue, int maxValue) {
        int[][] numbers = new int[lines][columns];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                int value = (int) (Math.random() * (maxValue - minValue) + minValue);
                numbers[i][j] = value;
            }
        }
        return numbers;
    }

    public static int[] generateRandom(int numberOfArray, int minValue, int maxValue) {
        int[] numbers = new int[numberOfArray];
        for (int i = 0; i < numbers.length; i++) {
            int value = (int) (Math.random() * (maxValue - minValue) + minValue);
            numbers[i] = value;
        }
        return numbers;
    }

    public static void printDoubleArray(int[][] array) {
        for (int[] ints : array) {
            for (int anInt : ints) {
                System.out.printf("%4d", anInt);
            }
            System.out.println();
        }
    }
}
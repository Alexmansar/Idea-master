package com.alexmansar.homework.lesson10;

import com.alexmansar.helper.HelperArrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NegativeNumbers {
    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int maxValue = 50;
        int minValue = -50;
        HelperArrays.print("Enter number of lines in array");
        int numberLines = HelperArrays.getValue();
        HelperArrays.print("Enter numbers of columns");
        int numberColumns = HelperArrays.getValue();
        int[][] arrays = HelperArrays.generateRandom(numberLines, numberColumns, minValue, maxValue);
        HelperArrays.printDoubleArray(arrays);
        printNegativeNumber(arrays);
    }

    public static void printNegativeNumber(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < 0) {
                    System.out.println("Negative number local in a cell: " + "[" + i + " " + j + "] " + array[i][j]);
                }
            }
        }
    }
}
package com.alexmansar.homework.lesson10;

import com.alexmansar.helper.HelperArrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Transposition {
    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int minValue = 0;
        int maxValue = 10;
        HelperArrays.print("Enter number of lines in array");
        int numberLines = HelperArrays.getValue();
        HelperArrays.print("Enter numbers of columns");
        int numberColumns = HelperArrays.getValue();
        int[][] array = HelperArrays.generateRandom(numberLines, numberColumns, minValue, maxValue);
        int[][] transpositionArray = transposition(array, numberLines, numberColumns);
        HelperArrays.print("Users array");
        HelperArrays.printDoubleArray(array);
        HelperArrays.print("Transposition array");
        HelperArrays.printDoubleArray(transpositionArray);
    }

    public static int[][] transposition(int[][] array, int lines, int columns) {
        int[][] transpositionArray = new int[columns][lines];
        for (int i = 0; i < transpositionArray.length; i++) {
            for (int j = 0; j < transpositionArray[i].length; j++) {
                transpositionArray[i][j] = array[j][i];
            }
        }
        return transpositionArray;
    }
}
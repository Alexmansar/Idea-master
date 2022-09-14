package com.alexmansar.homework.lesson13;

import com.alexmansar.helper.Helper;
import com.alexmansar.helper.HelperArrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ArrayMove {
    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int minValue = 0;
        int maxValue = 50;
        Helper.print("Enter number of array");
        int numberOfArray = Helper.getIntegerValue();
        Helper.print("Enter number to move");
        int numberToMove = Helper.getIntegerValue();
        if (!isValid(numberOfArray, numberToMove)) return;
        int[] array = HelperArrays.generateRandom(numberOfArray, minValue, maxValue);
        Helper.print(Arrays.toString(array) + " This is an original array");
        Helper.print(Arrays.toString(moveToLeft(array, numberOfArray, numberToMove)) + " This is a left shifted array");
        Helper.print(Arrays.toString(moveToRight(array, numberOfArray, numberToMove)) + " This is a right shifted array");
    }

    public static boolean isValid(int numberOfArray, int numberToMove) {
        if (numberOfArray <= numberToMove || numberOfArray <= 0 || numberToMove <= 0) {
            System.out.println("You wrong.Number to move can't be more than number of array have negative value");
            return false;
        }
        return true;
    }


    public static int[] moveToLeft(int[] array, int numberOfArray, int numberToMove) {
        int[] newArray = new int[numberOfArray];
        for (int i = 0; i < array.length; i++) {
            if ((i + numberToMove) < array.length) {
                newArray[i] = array[i + numberToMove];
            } else {
                newArray[i] = array[(i + numberToMove - numberOfArray)];
            }
        }
        return newArray;
    }


    public static int[] moveToRight(int[] array, int numberOfArray, int numberToMove) {
        int[] newArray = new int[numberOfArray];
        for (int i = 0; i < array.length; i++) {
            if ((i - numberToMove + numberOfArray) < array.length) {
                newArray[i] = array[numberOfArray - numberToMove + i];
            } else {
                newArray[i] = array[(i - numberToMove)];
            }
        }
        return newArray;
    }
}
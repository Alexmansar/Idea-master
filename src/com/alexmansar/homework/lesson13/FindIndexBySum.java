package com.alexmansar.homework.lesson13;

import com.alexmansar.helper.Helper;
import com.alexmansar.helper.HelperArrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class FindIndexBySum {
    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int minValue = -10;
        int maxValue = 10;
        Helper.print("Hi, Enter number of array");
        int numberOfArray = Helper.getIntegerValue();
        if (!isValid(numberOfArray))return;
        int[] array = HelperArrays.generateRandom(numberOfArray, minValue, maxValue);
        int[] sortArray = sortArray(array);
        HelperArrays.print(Arrays.toString(sortArray));
        Helper.print("Enter number to find");
        int numberToFind = Helper.getIntegerValue();
        if (isValid(numberToFind, minValue, maxValue)) return;
        findSearchNumber(sortArray, numberToFind);
    }

    public static boolean isValid(int numberToFind, int minValue, int maxValue) {
        if (numberToFind <= 2 * minValue - 1 || numberToFind >= 2 * maxValue + 1) {
            System.out.println("You wrong. You mast entered value from " + minValue + " to " + (2 * maxValue));
        } else {
            return false;
        }
        return true;
    }

    public static boolean isValid(int numberOfArray) {
        if (numberOfArray <= 0) {
            //System.out.println("You wrong. You mast entered value more than 0".Can again);
        }
        return numberOfArray > 0;
    }

    public static void findSearchNumber(int[] array, int numberToSearch) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            int result = numberToSearch - array[i];
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] == result) {
                    count++;
                    System.out.println(count + ") your sum is: " + numberToSearch + ". First index is " + i + ", second index is " + j + "(" + array[i] + "+" + array[j] + ")");
                }
            }
        }
    }

    public static int[] sortArray(int[] array) {
        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < (array.length - i); j++) {
                if (array[j - 1] > array[j]) {
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}
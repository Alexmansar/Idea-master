package com.alexmansar.homework.lesson9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SortNumber {
    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        print("Enter array size");
        int arraySize = getNumber();
        print("Enter " + arraySize + " numbers");
        int[] numbers = fillArray(arraySize);
        print("Enter searching number");
        int checkNumber = getNumber();
        int[] sortNumbers = sortArray(numbers);
        int index = 0;
        int count = 0;
        print("Your array is: " + Arrays.toString(sortNumbers));
        substitutionValue(checkNumber, sortNumbers, index, count);
        print("New arrays with moved value " + Arrays.toString(sortNumbers));
    }

    private static void substitutionValue(int checkNumber, int[] sortNumbers, int index, int count) {
        for (int i = 0; i < sortNumbers.length; i++) {
            if (sortNumbers[i] == checkNumber) {
                index = i;
                count++;
            }
            for (int j = 0; j < count; j++) {
                getNumber(sortNumbers, j, index);
            }
        }
    }

    public static int getNumber() throws IOException {
        return Integer.parseInt(READER.readLine());
    }

    private static int[] sortArray(int[] numbers) {
        int temp = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 1; j < (numbers.length - i); j++) {
                if (numbers[j - 1] > numbers[j]) {
                    temp = numbers[j - 1];
                    numbers[j - 1] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        return numbers;
    }

    public static void getNumber(int[] numbers, int i, int j) {
        int[] numbers2 = Arrays.copyOf(numbers, numbers.length);
        numbers[i] = numbers2[j];
        numbers[j] = numbers2[i];
    }

    public static int[] fillArray(int arraySize) throws IOException {
        int[] numbers = new int[arraySize];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = getNumber();
        }
        return numbers;
    }

    public static void print(String str) {
        System.out.println(str);
    }
}
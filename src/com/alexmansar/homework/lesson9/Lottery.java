package com.alexmansar.homework.lesson9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Lottery {
    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int arraySize = 7;
        int minValue = 0;
        int maxValue = 10;
        System.out.println("Entered "+arraySize+" any numbers");
        int[] sortUserValue = bubbleSort(fillAndCheck(arraySize, minValue, maxValue));
        int[] sortRandomValue = bubbleSort(generateRandom(arraySize, minValue, maxValue));
        print(Arrays.toString(sortRandomValue));
        print(Arrays.toString(sortUserValue));
        System.out.println("Number of coincidences " + separate(sortRandomValue, sortUserValue));
    }

    public static int[] generateRandom(int number, int minValue, int maxValue) {
        int[] numbers = new int[number];
        for (int i = 0; i < numbers.length; i++) {
            int value = (int) (Math.random() * (maxValue - minValue) + minValue);
            numbers[i] = value;
        }
        return numbers;
    }

    public static int[] bubbleSort(int[] number) {
        int temp;
        for (int i = 0; i < number.length; i++) {
            for (int j = 1; j < (number.length - i); j++) {
                if (number[j - 1] > number[j]) {
                    temp = number[j - 1];
                    number[j - 1] = number[j];
                    number[j] = temp;
                }
            }
        }
        return number;
    }

    public static int[] fillAndCheck(int arraySize, int minValue, int maxValue) throws IOException {
        int[] numbers = new int[arraySize];
        for (int i = 0; i < numbers.length; i++) {
            int j = Integer.parseInt(READER.readLine());
            if (check(j, minValue, maxValue)) {
                break;
            }
            numbers[i] = j;
        }
        return numbers;
    }

    public static void print(String str) {
        System.out.println(str);
    }

    public static int separate(int[] array1, int[] array2) {
        int coincidences = 0;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == array2[i]) {
                coincidences = coincidences + 1;
            }
        }
        return coincidences;
    }

    private static boolean check(Integer number, int minValue, int maxValue) {
        if (number < minValue || number >= maxValue) {
            System.out.println("You wrong. Value might by 0 to 10");
            return true;
        }
        return false;
    }
}
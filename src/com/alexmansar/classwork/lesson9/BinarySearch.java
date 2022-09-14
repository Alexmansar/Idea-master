package com.alexmansar.classwork.lesson9;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] numders = {10, 5, 7, 3, 5, 9};
        int search = 10;
        System.out.println(Arrays.toString(numders));
        Arrays.sort(numders);
        System.out.println(Arrays.toString(numders));

        // int index = binarySearch(numders, search);
        int index=Arrays.binarySearch(numders, search);
        if (index<0){
            System.out.println(search+" not found");
        }else {

            System.out.println(search + "found on index " + index);
        }

    }

    private static int search(int[] numders, int search) {
        for (int i = 0; i < numders.length; i++) {
            if (numders[i] == search) {
                return i;
            }

        }
        return -1;
    }

    private static int binarySearch(int[] numbers, int search) {
        int index = -1;
        int low = 0;
        int high = numbers.length - 1;
        while (low <= high) {
            int mid = (low+high) / 2;
            if (numbers[mid] < search) {
                low = mid + 1;
            } else if (numbers[mid] > search) {
                high = mid - 1;
            } else if (numbers[mid] == search) {
                index = mid;
                break;
            }


        }
        return index;
    }
}
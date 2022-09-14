package com.alexmansar.classwork.lesson9;

public class ArraySort {

    public static void main(String[] args) {
        int[] number = new int[100000];

        int temp = 0;
        fill(number);

        long start = System.currentTimeMillis();
     //   bubbleSort(number);
//        Arrays.sort(number);

        long finish = System.currentTimeMillis();
        System.out.println("time: " + (finish - start));

        // System.out.println(Arrays.toString(number));
    }

    public static void fill(int[] number) {
        for (int i = 0; i < number.length; i++) {
            number[i] = (int) (Math.random() * 100);
        }
    }

    public static void bubbleSort(int[] number) {
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
    }

}
package com.alexmansar.classwork.lesson10;

public class Array {
    public static void main(String[] args) {
        int[][] arr = new int[5][5];
        for (int i = 0; i < arr.length; i++) {
            arr[i][i] = 1;
        }
        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < arr[j].length; i++) {
                System.out.print(arr[i][j] + " ");

            }
            System.out.println();
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i==j){
                    arr[i][j]=1;
                }System.out.print(arr[i][j] + " ");


            }System.out.println();

        }

    }
}

package com.alexmansar.homework.lesson7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CarWash1 {
    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int dirtyCar = getCarNumber();
        check(dirtyCar);
        for (int i = 1; i <=dirtyCar; i++) {
            washCar(i);
            latherCar(i);
            dryCar(i);
        }
        System.out.println("Congratulation, all cars is clear!");
    }

    public static int getCarNumber() throws IOException {
        System.out.println("Enter numbers of cars");
        return Integer.parseInt(READER.readLine());
    }

    public static void latherCar(int car) {
        System.out.println("Soap the car № " + car);
    }

    public static void washCar(int car) {
        System.out.println("Wash the car № " + car);
    }

    public static void dryCar(int car) {
        System.out.println("Dry the car № " + car);
    }

    public static void check(int car) { //проводим валидацию входного значения
        if (car > 0) {
            //boolean b = true;
        } else System.out.println("You wrong. Number of cars Value might by more than 0 ");
    }
}
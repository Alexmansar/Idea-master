package com.alexmansar.classwork.lesson4;

public class Methods {
    public static void main(String[] args) {
        // тут не создаем метода
        printMessage();
        int number = generateRandom();
        System.out.println(number);
        int randomInt = generateRandom(18, 50);
        System.out.println(randomInt);
    }

    //тут можно
    public static void printMessage() {
        System.out.println("message");
    }

    public static int generateRandom() {
        return (int) (Math.random() * 100);
    }

    public static int generateRandom(int min, int max) {
        return (int) (Math.random() * (max - min) + min);
    }
}
//тут нельзя
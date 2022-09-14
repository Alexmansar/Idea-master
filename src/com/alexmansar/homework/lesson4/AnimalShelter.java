package com.alexmansar.homework.lesson4;

public class AnimalShelter {
    public static void main(String[] args) {
        int dog = 24;
        int cat = 8;
        int coast = 2;
        int period = 30;
        int amount = 3;
        int weight = 50;
        int cats = animal(cat, coast, period, amount);
        int dogs = animal(dog, coast, period, amount);
        int catfeed = feed(cat, weight, period, amount);
        int dotffed = feed(dog, weight, period, amount);
        System.out.println("cat=" + cats + ("$/m"));
        System.out.println("dog=" + dogs + ("$/m"));
        System.out.println("sum=" + (cats + dogs) + ("$/m"));
        System.out.println("cat=" + catfeed + ("g/m"));
        System.out.println("dog+" + dotffed + ("g/m"));
        System.out.println("sum=" + (catfeed + dotffed) + ("g/m"));
    }

    public static int animal(int animal, int coast, int period, int amount) {
        return animal * coast * period * amount;
    }

    public static int feed(int animal, int weight, int period, int amount) {
        return animal * weight * period * amount;


    }
}
